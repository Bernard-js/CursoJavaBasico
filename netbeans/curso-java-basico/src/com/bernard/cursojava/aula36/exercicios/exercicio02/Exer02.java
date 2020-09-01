package com.bernard.cursojava.aula36.exercicios.exercicio02;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Professor professor = new Professor("Roger", "Instituto de Química", "rogerfederer@gmail.com");
        Aluno[] alunos = new Aluno[5];
        double[][] notas = new double[5][4];
                
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();
            
            System.out.println("Escreva o nome do aluno " + (i + 1));
            alunos[i].setNome(scanner.next());
            
            System.out.println("Escreva o número da matrícula do aluno: ");
            alunos[i].setMatricula(scanner.nextInt());
            
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Escreva a nota " + (j + 1) + " do aluno " + (i + 1));
                notas[i][j] = scanner.nextDouble();
            }
            alunos[i].setNotas(notas[i]);
        }
        
        Curso curso = new Curso("Inorgânica", 330, professor, alunos);
        
        int soma;
        int media;
        int mediaTotal = 0;
        for (int i = 0; i < notas.length; i++) {
            soma = 0;
            
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            
            media = soma / notas[i].length;
            System.out.println("A média do aluno " + (i + 1) + " : " + media );
            
            if (media >= 7) {
                System.out.println("O aluno " + (i + 1) + " está APROVADO!");
            } else {
                System.out.println("O aluno " + (i + 1) + " está REPROVADO!");
            }
            mediaTotal += media;
        }
        
        mediaTotal /= notas.length;
        System.out.println("A média total da turma: " + mediaTotal);
    }
}
