package edu.utp.service.movie.controller;

import edu.utp.service.movie.model.Genero;
import edu.utp.service.movie.model.Opinion;
import edu.utp.service.movie.service.OpinionService;
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

    @GetMapping("/")
    public List<Opinion> listarGenero(){
        return opinionService.listarOpiniones();
    }

    @PostMapping("/")
    public Opinion crearGenero(@RequestBody Opinion opinion){
        return opinionService.guardar(opinion);
    }
}
