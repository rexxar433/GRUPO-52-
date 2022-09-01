package edu.utp.service.movie.repository;

import edu.utp.service.movie.model.Opinion;
import org.springframework.data.repository.CrudRepository;

public interface OpinionRepository extends CrudRepository<Opinion,Long> {
}
