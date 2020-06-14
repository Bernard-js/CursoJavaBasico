package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio21 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantas turmas a instituição possui?");
        int turmas = scanner.nextInt();
        
        int alunosTurma;
        int soma = 0;        
        int i = 1;
        double mediaAlunos;
        
        while(i <= turmas) {
            
            System.out.println("Quantos alunos tem na turma " + i + " ?");
            alunosTurma = scanner.nextInt();
            i++;
            
            if (alunosTurma >= 40) {
                i--;
            } else {
                soma += alunosTurma;
            }
        }
        
        mediaAlunos = soma / turmas;
        
        System.out.println("a média de alunos por turma é: " + mediaAlunos);
    }
}

