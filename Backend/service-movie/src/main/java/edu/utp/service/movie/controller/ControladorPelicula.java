package edu.utp.service.movie.controller;

import edu.utp.service.movie.service.PeliculaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Slf4j
public class ControladorPelicula {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/pelicula/{id}")
    public String buscarPelicula(Model model,@PathVariable Long id){
        var pelicula=peliculaService.buscar(id);
        if(pelicula==null){
            log.info("No existe la pelicula");
            model.addAttribute("titulo","No existe");
        }else {
            model.addAttribute("titulo",pelicula.getTitulo());
            model.addAttribute("pelicula", pelicula);
        }
        return "movie/pelicula";
    }
}
