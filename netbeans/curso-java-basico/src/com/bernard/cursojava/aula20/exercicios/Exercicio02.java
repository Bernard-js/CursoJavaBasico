package com.bernard.cursojava.aula20.exercicios;

import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int[][] matrix  = new int[10][10];
        
        int maxValueLine5 = Integer.MIN_VALUE;
        int minValueLine5 = Integer.MAX_VALUE;
        int maxValCol7 = Integer.MIN_VALUE;
        int minValCol7 = Integer.MAX_VALUE;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                
                matrix[i][j] = random.nextInt(10);
                
                if (i == 5) {
                    if (matrix[i][j] > maxValueLine5) {
                        maxValueLine5 = matrix[i][j];
                    }
                    if (matrix[i][j] < minValueLine5) {
                        minValueLine5 = matrix[i][j];
                    }
                }
                
                if (j == 7) {
                    if (matrix[i][j] > maxValCol7) {
                        maxValCol7 = matrix[i][j];
                    }
                    if (matrix[i][j] < minValCol7) {
                        minValCol7 = matrix[i][j];
                    }
                }
            }
        }
        
        System.out.println("Linha 5");
        System.out.println("Maior Valor = " + maxValueLine5);
        System.out.println("Menor Valor = " + minValueLine5);
        
        System.out.println();
        
        System.out.println("Coluna 7");
        System.out.println("Maior Valor = " + maxValCol7);
        System.out.println("Menor Valor = " + minValCol7);
    }
}
