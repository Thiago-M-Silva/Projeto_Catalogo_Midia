package com.example.catalogo.Desenho;

public record DesenhoRequestDTO(String nome, String autor, String descricao, String estudio, String status, String disponibilidade,
                                int maxeps, String StatusVisto, String nacionalidade) {
}
