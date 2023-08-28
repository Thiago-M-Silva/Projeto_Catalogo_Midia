package com.example.catalogo;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "Ator")
public class Ator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @ManyToMany
    @JoinTable(name = "Ator_Personagens", joinColumns = @JoinColumn(name = "ator_id"),
            inverseJoinColumns = @JoinColumn(name = "personagens_id"))
    private List<Personagens> personagem;
    private int idade;
    private Date anoNasc;

    Ator(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Personagens> getPersonagem() {
        return personagem;
    }

    public void setPersonagem(List<Personagens> personagem) {
        this.personagem = personagem;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(Date anoNasc) {
        this.anoNasc = anoNasc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
