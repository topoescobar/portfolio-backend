package com.ivangarciaportfolio.demo.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
public class DtoEducacion {
    @NotBlank
    @Getter @Setter
    private String nombreEdu;

    @NotBlank
    @Getter @Setter
    private String descripcionEdu;

}
