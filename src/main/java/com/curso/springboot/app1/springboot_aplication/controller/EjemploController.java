package com.curso.springboot.app1.springboot_aplication.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.curso.springboot.app1.springboot_aplication.models.Carros;


@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model) {
        Carros carro2 = new Carros(2L, "Chevrolet", "Nova", 1971, null);
        model.addAttribute("Carro", carro2);
        return "detalles_info";
    }

    @ModelAttribute("carros")
    public List<Carros> ListaCarros(){
        return Arrays.asList(
            new Carros(3L, "Chevrolet", "Camaro", 2005, "Fireball Camaro"),
            new Carros(4L, "Ford", "Mustang", 1986, "Death Trap"),
            new Carros(5L, "Pontiac", "GTO", 1976, "The Crow")
        );
    }

}
