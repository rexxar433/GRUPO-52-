package edu.utp.service.movie.controller;

import edu.utp.service.movie.model.Genero;
import edu.utp.service.movie.model.Pelicula;
import edu.utp.service.movie.service.GeneroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
@CrossOrigin
@RequestMapping("/api/genero")
public class ControladorGenero {


    @Autowired
    private GeneroService generoService;
    @GetMapping("/")
    public List<Genero> listarGenero(){
        return generoService.listarGeneros();
    }

    @PostMapping("/")
    public Genero crearGenero(@RequestBody Genero genero){
        return generoService.guardar(genero);
    }

}
