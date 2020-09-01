package com.bernard.cursojava.aula39.teste;

import com.bernard.cursojava.aula39.Pessoa;

public class Aluno extends Pessoa {
    private String[] cursos;
    private String[][] notas;

    public void verificarAcesso(){
        super.nomeVisibilidade = "kjwekjdekjdw";
        this.nomeVisibilidade = "kjwekjdekjdw";
    }

    public Aluno(){
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String[] cursos){
        super(nome, endereco, telefone);
        this.cursos = cursos;
    }

    public String[] getCursos(){
        return this.cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public String[][] getNotas() {
        return notas;
    }

    public void setNotas(String[][] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }
    
    public boolean verificarAprovado(){
        return true;
    }

}
