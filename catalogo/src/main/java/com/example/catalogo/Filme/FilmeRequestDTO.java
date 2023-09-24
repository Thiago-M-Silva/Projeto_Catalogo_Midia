package com.example.catalogo.Filme;

public record FilmeRequestDTO(Long id, String nome, String descricao, String auto,
                              String estudio, String disponibilidade, String statusVisto,
                              int duracao) {
}
