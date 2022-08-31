package edu.utp.service.movie.controller;

import edu.utp.service.movie.repository.UsuarioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorUsuario {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/Login")
    public String login(Model model){
        var usuarios= usuarioRepository.findAll();
        model.addAttribute("usuarios",usuarios);
        return "Login";
    }
    @GetMapping("/registrar")
    public String register(Model model){

        return "CreateUser";
    }

}
