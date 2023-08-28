package com.example.catalogo.Usuario;

import java.util.List;

import com.example.catalogo.Anime.Anime;
import com.example.catalogo.Filme.Filme;
import com.example.catalogo.Livro.Livro;
import com.example.catalogo.Manga.Manga;

import com.example.catalogo.Novela.Novela;
import com.example.catalogo.Serie.Serie;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    private Long id;
    private String nome;
    private Anime anime;
    private Filme filme;
    private Livro livro;
    private Manga manga;
    private Novela novela;
    private Serie serie;
    private String tipo; //"A" para adm ou "C" para cliente

    Usuario(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void adicionarMidia(String tipo){

    }

    public void apagarMidia(String tipo){

    }

    public void compartilhar(String tipo){

    }

    public void listaFavoritos(String tipo){
        //teste github
    }

    public void listaNaoVistos(String tipo){
        //teste github
    }

    public void listaVistos(String tipo){
        //teste github
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", anime=" + anime + "]";
    }

}