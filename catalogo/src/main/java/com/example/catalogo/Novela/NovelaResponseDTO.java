package com.example.catalogo.Novela;

public record NovelaResponseDTO(Long id, String nome) {
    public NovelaResponseDTO(Novela novela){
        this(novela.getId(), novela.getNome());
    }
}
