package com.biblioteca.gerencidor.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "emprestimo")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private LocalDate dataEmprestimo;

    @Column
    private LocalDate dataPrevista;

    @Column (nullable = false)
    private LocalDate dataDevolucao;

    @Column
    private int renovacao;

    @ManyToOne
    @JoinColumn(name = "livro_emprestado", nullable = false)
    private Livro livro;

    @ManyToOne
    @JoinColumn(name = "aluno_emprestimo", nullable = false)
    private Usuario aluno;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(LocalDate dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getRenovacao() {
        return renovacao;
    }

    public void setRenovacao(int renovacao) {
        this.renovacao = renovacao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getAluno() {
        return aluno;
    }

    public void setAluno(Usuario aluno) {
        this.aluno = aluno;
    }
}
