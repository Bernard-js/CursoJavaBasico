package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vA = new int[10];
        int[] vB = new int[10];
        
        boolean sair = false;
        
        for (int i = 0; i < vA.length; i++) {
            System.out.println("Escreva o elemento " + i + " do array");
            vA[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < vB.length; i++) {
            if (vA[i] % 2 == 0) {
                vB[i] = 1;
            } else {
              vB[i] = 0;  
            }
            System.out.print(vB[i] + " ");
        }
    }
}
