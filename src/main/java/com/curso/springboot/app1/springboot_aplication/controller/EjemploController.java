package com.curso.springboot.app1.springboot_aplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.curso.springboot.app1.springboot_aplication.models.Carros;


@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model) {
        Carros carro2 = new Carros(2L, "Chevrolet", "Nova", 1971, null);
        model.addAttribute("Carro", carro2);
        return "detalles_info";
    }

}
