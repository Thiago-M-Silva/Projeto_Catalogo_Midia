package com.example.catalogo.Manga;

public record MangaResponseDTO(Long id, String nome) {
    public MangaResponseDTO(Manga manga){
        this(manga.getId(), manga.getNome());
    }
}
