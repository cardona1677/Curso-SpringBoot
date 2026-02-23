package com.curso.springboot.app1.springboot_aplication.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarrosDTO {

    private Long id;
    private String marca;
    private String modelo;
    private int año;
    private String apodo;

}
