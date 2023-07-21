package com.example.catalogo.Anime;

public record AnimeResponseDTO(Long id, String nome, String tipo) {

    public AnimeResponseDTO(Anime anime){
        this(anime.getId(), anime.getNome(), anime.getTipo());
    }
}
