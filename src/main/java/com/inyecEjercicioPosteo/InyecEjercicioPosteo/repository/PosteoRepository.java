package com.inyecEjercicioPosteo.repository;

import com.inyecEjercicioPosteo.model.Posteo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PosteoRepository implements com.inyecEjercicioPosteo.repository.IPosteoRepository {

    private List<Posteo> listaPosteos = new ArrayList<>();


    public PosteoRepository() {
        listaPosteos.add(new Posteo(1L, "Primer post", "Alexa"));
        listaPosteos.add(new Posteo(2L, "Segundo post", "Alexandra"));
    }

    @Override
    public List<Posteo> findAll() {
        return listaPosteos;
    }

    @Override
    public Posteo findById(Long id) {
        return listaPosteos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void save(Posteo posteo) {
        listaPosteos.add(posteo);
    }
}
