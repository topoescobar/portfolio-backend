
package com.ivangarciaportfolio.demo.repository;

import com.ivangarciaportfolio.demo.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InPersonaRepository extends JpaRepository<Persona,Long>{ 
    
}
