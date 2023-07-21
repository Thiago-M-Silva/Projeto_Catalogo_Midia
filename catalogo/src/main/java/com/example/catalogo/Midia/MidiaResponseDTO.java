package com.example.catalogo.Midia;

public record MidiaResponseDTO(Long id, String nome, String tipo) {
    public MidiaResponseDTO(midia midia){
        this(midia.getId(), midia.getNome(), midia.getTipo());
    }
}
