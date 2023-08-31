package com.example.catalogo.Serie;

public record SerieResponseDTO(Long id, String nome) {
    public SerieResponseDTO(Serie serie){
        this(serie.getId(), serie.getNome());
    }
}
