package com.example.catalogo;

import com.example.catalogo.Anime.Anime;
import com.example.catalogo.Filme.Filme;
import com.example.catalogo.Livro.Livro;
import com.example.catalogo.Manga.Manga;
import com.example.catalogo.Novela.Novela;
import com.example.catalogo.Serie.Serie;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Personagens")
public class Personagens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @ManyToOne
    @JoinColumn(name = "id_anime")
    private Anime anime;
    @ManyToOne
    @JoinColumn(name = "id_filme")
    private Filme filme;
    @ManyToOne
    @JoinColumn(name = "id_livro")
    private Livro livro;
    @ManyToOne
    @JoinColumn(name = "id_manga")
    private Manga manga;
    @ManyToOne
    @JoinColumn(name = "id_novela")
    private Novela novela;
    @ManyToOne
    @JoinColumn(name = "id_serie")
    private Serie serie;
    @ManyToMany(mappedBy = "personagem")
    private List<Ator> ator;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Ator> getAtor() {
        return ator;
    }

    public void setAtor(List<Ator> ator) {
        this.ator = ator;
    }

}
