package edu.utp.service.movie.repository;

import edu.utp.service.movie.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario,Long> {

}
