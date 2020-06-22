package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vA = new int[10]; 
        
        for (int i = 0; i < vA.length; i++) {
            System.out.println("Escreva o numero da posição " + i + " do array A.");
            vA[i] = scanner.nextInt();
        }
        
        
        for (int i = 0; i < vA.length; i++) {
            System.out.println("Analisando o número " + vA[i]);
            for (int j = 2; j < vA[i]; j++) {
                if (j % 2 == 0) {
                    System.out.println(j + " é par");
                }
            }
        }
    }
}
