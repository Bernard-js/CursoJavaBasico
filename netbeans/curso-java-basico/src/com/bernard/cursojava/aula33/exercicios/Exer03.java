package com.bernard.cursojava.aula33.exercicios;

public class Exer03 {
    public static void main(String[] args) {
        String[] disciplinas = new String[3];
        disciplinas[0] = "Teoria dos Numeros";
        disciplinas[1] = "algebra linear";
        disciplinas[2] = "calculo";
        
        double[] notas = new double[3];
        notas[0] = 4.0;
        notas[1] = 8.5;
        notas[2] = 7.0;
        
        Aluno aluno = new Aluno("Bernard", 7182783, "Eng. Mec.", disciplinas, notas);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getMatricula());
        System.out.println(aluno.getCurso());
        
        aluno.verificarAprovacao(disciplinas[0]);
        aluno.verificarAprovacao(disciplinas[1]);
        aluno.verificarAprovacao(disciplinas[2]);

                
    }
}
