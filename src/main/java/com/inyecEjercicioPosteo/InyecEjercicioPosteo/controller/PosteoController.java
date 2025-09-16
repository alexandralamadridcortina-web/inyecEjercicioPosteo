package com.inyecEjercicioPosteo.controller;

import com.inyecEjercicioPosteo.model.Posteo;
import com.inyecEjercicioPosteo.service.IPosteoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posteos")
public class PosteoController {

    private final IPosteoService posteoService;

    public PosteoController(IPosteoService posteoService) {
        this.posteoService = posteoService;
    }

    // GET /posteos → devuelve todos
    @GetMapping
    public List<Posteo> getAllPosteos() {
        return posteoService.findAll();
    }

    // GET /posteos/{id} → devuelve por id
    @GetMapping("/{id}")
    public Posteo getPosteoById(@PathVariable Long id) {
        return posteoService.findById(id);
    }

    // POST /posteos/crear → agrega uno nuevo
    @PostMapping("/crear")
    public String crearPosteo(@RequestBody Posteo posteo) {
        posteoService.save(posteo);
        return "Posteo creado correctamente ✅";
    }
}
