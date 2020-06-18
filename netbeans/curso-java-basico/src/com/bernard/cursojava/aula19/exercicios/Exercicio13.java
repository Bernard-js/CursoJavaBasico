package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vA = new int[10];
        int soma = 0;
        
        for (int i = 0; i < vA.length; i++) {
            System.out.println("Escreva o numero da posição " + i + " do array A.");
            vA[i] = scanner.nextInt();
            if (vA[i] % 5 == 0) {
                soma += vA[i];
            }
        }
        
        System.out.println("soma dos elementos múltiplos de 5 do vetor A: " + soma);
    }
        
}
