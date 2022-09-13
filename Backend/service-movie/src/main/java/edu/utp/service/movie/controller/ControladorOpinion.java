package edu.utp.service.movie.controller;

import edu.utp.service.movie.model.Opinion;
import edu.utp.service.movie.service.OpinionService;
import edu.utp.service.movie.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/api/opinion")
public class ControladorOpinion {
    @Autowired
    private OpinionService opinionService;

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/")
    public List<Opinion> listarGenero(){
        return opinionService.listarOpiniones();
    }

    @PostMapping("/{id}")
    public String crearOpinion(@RequestBody Opinion opinion,@PathVariable Long id){
        var pelicula=peliculaService.buscar(id);
        opinion.setPelicula(pelicula);
        //opinion.setUsuario(usuario);
        opinionService.guardar(opinion);
        return "redirect:movie/pelicula";
    }
}
