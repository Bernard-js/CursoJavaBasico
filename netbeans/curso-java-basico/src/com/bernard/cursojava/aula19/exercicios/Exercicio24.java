package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array = new int[10];
        
        boolean sair = false;
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Escreva o elemento " + i + " do array");
            array[i] = scanner.nextInt();
        }
        
        int i = 0;
        int opposite;
        while(i < (array.length / 2) && !sair){
            opposite = array.length - (1 + i);
            if (array[i] == array[opposite]) {
                i += 1;
            } else {
                sair = true;
                break;
            }
        }
        
        if (i == array.length / 2) {
            System.out.println("Palíndromo");
        } else {
            System.out.println("este array não é palíndromo!");
        }
    }
}
