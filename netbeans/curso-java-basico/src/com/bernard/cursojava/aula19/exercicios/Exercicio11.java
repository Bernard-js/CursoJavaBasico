package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] vA = new int[10];
        int[] vB = new int[vA.length];
        String outputB = "Vetor B = ";
        
        for (int i = 0; i < vA.length; i++) {
            System.out.println("Escreva o numero da posição " + i + " do array A.");
            vA[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < vA.length; i++) {
            if (vA[i] % 2 == 0) {
                vB[i] = vA[i]; 
            }
        }
        System.out.println("Número de elementos pares do vetor A: " + vB.length);
    }
}
