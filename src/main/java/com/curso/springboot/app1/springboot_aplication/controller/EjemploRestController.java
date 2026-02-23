package com.curso.springboot.app1.springboot_aplication.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.app1.springboot_aplication.models.Carros;
import com.curso.springboot.app1.springboot_aplication.models.dto.CarrosDTO;


@RestController
@RequestMapping("/api")
public class EjemploRestController {
    Carros carro1 = new Carros(1L, "Chevrolet", "Nova", 1969, "Goliath 2.0");

    @GetMapping("/detalles_info2")
    public Map<String, Object> detalles_info2() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Titulo", "Drag Racing Details");
        respuesta.put("Carro", carro1);
        respuesta.put("Descripcion", "Drag racing es una forma de competición automovilística en la que dos vehículos compiten en una carrera de aceleración en línea recta, generalmente en una pista de un cuarto de milla (402 metros). El objetivo es llegar a la meta lo más rápido posible, y el ganador es el que cruza la línea de meta primero. El drag racing se caracteriza por su alta velocidad y la emoción que genera entre los espectadores.");
        respuesta.put("Imagen", "https://dragillustrated.com/wp-content/uploads/2024/11/PDRA-schedule_Tara-Bowker-photo_DI-web-1024x576.jpg");
        return respuesta;
    }

    @GetMapping("/detalles_info3")
    public CarrosDTO detalles_info3() {
        CarrosDTO carroDTO = new CarrosDTO();
        carroDTO.setId(1L);
        carroDTO.setMarca("Chevrolet");
        carroDTO.setModelo("Nova");
        carroDTO.setAño(1969);
        carroDTO.setApodo("Muerder Nova");
        return carroDTO;
    }

}
