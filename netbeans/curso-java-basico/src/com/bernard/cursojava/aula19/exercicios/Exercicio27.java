package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array = new int[10];
        char[] vetorChar = new char[10];
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Escreva o elemento " + i + " do array");
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorChar.length; i++) {
            if (array[i] < 7) {
                vetorChar[i] = 'a';
            } else if (array[i] == 7 ) {
                vetorChar[i] = 'b';
            } else if (array[i] > 7 && array[i] < 10) {
                vetorChar[i] = 'c';
            } else if (array[i] == 10) {
                vetorChar[i] = 'd';
            } else {
                vetorChar[i] = 'e';
            }
            System.out.print(vetorChar[i] + ", ");
        }
    }
}
