package com.bernard.cursojava.aula43.exercicios.exer02;

public abstract class Contribuinte {
    protected String nome;

    public Contribuinte(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularImposto();
}
