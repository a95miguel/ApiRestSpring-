package com.Repository;

import com.Etities.Lapto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Lapto, Long>{

}
