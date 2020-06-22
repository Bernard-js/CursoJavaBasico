package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        String outB = "Vetor B = ";
        String outC = "Vetor C = ";
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Escreva o elemento " + i + " do vetor A");
            vetorA[i] = scanner.nextInt();
        }
        
        
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[i] = vetorA[i];
                outB += vetorB[i] + ", ";
            } else {
                vetorC[i] = vetorA[i];
                outC += vetorC[i] + ", ";
            }
        }
        
        System.out.println(outB);
        System.out.println(outC);
    }
}
