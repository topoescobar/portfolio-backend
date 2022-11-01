
package com.ivangarciaportfolio.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;


@Entity //le decimos a la base de datos que es una entidad
public class Persona {
    @Id  //@Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private Long id;
    
    @NotNull @Size(min = 1,  max = 50, message = "min 1 y max 50 caracteres")
    @Getter @Setter
    private String nombre;
   
    @NotNull @Size(min = 1,  max = 50, message = "min 1 y max 50 caracteres")
    @Getter @Setter
    private String apellido;    
    
    @Getter @Setter
    private String img;
    
    @Getter @Setter
    private String dni;
    
    
}
