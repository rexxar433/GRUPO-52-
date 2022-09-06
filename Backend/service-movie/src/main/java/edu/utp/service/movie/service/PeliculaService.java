package edu.utp.service.movie.service;

import edu.utp.service.movie.model.Pelicula;

import java.util.List;

public interface PeliculaService {
    public List<Pelicula> listarPeliculas();

    public Pelicula guardar(Pelicula pelicula);

    public void eliminar(Pelicula pelicula);

    public Pelicula buscar(Long id);

    public List<Pelicula> findByTitulo(String titulo);

    public List<Pelicula> findByArgumento(String argumento);
}
