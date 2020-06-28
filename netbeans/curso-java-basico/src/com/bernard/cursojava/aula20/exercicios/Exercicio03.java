package com.bernard.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[][] matrix = new int[3][3];
        byte numPares = 0;
        byte numImpares = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Escreva um inteiro qualquer");
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] % 2 == 0) {
                    numPares++;
                } else {
                    numImpares++;
                }
            }
        }
        
        System.out.println("Números pares: " + numPares);
        System.out.println("Números impares: " + numImpares);
    }
}
