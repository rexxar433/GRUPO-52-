package edu.utp.service.movie.repository;

import edu.utp.service.movie.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PeliculaRepository extends JpaRepository<Pelicula,Long> {

    @Query(value = "select * from pelicula a where a.titulo= :titulo", nativeQuery = true)
    public List<Pelicula> findByTitulo(String titulo);

    @Query(value = "select * from pelicula a where a.argumento= :argumento", nativeQuery = true)
    public List<Pelicula> findByArgumento(String argumento);

    //@Query(value = "select * from pelicula a where a.argumento= :argumento", nativeQuery = true)
    //public Optional<Object> findById(Long id);


}
