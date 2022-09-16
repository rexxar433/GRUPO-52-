package edu.utp.service.movie.service.impl;

import edu.utp.service.movie.model.Rol;
import edu.utp.service.movie.model.Usuario;
import edu.utp.service.movie.repository.RolRepository;
import edu.utp.service.movie.repository.UsuarioRepository;
import edu.utp.service.movie.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

public class UserService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByUsername(username);
        String userRol=usuario.getRol().getRole();

        if(usuario == null){
            throw new UsernameNotFoundException(username);
        }

        var role = new ArrayList<GrantedAuthority>();
        role.add(new SimpleGrantedAuthority(userRol));

        return new User(usuario.getEmail(), usuario.getContrasena(),role);
    }
}
