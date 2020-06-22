package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
         
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Escreva o elemento " + i + " do array");
            vetorA[i] = scanner.nextInt();
        }
        
        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[vetorA.length - i - 1];
            System.out.print(vetorB[i] + ", ");
        }

    }
}
