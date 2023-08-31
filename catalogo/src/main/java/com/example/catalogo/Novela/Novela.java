package com.example.catalogo.Novela;

import com.example.catalogo.Personagens;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "novela")
public class Novela {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String autor;
    private String estudio; //estudio proprietário ou editora
    private String status;
    private String disponibilidade; //onde a midia pode ser econtrada
    private Date mesAno; //data lancamento
    private int maxEps;
    private String statusVisto; //se o usuario esta assistindo ou ñ ou se pretende ver
    @OneToMany(mappedBy = "novela")
    private List<Personagens> personagens;

    public Novela(String nome, String autor, String estudio, int maxEps, int duracaoEP){
        this.maxEps = maxEps;
    }

    public Novela(NovelaRequestDTO data) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
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

    public Date getMesAno() {
        return mesAno;
    }

    public void setMesAno(Date mesAno) {
        this.mesAno = mesAno;
    }

    public int getMaxEps() {
        return maxEps;
    }

    public void setMaxEps(int maxEps) {
        this.maxEps = maxEps;
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

    @Override
    public String toString() {
        return "Novela{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", autor='" + autor + '\'' +
                ", estudio='" + estudio + '\'' +
                ", status='" + status + '\'' +
                ", disponibilidade='" + disponibilidade + '\'' +
                ", mesAno=" + mesAno + '\'' +
                ", maxEps=" + maxEps + '\'' +
                ", statusVisto='" + statusVisto + '\'' +
                ", personagens=" + personagens + '\'' +
                ", maxEps=" + maxEps + '\'' +
                ", statusVisto='" + statusVisto + '\'' +
                '}';
    }
}
