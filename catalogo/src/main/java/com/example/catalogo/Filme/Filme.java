package com.example.catalogo.Filme;

import com.example.catalogo.Personagens;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;
@Entity
@Table(name = "filme")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "filme_id")
    private Long id;
    private String nome;
    private String descricao;
    @Column(name = "diretor")
    private String autor;
    private String estudio; //estudio proprietário ou editora
    private String disponibilidade; //onde a midia pode ser econtrada
    @Column(name = "dt_lanc")
    private Date mesAno; //data lancamento
    @Column(name = "status_visto")
    private String statusVisto; //se o usuario esta assistindo ou ñ ou se pretende ver
    @Column(name = "duracaomin")
    private int duracao;
    @OneToMany(mappedBy = "filme")
    private List<Personagens> personagens;
    
    public Filme(String nome, String autor, String estudio, int duracao){
        this.duracao = duracao;
    }

    public Filme(){}

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

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Date getMesAno() {
        return mesAno;
    }

    public void setMesAno(Date mesAno) {
        this.mesAno = mesAno;
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
                ", disponibilidade='" + disponibilidade + '\'' +
                ", mesAno=" + mesAno + '\'' +
                ", statusVisto='" + statusVisto + '\'' +
                ", personagens=" + personagens + '\'' +
                ", duracao=" + duracao + '\'' +
                '}';
    }
}
