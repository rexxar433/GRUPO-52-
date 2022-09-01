package edu.utp.service.movie.service.impl;

import edu.utp.service.movie.model.Usuario;
import edu.utp.service.movie.repository.PeliculaRepository;
import edu.utp.service.movie.repository.UsuarioRepository;
import edu.utp.service.movie.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    @Transactional
    public void guardar(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    @Transactional
    public void eliminar(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario buscar(Usuario usuario) {
        return usuarioRepository.findById(usuario.getId()).orElse(null);
    }
}
