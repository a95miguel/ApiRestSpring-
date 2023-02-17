package com.Controller;

import com.Etities.Lapto;
import com.Repository.LaptopRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
    private LaptopRepository laptopReposity;

    public LaptopController(LaptopRepository laptopReposity) {
        this.laptopReposity = laptopReposity;
    }
    //Muestra todos los datos de lapto
    @GetMapping("/api/laptop")
    public List<Lapto> findAll(){
        return laptopReposity.findAll();
    }
    //Aguarda los datos de dapto
    @PostMapping("/api/laptop")
    public Lapto create(@RequestBody Lapto lapto){
        return laptopReposity.save(lapto);
    }
}
