/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ivangarciaportfolio.demo.security.service;

import com.ivangarciaportfolio.demo.security.entity.Usuario;
import com.ivangarciaportfolio.demo.security.repository.InUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ivang
 */
@Service
@Transactional
public class UsuarioService {
    @Autowired
    InUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){ //comprueba si existe el nombre de usuario
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){ // si existe el mail
        return iusuarioRepository.existsByEmail(email);
    }
    
    public void save(Usuario usuario){ //guardar usuario nuevo
        iusuarioRepository.save(usuario);
    }
}