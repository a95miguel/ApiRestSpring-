package com;

import com.Etities.Lapto;
import com.Repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringApiRestApplication {

	public static void main(String[] args) {
		    ApplicationContext context  = SpringApplication.run(ObSpringApiRestApplication.class, args);
                    LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);
                    Lapto HUAWEI = new Lapto(null,"HUAWEI Matebook 16", 14999.00, 16, "AMD Ryzen 5 5600H ", 512, 16);
                    Lapto Gateway = new Lapto(null,"Gateway Laptop ultradelgada", 7120.00, 8, "Procesador AMD Ryzen 7 3700U c ", 512, 15);
                    Lapto hp = new Lapto(null,"HP Laptop 15-ef1501la", 6899.00, 8, "AMD Athlon Silver 3050U ", 256, 15);
                    Lapto lenovo = new Lapto(null,"Lenovo Laptop 14", 4399.00, 4, "Intel Pentium Silver N5030 ", 128 , 14);                    
                    laptopRepository.save(HUAWEI);
                    laptopRepository.save(Gateway);
                    laptopRepository.save(hp);
                    laptopRepository.save(lenovo);
                    
                    //System.out.println(laptopRepository.count());
	}

}
