package com.inyecEjercicioPosteo.service;

import com.inyecEjercicioPosteo.model.Posteo;
import com.inyecEjercicioPosteo.repository.IPosteoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosteoService implements com.inyecEjercicioPosteo.service.IPosteoService {

    private final IPosteoRepository posteoRepository;

    // Inyección por constructor
    public PosteoService(IPosteoRepository posteoRepository) {
        this.posteoRepository = posteoRepository;
    }

    @Override
    public List<Posteo> findAll() {
        return posteoRepository.findAll();
    }

    @Override
    public Posteo findById(Long id) {
        return posteoRepository.findById(id);
    }

    @Override
    public void save(Posteo posteo) {
        posteoRepository.save(posteo);
    }
}
