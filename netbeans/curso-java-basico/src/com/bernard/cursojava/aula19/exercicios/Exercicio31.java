package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vA = new int[20];
        int[] vB = new int[20];
        int indexB = 0;
        
        for (int i = 0; i < vA.length; i++) {
            System.out.println("Escreva o elemento " + i + " do array");
            vA[i] = scanner.nextInt();
            if (vA[i] % 2 == 0) {
                vB[indexB] = vA[i];
                indexB++;
            }
        }
        
        System.out.print("Vetor B = ");
        for (int i = 0; i < vB.length; i++) {
            if (vA[i] % 2 == 1) {
                vB[indexB] = vA[i];
                indexB++;
            }
            System.out.print(vB[i] + ", ");
        }
        
        
    }
}
