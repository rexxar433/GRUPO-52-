package edu.utp.service.movie.service;


import edu.utp.service.movie.model.Genero;

import java.util.List;

public interface GeneroService {
    public List<Genero> listarGeneros();

    public Genero guardar(Genero genero);

    public void eliminar(Genero genero);

    public Genero buscar(Long id);
}
