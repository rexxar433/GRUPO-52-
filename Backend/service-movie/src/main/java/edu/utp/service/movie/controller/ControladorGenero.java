package edu.utp.service.movie.controller;

import edu.utp.service.movie.service.GeneroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@Slf4j
@CrossOrigin
@RequestMapping("/api/genero")
public class ControladorGenero {


    @Autowired
    private GeneroService generoService;
    @GetMapping("/")
    public String listarGeneros(Model model){
        var generos= generoService.listarGeneros();
        model.addAttribute("generos",generos);
        return "admin/generos";
    }


}
