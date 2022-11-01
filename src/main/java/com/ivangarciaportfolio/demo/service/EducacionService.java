package com.ivangarciaportfolio.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ivangarciaportfolio.demo.entity.Educacion;
import com.ivangarciaportfolio.demo.repository.RepoEducacion;

@Service @Transactional
public class EducacionService {
    @Autowired
    RepoEducacion repoEducacion;

    public List<Educacion> list(){
        return repoEducacion.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return repoEducacion.findById(id);
    }
    
    public Optional<Educacion> getByNmbreE(String nombreEdu){
        return repoEducacion.findByNombreEdu(nombreEdu);
    }
    
    public void save(Educacion educacion){
        repoEducacion.save(educacion);
    }
    
    public void delete(int id){
        repoEducacion.deleteById(id);
    }
    
    public boolean existsById(int id){
        return repoEducacion.existsById(id);
    }
    
    public boolean existsBynombreEdu(String nombreEdu){
        return repoEducacion.existsByNombreEdu(nombreEdu);
    }

}
