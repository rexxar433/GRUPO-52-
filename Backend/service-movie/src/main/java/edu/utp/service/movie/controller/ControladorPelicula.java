package edu.utp.service.movie.controller;

import edu.utp.service.movie.model.Genero;
import edu.utp.service.movie.model.Pelicula;
import edu.utp.service.movie.model.Rol;
import edu.utp.service.movie.model.Usuario;
import edu.utp.service.movie.service.ClasificacionService;
import edu.utp.service.movie.service.GeneroService;
import edu.utp.service.movie.service.PeliculaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@Slf4j
@CrossOrigin
@RequestMapping("/api/pelicula")
public class ControladorPelicula {

    @Autowired
    private PeliculaService peliculaService;

    @Autowired
    private ClasificacionService clasificacionService;

    @Autowired
    private GeneroService generoService;

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
    public String buscarPeliculaTitulo(@PathVariable String titulo,Model model){
        var peliculas=peliculaService.findByTitulo(titulo);
        if(peliculas.isEmpty()){
            // Colocar error
        }else {
          model.addAttribute("peliculas", peliculas);
        }
        return "movie/index";
    }

    @GetMapping("/clasificacion/{clasificacion}")
    public String buscarPeliculaClasificacion(@PathVariable String clasificacion,Model model){
        var peliculas=peliculaService.findByClasificacion(clasificacion);
        if(peliculas.isEmpty()){
            // Colocar error
        }else {
            model.addAttribute("peliculas", peliculas);
        }
        return "movie/index";
    }

    @GetMapping("/genero/{genero}")
    public String buscarPeliculaGenero(@PathVariable String genero,Model model){
        var peliculas=peliculaService.findByGenero(genero);
        if(peliculas.isEmpty()){
            // Colocar error
        }else {
            model.addAttribute("peliculas", peliculas);
        }
        return "movie/index";
    }

    @GetMapping("/argumento/{argumento}")
    public String argumento(@PathVariable String argumento,Model model){
        var peliculas=peliculaService.findByArgumento(argumento);
        if(peliculas.isEmpty()){
            // Colocar error
        }else {
            model.addAttribute("peliculas", peliculas);
        }
        return "movie/index";

    }

    @PostMapping("/crear")
    public String crearPelicula(@Valid Pelicula pelicula, Errors errores){
        if(errores.hasErrors()){
            return "auth/createUser";
        }else{
            agregarGeneros(pelicula.getId(),(long)2);
            peliculaService.guardar(pelicula);
            return "redirect:/";
        }
    }

    @GetMapping("/agregar")
    public String agregar(Pelicula pelicula){
        return "movie/createPelicula";
    }


    public void agregarGeneros(Long pelicula_id,Long genero_id){
        //peliculaService.agregarGeneros(pelicula_id,genero_id);
    }


}
