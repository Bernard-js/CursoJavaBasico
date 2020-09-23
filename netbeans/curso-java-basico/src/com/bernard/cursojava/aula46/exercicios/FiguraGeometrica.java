package com.bernard.cursojava.aula46.exercicios;

public abstract class FiguraGeometrica {
    protected String nome;
    private String cor;

    public String getCor() {
        return cor;
    }

    public String getNome() {
        return nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}