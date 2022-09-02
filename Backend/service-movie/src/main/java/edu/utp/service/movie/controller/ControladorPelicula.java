package edu.utp.service.movie.controller;

import edu.utp.service.movie.service.PeliculaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
//@CrossOrigin
//@RequestMapping("/api/peliculas")
public class ControladorPelicula {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/{id}")
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

    @GetMapping("/titulo/{titulo}")
    public String buscarPeliculaTitulo(Model model,@PathVariable String titulo){
        var peliculas=peliculaService.findByTitulo(titulo);
        if(peliculas.isEmpty()){
            log.info(peliculas.toString());
        }else {
            model.addAttribute("peliculas", peliculas);
        }
        return "index";
    }
}
