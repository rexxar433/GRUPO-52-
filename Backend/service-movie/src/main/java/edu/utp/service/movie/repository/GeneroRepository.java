package edu.utp.service.movie.repository;

import edu.utp.service.movie.model.Genero;
import org.springframework.data.repository.CrudRepository;

public interface GeneroRepository extends CrudRepository<Genero,Long> {
}
