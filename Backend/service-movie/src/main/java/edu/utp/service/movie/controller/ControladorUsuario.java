package edu.utp.service.movie.controller;

import edu.utp.service.movie.model.Pelicula;
import edu.utp.service.movie.model.Rol;
import edu.utp.service.movie.model.Usuario;
import edu.utp.service.movie.repository.UsuarioRepository;
import edu.utp.service.movie.service.RolService;
import edu.utp.service.movie.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@Slf4j
@CrossOrigin
@RequestMapping("/api/usuario")
public class ControladorUsuario {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private RolService rolService;

    @GetMapping("/")
    public String listarUsuarios(Model model){
        var usuarios= usuarioService.listarUsuarios();
        model.addAttribute("usuarios",usuarios);
        return "admin/Usuarios";
    }

    @GetMapping("/registrar")
    public String register(Usuario usuario){

        return "auth/createUser";
    }

    @PostMapping("/crear")
    public String crearUsuario(@Valid Usuario usuario, Errors errores){
        if(errores.hasErrors()){
            return "auth/createUser";
        }else{
            Rol rol=rolService.buscar(2);
            usuario.setRol(rol);
            usuarioService.guardar(usuario);
            return "redirect:/";
        }
    }
    @GetMapping("/agregar")
    public String agregar(Usuario usuario){
        return "auth/createUser";
    }

    @GetMapping("/eliminar")
    public String eliminar(Usuario usuario){
        usuarioService.eliminar(usuario);
        return "redirect:/api/usuario/";
    }
}
