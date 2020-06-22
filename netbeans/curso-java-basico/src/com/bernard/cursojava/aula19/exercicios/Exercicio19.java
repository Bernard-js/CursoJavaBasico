package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] result = new double[10];
        
        for (int i = 0; i < nota1.length; i++) {
            System.out.println("Escreva a primeira nota do aluno " + (i + 1));
            nota1[i] = scanner.nextDouble();
        }
        
        for (int i = 0; i < nota2.length; i++) {
            System.out.println("Escreva a segunda nota do aluno " + (i + 1));
            nota2[i] = scanner.nextDouble();
        }
        
        for (int i = 0; i < result.length; i++) {
            result[i] = (nota1[i] + nota2[i]) / 2;
            System.out.println("Média das notas do aluno " + (i + 1) + " = " + result[i]);
            if (result[i] >= 7) {
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO");
            }
        }
    }
}
