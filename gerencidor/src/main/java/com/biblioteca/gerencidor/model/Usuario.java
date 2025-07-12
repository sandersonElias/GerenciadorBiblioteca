package com.biblioteca.gerencidor.model;

import jakarta.persistence.*;

@Entity
@Table(name = "aluno")
public class Usuario{

    @Id
    @Column(name = "numero_matricula")
    private long id;

    @Column
    private String nome;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
