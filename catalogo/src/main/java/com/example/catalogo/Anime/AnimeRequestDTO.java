package com.example.catalogo.Anime;

public record AnimeRequestDTO(String nome, String autor, String descricao, String estudio, String status, String disponibilidade,
                              int maxeps, String StatusVisto) {
}
