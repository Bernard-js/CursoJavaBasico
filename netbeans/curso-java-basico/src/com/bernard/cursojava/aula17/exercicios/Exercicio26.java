package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um inteiro qualquer: ");
        int n = scanner.nextInt();

        int fatorial = 1;

        System.out.println("Fatorial de: " + n);
        System.out.print(n + "! = ");
        for (int i = n; i >= 1; i--) {
            fatorial *= i;
            if (i == 1){
                System.out.print(i);
            } else {
               System.out.print(i + " . "); 
            }
        }
        System.out.print(" = " + fatorial);
    }
}