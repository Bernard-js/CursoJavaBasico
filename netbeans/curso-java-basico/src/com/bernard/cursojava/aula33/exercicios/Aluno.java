package com.bernard.cursojava.aula33.exercicios;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private String[] disciplinas;
    private double[] notas;

    public Aluno(String nome, int matricula, String curso, String[] disciplinas, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public double[] getNotas() {
        return notas;
    }
    
    
    void verificarAprovacao(String disciplina){
        boolean cursoExiste = false;
        int i = 0;
        while (!cursoExiste && i < this.disciplinas.length) {            
            if (disciplina.equalsIgnoreCase(this.disciplinas[i])) {
                cursoExiste = true;
                if (this.notas[i] >= 7) {
                    System.out.println("Aprovado em " + this.disciplinas[i]);
                } else {
                    System.out.println("Reprovado em " + this.disciplinas[i]);
                }
            } else {
                i++;
            }
        }
        
        if(!cursoExiste) System.out.println("Disciplina não existe!");  
    }
}
