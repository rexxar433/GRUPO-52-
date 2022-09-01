package edu.utp.service.movie.controller;

import edu.utp.service.movie.service.PeliculaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ContraladorInicio {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/")
    public String inicio(Model model){
        var peliculas=peliculaService.listarPeliculas();
        model.addAttribute("peliculas",peliculas);
        return "index";
    }

}
