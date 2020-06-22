package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vA = new int[10];
        int[] vB = new int[10];
        int[] vC = new int[10];
        
        for (int i = 0; i < vA.length; i++) {
            System.out.println("Escreva o elemento " + i + " do array A");
            vA[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < vB.length; i++) {
            int j = vB[i];
            
        }
        
        for (int i = 0; i < vB.length; i++) {
            System.out.println("Escreva o elemento " + i + " do array B");
            vB[i] = scanner.nextInt();
        }
        
        System.out.print("Vetor C = ");
        for (int i = 0; i < vC.length; i++) {
            if (vA[i] > vB[i]) {
                vC[i] = 1;
            } else if (vA[i] == vB[i]) {
                vC[i] = 0;
            } else {
                vC[i] = -1;
            }
            System.out.print(vC[i] + " ");
        }
    }
}
