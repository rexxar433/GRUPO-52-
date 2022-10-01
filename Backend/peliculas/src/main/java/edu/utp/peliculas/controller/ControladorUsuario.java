package edu.utp.peliculas.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class ControladorUsuario {




    @GetMapping("/prueba")
    public String prueba(){
        return "error/Template403";
    }
}
