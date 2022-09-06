package edu.utp.service.movie.service.impl;

import edu.utp.service.movie.model.Pelicula;
import edu.utp.service.movie.repository.PeliculaRepository;
import edu.utp.service.movie.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PeliculaServiceImpl implements PeliculaService {

    @Autowired
    private PeliculaRepository peliculaRepository;
    @Override
    @Transactional(readOnly = true)
    public List<Pelicula> listarPeliculas() {
        return (List<Pelicula>) peliculaRepository.findAll();
    }

    @Override
    @Transactional
    public Pelicula guardar(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    @Override
    @Transactional
    public void eliminar(Pelicula pelicula) {
        peliculaRepository.delete(pelicula);
    }

    @Override
    @Transactional(readOnly = true)
    public Pelicula buscar(Long id) {
        return peliculaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Pelicula> findByTitulo(String titulo) {
        return (List<Pelicula>) peliculaRepository.findByTitulo(titulo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Pelicula> findByArgumento(String argumento) {
        return (List<Pelicula>) peliculaRepository.findByArgumento(argumento);
    }
}
