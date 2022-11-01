
package com.ivangarciaportfolio.demo.service;

import com.ivangarciaportfolio.demo.entity.Persona;
import com.ivangarciaportfolio.demo.interface0.InPersonaService;
import com.ivangarciaportfolio.demo.repository.InPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements InPersonaService {
    @Autowired InPersonaRepository interfazPersonaRepo;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = interfazPersonaRepo.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        interfazPersonaRepo.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        interfazPersonaRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = interfazPersonaRepo.findById(id).orElse(null);
        return persona;
    }
    
}
