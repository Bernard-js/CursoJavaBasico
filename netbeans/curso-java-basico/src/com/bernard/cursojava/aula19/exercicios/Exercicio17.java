package com.bernard.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] idades = new int[10];
        int ageHigherThan35 = 0;
        
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Escreva a idade da pessoa " + (i + 1));
            idades[i] = scanner.nextInt();
            if (idades[i] > 35) {
                ageHigherThan35++;
            }
        }
        
        System.out.println("Número de pessoas maiores de 35 anos: " + ageHigherThan35);
        
    }
}
