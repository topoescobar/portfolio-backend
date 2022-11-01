package com.ivangarciaportfolio.demo.controller;

import com.ivangarciaportfolio.demo.entity.Persona;
import com.ivangarciaportfolio.demo.interface0.InPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:4200") //para comunicarse con el localhost sin error de CORS
@CrossOrigin(origins = "https://ivangarcia-portfolioap.web.app")
public class PersonaController {
    @Autowired InPersonaService inPersonaService;
    
    @GetMapping("/personas/traer")//endpoint
    public List<Persona> getPersona() {
        return inPersonaService.getPersona();
    }
    
    @PreAuthorize("hasRole('ADMIN')")// autorizacion para usuario logueado con rol admin, crear los roles previamente en la BD, tabla rol
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona) {
        inPersonaService.savePersona(persona);
        return "Persona creada";
    }
    
    @PreAuthorize("hasRole('ADMIN')")   
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        inPersonaService.deletePersona(id);
        return "Persona borrada";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id, 
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("dni") String nuevoDNI,
            @RequestParam("img") String nuevaImg) {
        Persona persona = inPersonaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setDni(nuevoDNI);
        persona.setImg(nuevaImg);
        
        inPersonaService.savePersona(persona);
        return persona;
    }
    
    @GetMapping("/personas/traer/perfil/")
    public Persona findPersona(){
        return inPersonaService.findPersona((long)1);
    }
    
}
