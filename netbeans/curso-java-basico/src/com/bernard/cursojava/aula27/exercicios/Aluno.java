package com.bernard.cursojava.aula27.exercicios;

public class Aluno {
    String nome;
    int matricula;
    String curso;
    String[] disciplinas;
    double[] notas;
    
    void verificarAprovacao(String disciplina){
        boolean cursoExiste = false;
        int i = 0;
        while (!cursoExiste && i < disciplinas.length) {            
            if (disciplina.equalsIgnoreCase(disciplinas[i])) {
                cursoExiste = true;
                if (notas[i] >= 7) {
                    System.out.println("Aprovado em " + disciplinas[i]);
                } else {
                    System.out.println("Reprovado em " + disciplinas[i]);
                }
            } else {
                i++;
            }
        }
        
        if(!cursoExiste) System.out.println("Disciplina não existe!");  
    }
}
