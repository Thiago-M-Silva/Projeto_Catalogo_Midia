package com.example.catalogo.Filme;

public record FilmeResponseDTO(Long id, String nome) {
    public FilmeResponseDTO(Filme filme){
        this(filme.getId(), filme.getNome());
    }
}
