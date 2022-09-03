package edu.utp.service.movie.controller;

import edu.utp.service.movie.model.Pelicula;
import edu.utp.service.movie.model.Usuario;
import edu.utp.service.movie.repository.UsuarioRepository;
import edu.utp.service.movie.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
//@CrossOrigin
//@RequestMapping("/api/usuarios")
public class ControladorUsuario {

    @Autowired
    private UsuarioService usuarioService;

    //@GetMapping("/Login")
    public String login(Model model){
        var usuarios= usuarioService.listarUsuarios();
        model.addAttribute("usuarios",usuarios);
        return "auth/login";
    }
    //@GetMapping("/registrar")
    public String register(Model model){

        return "auth/createUser";
    }

    @PostMapping("/usuario/crear")
    public String crearPelicula(Usuario usuario){
        usuarioService.guardar(usuario);
        return "redirect:/";
    }
    @GetMapping("/usuario/agregar")
    public String agregar(Usuario usuario){
        return "auth/createUser";
    }

}
