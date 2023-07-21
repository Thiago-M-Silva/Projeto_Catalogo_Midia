package com.example.catalogo;

import com.example.catalogo.Anime.Anime;
import com.example.catalogo.Filme.Filme;
import com.example.catalogo.Livro.Livro;
import com.example.catalogo.Manga.Manga;
import com.example.catalogo.Novela.Novela;
import com.example.catalogo.Serie.Serie;

public class Personagens {
    private String nome;
    private Anime anime;
    private Filme filme;
    private Livro livro;
    private Manga manga;
    private Novela novela;
    private Serie serie;

    public Personagens(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Anime getAnime() {
        return anime;
    }

    public void setAnime(Anime anime) {
        this.anime = anime;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Manga getManga() {
        return manga;
    }

    public void setManga(Manga manga) {
        this.manga = manga;
    }

    public Novela getNovela() {
        return novela;
    }

    public void setNovela(Novela novela) {
        this.novela = novela;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }


}
