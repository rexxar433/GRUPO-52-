package edu.utp.service.movie.repository;

import edu.utp.service.movie.model.Clasificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasificacionRepository extends JpaRepository<Clasificacion,Long> {
}
