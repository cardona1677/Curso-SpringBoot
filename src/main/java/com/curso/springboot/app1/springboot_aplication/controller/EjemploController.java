package com.curso.springboot.app1.springboot_aplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model) {
        model.addAttribute("Titulo", "Drag Racing Details");
        model.addAttribute("Descripcion", "Drag racing es una forma de competición automovilística en la que dos vehículos compiten en una carrera de aceleración en línea recta, generalmente en una pista de un cuarto de milla (402 metros). El objetivo es llegar a la meta lo más rápido posible, y el ganador es el que cruza la línea de meta primero. El drag racing se caracteriza por su alta velocidad y la emoción que genera entre los espectadores.");
        model.addAttribute("Imagen", "https://dragillustrated.com/wp-content/uploads/2024/11/PDRA-schedule_Tara-Bowker-photo_DI-web-1024x576.jpg");
        return "detalles_info";
    }

}
