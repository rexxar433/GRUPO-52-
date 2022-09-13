package edu.utp.service.movie.controller;

import edu.utp.service.movie.service.ClasificacionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@CrossOrigin
@RequestMapping("/api/clasificacion")
public class ControladorClasificacion {

    @Autowired
    private ClasificacionService clasificacionService;

    @GetMapping("/")
    public String listarClasificacion(Model model){
        var clasificaciones = clasificacionService.listarClasificaciones();
        model.addAttribute("clasificaciones",clasificaciones);
        return "admin/Clasificaciones";
    }
}
