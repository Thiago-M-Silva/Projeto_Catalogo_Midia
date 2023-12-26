package com.example.catalogo.Desenho;

public record DesenhoResponseDTO(Long id, String nome, String autor, String descricao, String estudio,
                                 String status, String disponibilidade, int maxeps, String StatusVisto, String nacionalidade) {

    public DesenhoResponseDTO(Desenho desenho){
        this(desenho.getId(),
                desenho.getNome(),
                desenho.getAutor(),
                desenho.getDescricao(),
                desenho.getEstudio(),
                desenho.getStatus(),
                desenho.getDisponibilidade(),
                desenho.getMaxEps(),
                desenho.getStatusVisto(),
                desenho.getNacionalidade());
    }
}
