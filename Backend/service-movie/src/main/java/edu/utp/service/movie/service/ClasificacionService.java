package edu.utp.service.movie.service;

import edu.utp.service.movie.model.Clasificacion;

import java.util.List;

public interface ClasificacionService {
    public List<Clasificacion> listarClasificaciones();

    public Clasificacion buscar(Long id);
}
