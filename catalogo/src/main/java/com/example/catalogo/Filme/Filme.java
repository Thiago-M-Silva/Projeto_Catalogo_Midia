package com.example.catalogo.Filme;

import com.example.catalogo.Personagens;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;
@Entity
@Table(name = "Filme")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String autor;
    private String estudio; //estudio proprietário ou editora
    private String status;
    private String disponibilidade; //onde a midia pode ser econtrada
    private String tipo; //anime, serie, filme...
    private Date mesAno; //data lancamento
    private int temps;
    private int maxEps;
    private int duracaoEP;
    private String statusVisto; //se o usuario esta assistindo ou ñ ou se pretende ver
    @OneToMany
    private List<Personagens> personagens;
    private int duracao;
    
    public Filme(String nome, String autor, String estudio, int duracao){
        this.duracao = duracao;
    }

    public Filme(FilmeRequestDTO data) {
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descricao;
    }

    public void setDescrição(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getMesAno() {
        return mesAno;
    }

    public void setMesAno(Date mesAno) {
        this.mesAno = mesAno;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    public int getMaxEps() {
        return maxEps;
    }

    public void setMaxEps(int maxEps) {
        this.maxEps = maxEps;
    }

    public int getDuracaoEP() {
        return duracaoEP;
    }

    public void setDuracaoEP(int duracaoEP) {
        this.duracaoEP = duracaoEP;
    }

    public String getStatusVisto() {
        return statusVisto;
    }

    public void setStatusVisto(String statusVisto) {
        this.statusVisto = statusVisto;
    }

    public List<Personagens> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<Personagens> personagens) {
        this.personagens = personagens;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descrição='" + descricao + '\'' +
                ", autor='" + autor + '\'' +
                ", estudio='" + estudio + '\'' +
                ", status='" + status + '\'' +
                ", disponibilidade='" + disponibilidade + '\'' +
                ", tipo='" + tipo + '\'' +
                ", mesAno=" + mesAno +
                ", temps=" + temps +
                ", maxEps=" + maxEps +
                ", duracaoEP=" + duracaoEP +
                ", statusVisto='" + statusVisto + '\'' +
                ", personagens=" + personagens +
                ", duracao=" + duracao +
                '}';
    }
}