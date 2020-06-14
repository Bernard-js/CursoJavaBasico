package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o ultimo termo da sequencia: ");
        int n = scanner.nextInt();

        int impar;
        double termo;
        double soma = 0;
        String output = "";
        
        for (int i = 1; i <= n; i++) {
            impar = (2 * i) - 1;
            termo = i / impar;
            soma += termo;
            System.out.println("Soma = " + i + "/" + impar);
        }
        System.out.println("Soma = " + soma);

    }
}