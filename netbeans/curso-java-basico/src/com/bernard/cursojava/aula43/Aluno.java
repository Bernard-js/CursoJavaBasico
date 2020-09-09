package com.bernard.cursojava.aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno extends Pessoa {
    private String curso;
    private int[] notas;

    public Aluno(){
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso){
        super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }
    
    public boolean verificarAprovado(){
        return true;
    }

    @Override
    public String obterEtiquetaEndereco() {
        String s = "Endereço do aluno: ";
        s += super.getEndereco();

        return s;
    }

    public void imprimirEtiqueta(){
        System.out.println(this.obterEtiquetaEndereco());
    }

    @Override
    public String toString() {
        String s = curso + "\n";
        for (int nota : notas) {
            s += nota + " ";
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        if (curso.equalsIgnoreCase(((Aluno) o).getCurso())) return true;

        return false;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(curso);
        result = 31 * result + Arrays.hashCode(notas);
        return result;
    }
}
