package edu.utp.service.movie.repository;

import edu.utp.service.movie.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepository extends JpaRepository<Genero,Long> {
}
