package com.example.catalogo.Manga;

import com.example.catalogo.Midia.midia;

public class Manga extends midia {
    private int qtdCaps;
    private String status; //lancamento ou encerrado
    private String statusLido; //se o usuario esta lendo ou ñ ou se pretende ler
    private String nacionalidade; //manga funcionara para qualquer quadrinho

    public Manga(String nome, String autor, String estudio, int qtdCaps, String status){
        super(nome, autor, estudio);
        this.status = status;
        this.qtdCaps = qtdCaps;
    }

    public Manga(MangaRequestDTO data) {
    }

    public int getQtdCaps() {
        return qtdCaps;
    }

    public void setQtdCaps(int qtdCaps) {
        this.qtdCaps = qtdCaps;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusLido() {
        return statusLido;
    }

    public void setStatusLido(String statusLido) {
        this.statusLido = statusLido;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
