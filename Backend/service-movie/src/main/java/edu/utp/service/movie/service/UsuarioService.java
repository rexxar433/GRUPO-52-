package edu.utp.service.movie.service;

import edu.utp.service.movie.model.Usuario;

import java.util.List;

public interface UsuarioService {
    public List<Usuario> listarUsuarios();

    public void guardar(Usuario usuario);

    public void eliminar(Usuario usuario);

    public Usuario buscar(Usuario usuario);
}
