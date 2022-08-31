package edu.utp.service.movie.controller;

import edu.utp.service.movie.repository.PeliculaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ContradorInicio {

    @Autowired
    private PeliculaRepository peliculaRepository;

    @GetMapping("/")
    public String inicio(Model model){
        var peliculas=peliculaRepository.findAll();
        model.addAttribute("peliculas",peliculas);
        return "index";
    }
}
