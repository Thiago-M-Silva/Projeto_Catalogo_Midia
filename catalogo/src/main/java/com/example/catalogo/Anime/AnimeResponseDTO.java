package com.example.catalogo.Anime;

public record AnimeResponseDTO(Long id, String nome) {

    public AnimeResponseDTO(Anime anime){
        this(anime.getId(), anime.getNome());
    }
}
