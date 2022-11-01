
package com.ivangarciaportfolio.demo.interface0;

import com.ivangarciaportfolio.demo.entity.Persona;
import java.util.List;


public interface InPersonaService {
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
}
