package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vA = new int[10];
        int soma = 0;
        double media;
        
        for (int i = 0; i < vA.length; i++) {
            System.out.println("Escreva o numero da posição " + i + " do array A.");
            vA[i] = scanner.nextInt();
            if (vA[i] % 2 != 0) {
                soma += vA[i];
            }
        }
        
        media = soma / 2;
        
        System.out.println("média dos elementos ímpares do vetor A: " + media);
    }
}
