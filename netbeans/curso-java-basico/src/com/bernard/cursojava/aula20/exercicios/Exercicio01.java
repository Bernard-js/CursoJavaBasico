package com.bernard.cursojava.aula20.exercicios;

import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[][] matrix = new int[4][4];
        
        int maxValue = Integer.MIN_VALUE;
        int line = 0;
        int column = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {                
                matrix[i][j] = random.nextInt(10);
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    line = i;
                    column = j;
                }
            }
        }
        
        System.out.println("Maior valor da matriz: " + maxValue);
        System.out.println("Linha: " + line);
        System.out.println("Coluna: " + column);
        
    }
}
