package com.Controller;

import com.Etities.Lapto;
import com.Repository.LaptopRepository;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
    private final Logger log = LoggerFactory.getLogger(LaptopController.class);
    private LaptopRepository laptopReposity;

    public LaptopController(LaptopRepository laptopReposity) {
        this.laptopReposity = laptopReposity;
    }
    //Muestra todos los datos de lapto
    @GetMapping("/api/laptop")
    public List<Lapto> findAll(){
        return laptopReposity.findAll();
    }
    //Mostrar datos por id
    @GetMapping("/api/laptop/{id}")
    public ResponseEntity<Lapto> findOneById(@PathVariable Long id){
        Optional<Lapto> laptopOpt =laptopReposity.findById(id);
        if(laptopOpt.isPresent()){
            return ResponseEntity.ok(laptopOpt.get());
        }
        else return ResponseEntity.notFound().build();
    }
    //Guarda los datos de dapto
    @PostMapping("/api/laptop")
    public ResponseEntity<Lapto> create(@RequestBody Lapto lapto){
        if(lapto.getId()!=null){//Existe el id y por lo tanto ya no lo puede crear
            log.warn("Trying to create a laptop with id ");
            return ResponseEntity.badRequest().build();
        }
        Lapto res = laptopReposity.save(lapto);
        return ResponseEntity.ok(res);
    }
    //Actualizar dato de laptop
    @PutMapping("/api/laptop")
    public ResponseEntity<Lapto> update(@RequestBody Lapto lapto){
        if(lapto.getId()==null){//Existe el id y por lo tanto ya no lo puede crear
            log.warn("Trying to update a laptop with id ");
            return ResponseEntity.badRequest().build();
        }
        if(!laptopReposity.existsById(lapto.getId())){
           log.warn("Trying to update a non existents laptop ");
            return ResponseEntity.notFound().build();
        }
        Lapto res = laptopReposity.save(lapto);
        return ResponseEntity.ok(res);
    }
    //Borrar por id 
    @DeleteMapping("/api/laptop/{id}")
    public ResponseEntity<Lapto>delete(@PathVariable Long id){
        if(!laptopReposity.existsById(id)){
           log.warn("Trying to delete a non existents laptop ");
            return ResponseEntity.notFound().build();
        }
        laptopReposity.deleteById(id);
        return ResponseEntity.noContent().build();        
    }
    //Borrar los datos de la table 
    @DeleteMapping("/api/laptop")
    public ResponseEntity<Lapto> deleteAll(){
        laptopReposity.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
