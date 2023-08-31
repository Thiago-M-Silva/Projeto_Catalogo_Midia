package com.example.catalogo.Livro;

public record LivroResponseDTO(Long id, String nome) {
    public LivroResponseDTO(Livro Livro){
        this(Livro.getId(), Livro.getNome());
    }
}
