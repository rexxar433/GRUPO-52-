package edu.utp.peliculas.controller;

import edu.utp.peliculas.service.GeneroService;
import edu.utp.peliculas.service.OpinionService;
import edu.utp.peliculas.service.PeliculaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class ControladorPelicula {

    @Autowired
    private GeneroService generoService;
    @Autowired
    private PeliculaService peliculaService;
    @Autowired
    private OpinionService opinionService;



}
