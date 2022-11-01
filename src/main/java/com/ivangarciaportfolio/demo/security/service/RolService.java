/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ivangarciaportfolio.demo.security.service;

import com.ivangarciaportfolio.demo.security.entity.Rol;
import com.ivangarciaportfolio.demo.security.enums.RolNombre;
import com.ivangarciaportfolio.demo.security.repository.InRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional //mantiene la persistencia, gestion de operaciones fallidas,etc
public class RolService {
    @Autowired
    InRolRepository interRolRepo;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return interRolRepo.findByRolNombre(rolNombre);
        
    }
    
    public void save(Rol rol) {
        interRolRepo.save(rol);
    }
}
