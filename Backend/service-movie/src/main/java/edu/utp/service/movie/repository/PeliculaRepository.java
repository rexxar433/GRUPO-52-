package edu.utp.service.movie.repository;

import edu.utp.service.movie.model.Pelicula;
import org.springframework.data.repository.CrudRepository;

public interface PeliculaRepository extends CrudRepository<Pelicula,Long> {

}
