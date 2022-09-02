package edu.utp.service.movie.repository;

import edu.utp.service.movie.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
