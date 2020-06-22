package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[vetorA.length + vetorB.length];
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Escreva o elemento " + i + " do vetor A");
            vetorA[i] = scanner.nextInt();
        }
      
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Escreva o elemento " + i + " do vetorB");
            vetorB[i] = scanner.nextInt();
        }
        
        System.out.print("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            if (i < vetorA.length) {
              vetorC[i] = vetorA[i];  
            } else {
                vetorC[i] = vetorB[i - vetorA.length];
            }
            System.out.print(vetorC[i] + ", ");
        }
    }
}
