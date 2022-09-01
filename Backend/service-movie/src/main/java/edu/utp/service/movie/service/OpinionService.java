package edu.utp.service.movie.service;

import edu.utp.service.movie.model.Opinion;

import java.util.List;

public interface OpinionService {
    public List<Opinion> listarOpiniones();

    public void guardar(Opinion opinion);

    public void eliminar(Opinion opinion);

    public Opinion buscar(Long id);
}
