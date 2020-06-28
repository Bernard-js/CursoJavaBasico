package com.bernard.cursojava.aula20;

import java.util.Arrays;

public class Matrizes {
    public static void main(String[] args) {
        
        double[][] notasAlunos = new double[3][4];
        
        notasAlunos[0][0] = 9.5;
        notasAlunos[0][1] = 9.0;
        notasAlunos[0][2] = 5.7;
        notasAlunos[0][3] = 3.3;
     
        notasAlunos[1][0] = 5.5;
        notasAlunos[1][1] = 10;
        notasAlunos[1][2] = 9;
        notasAlunos[1][3] = 7.5;

        notasAlunos[2][0] = 4.5;
        notasAlunos[2][1] = 6.7;
        notasAlunos[2][2] = 8.5;
        notasAlunos[2][3] = 8;
        
        for (int i = 0; i < notasAlunos.length; i++) {
            for(int j = 0; j < notasAlunos[i].length; j++){
                System.out.println(notasAlunos[i][j] + " ");
            }      
            System.out.println("");
        }
        
        System.out.println("Calculando a média de cada aluuno");
        
        double soma;
        double media;
        for (int i = 0; i < notasAlunos.length; i++) {
            soma = 0;
            for(int j = 0; j < notasAlunos[i].length; j++){
                soma += notasAlunos[i][j];
            }      
            media = soma / notasAlunos[i].length;
            System.out.println("Média do aluno " + (i + 1) + " = " + media);
            
        }
        
        int[] declaredArray = {1, 2, 3, 4, 5, 6};
        
        int[][] declaredMatrix = {{3, 4, 6}, {1, 2, 5}, {1, 2, 3, 4, 5, 6}};
        
        
    }
}
