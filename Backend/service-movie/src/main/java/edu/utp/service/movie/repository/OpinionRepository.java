package edu.utp.service.movie.repository;

import edu.utp.service.movie.model.Opinion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpinionRepository extends JpaRepository<Opinion,Long> {
}
