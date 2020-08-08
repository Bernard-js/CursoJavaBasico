package com.bernard.cursojava.aula27.exercicios;

public class Exer03 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Classmate";
        aluno.matricula = 3428762;
        aluno.curso = "Matemática";
        aluno.disciplinas = new String[3];
        aluno.notas = new double[3];
        
        aluno.disciplinas[0] = "Teoria dos Numeros";
        aluno.disciplinas[1] = "algebra linear";
        aluno.disciplinas[2] = "calculo";
        
        aluno.notas[0] = 4.0;
        aluno.notas[1] = 8.5;
        aluno.notas[2] = 7.0;
        
        aluno.verificarAprovacao("Teoria dos Numeros");
        aluno.verificarAprovacao("algebra linear");
        aluno.verificarAprovacao("calculo");
        aluno.verificarAprovacao("geometria analitica");
                        
    }
}
