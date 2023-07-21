package com.example.catalogo.Serie;

public record SerieResponseDTO(Long id, String nome, String tipo) {
    public SerieResponseDTO(Serie serie){
        this(serie.getId(), serie.getNome(), serie.getTipo());
    }
}
