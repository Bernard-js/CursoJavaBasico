package com.bernard.cursojava.aula42;

public class Aluno {
    private String[] cursos;
    private String[][] notas;

    public Aluno(){
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String[] cursos){
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
