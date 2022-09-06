package edu.utp.service.movie.service.impl;

import edu.utp.service.movie.model.Opinion;
import edu.utp.service.movie.repository.OpinionRepository;
import edu.utp.service.movie.service.OpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OpinionServiceImpl implements OpinionService {

    @Autowired
    private OpinionRepository opinionRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Opinion> listarOpiniones() {
        return (List<Opinion>) opinionRepository.findAll();
    }

    @Override
    @Transactional
    public Opinion guardar(Opinion opinion) {
        return opinionRepository.save(opinion);
    }

    @Override
    @Transactional
    public void eliminar(Opinion opinion) {
        opinionRepository.delete(opinion);
    }

    @Override
    @Transactional(readOnly = true)
    public Opinion buscar(Long id) {
        return opinionRepository.findById(id).orElse(null);
    }
}
