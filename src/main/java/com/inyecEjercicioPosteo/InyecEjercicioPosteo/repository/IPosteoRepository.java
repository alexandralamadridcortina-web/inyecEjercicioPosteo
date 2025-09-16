package com.inyecEjercicioPosteo.repository;

import com.inyecEjercicioPosteo.model.Posteo;
import java.util.List;

public interface IPosteoRepository {
    List<Posteo> findAll();
    Posteo findById(Long id);
    void save(Posteo posteo);
}
