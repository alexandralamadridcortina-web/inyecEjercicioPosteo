package com.inyecEjercicioPosteo.model;

public class Posteo {
    private Long id;
    private String titulo;
    private String autor;

    // Constructor vacío
    public Posteo() {}

    // Constructor con parámetros
    public Posteo(Long id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
}
