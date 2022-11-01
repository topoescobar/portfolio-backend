/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ivangarciaportfolio.demo.service;

import com.ivangarciaportfolio.demo.entity.Experiencia;
import com.ivangarciaportfolio.demo.repository.RepoExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service @Transactional
public class ExperienciaService {
   @Autowired
   RepoExperiencia repoExperiencia;
   
   public List<Experiencia> list() {
       return repoExperiencia.findAll(); //arma una lista con las experiencias
   }
   
   public Optional<Experiencia> getOne(int id){
       return repoExperiencia.findById(id);
   }
   
   public Optional<Experiencia> getByNombreExp(String nombreExp) {
       return repoExperiencia.findByNombreExp(nombreExp);
   }
   
   public void save(Experiencia exp) {
       repoExperiencia.save(exp);
   }
   
   public void delete(int id){
       repoExperiencia.deleteById(id);
   }
   
   public boolean existsById(int id){
       return repoExperiencia.existsById(id);
   }
   
   public boolean existsByNombreExp(String nombreExp){
       return repoExperiencia.existsByNombreExp(nombreExp);
   }
}
