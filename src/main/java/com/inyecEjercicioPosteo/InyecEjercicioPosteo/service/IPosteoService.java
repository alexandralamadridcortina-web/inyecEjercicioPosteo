package com.inyecEjercicioPosteo.service;

import com.inyecEjercicioPosteo.model.Posteo;
import java.util.List;

public interface IPosteoService {
    List<Posteo> findAll();
    Posteo findById(Long id);
    void save(Posteo posteo);
}
