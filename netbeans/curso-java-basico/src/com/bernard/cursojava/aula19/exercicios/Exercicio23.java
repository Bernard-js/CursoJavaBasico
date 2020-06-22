package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array = new int[10];
        
        boolean sair = false;
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Escreva o elemento " + i + " do array");
            array[i] = scanner.nextInt();
        }
        
        int i = 0;
        while (!sair) {
            if (array[i] % 2 == 0) {
                i += 1;
            } else {
                sair = true;
                System.out.println("o elemento " + i + " do array é ímpar");
            }
        }
    }
}
