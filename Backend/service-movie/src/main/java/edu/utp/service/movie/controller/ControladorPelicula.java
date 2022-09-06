package edu.utp.service.movie.controller;

import edu.utp.service.movie.model.Pelicula;
import edu.utp.service.movie.service.PeliculaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
@CrossOrigin
@RequestMapping("/api/pelicula")
public class ControladorPelicula {

    @Autowired
    private PeliculaService peliculaService;


    /*@GetMapping("/")
    public List<Pelicula> listarPeliculas(){
        return peliculaService.listarPeliculas();
    }

    @PostMapping("/")
    public Pelicula crearPelicula(@RequestBody Pelicula pelicula){
        return peliculaService.guardar(pelicula);
    }*/

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
    public ResponseEntity<List> buscarPeliculaTitulo(@PathVariable String titulo){
        var peliculas=peliculaService.findByTitulo(titulo);
        if(peliculas.isEmpty()){
            log.info(peliculas.toString());
        }else {
          // model.addAttribute("peliculas", peliculas);
        }
        return ResponseEntity.badRequest().body(peliculas);
    }
    @PostMapping("/crear")
    public String crearPelicula(@RequestBody Pelicula pelicula){
        peliculaService.guardar(pelicula);
        return "redirect:/";
    }
    @GetMapping("/agregar")
    public String agregar(Pelicula pelicula){
        return "movie/createPelicula";
    }


}
