package com.example.catalogo.Anime;

public record AnimeResponseDTO(Long id, String nome, String autor, String descricao, String estudio,
                               String status, String disponibilidade, int maxeps, String StatusVisto) {

    public AnimeResponseDTO(Anime anime){
        this(anime.getId(),
                anime.getNome(),
                anime.getAutor(),
                anime.getDescricao(),
                anime.getEstudio(),
                anime.getStatus(),
                anime.getDisponibilidade(),
                anime.getMaxEps(),
                anime.getStatusVisto());
    }
}
