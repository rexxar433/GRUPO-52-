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

    //@GetMapping("/Login")
    public String login(Model model){
        var usuarios= usuarioService.listarUsuarios();
        model.addAttribute("usuarios",usuarios);
        return "auth/login";
    }
    @GetMapping("/registrar")
    public String register(Usuario usuario){

        return "auth/createUser";
    }

    @PostMapping("/crear")
    public String crearPelicula(@Valid Usuario usuario, Errors errores){
        /*if(errores.hasErrors()){
            return "auth/createUser";
        }else{*/
            usuarioService.guardar(usuario);
            Rol rol=rolService.buscar(2);
            log.info("Informacion del usuario");
            usuario.setId((long)6);
            usuario.setRol(rol);

            log.info(String.valueOf(usuario.getId()));
            log.info(usuario.getPrimerNombre());
            log.info(usuario.getPrimerApellido());
            log.info(usuario.getEmail());
            log.info(usuario.getContrasena());
            log.info(String.valueOf(usuario.getRol().getId()));
            log.info(String.valueOf(usuario.getRol().getRole()));

            return "redirect:/";
        //}
    }
    @GetMapping("/agregar")
    public String agregar(Usuario usuario){
        return "auth/createUser";
    }

}
