package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
                
        for (int i = 0; i < array.length; i++) {
            System.out.println("Escreva um número inteiro");
            array[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Tabuada do " + array[i] + ": ");
            for (int j = 1; j <= 10; j++) {
                System.out.println(array[i] + " X " + j + " = " + (array[i] * j));
            }
        }
         
    }
}
