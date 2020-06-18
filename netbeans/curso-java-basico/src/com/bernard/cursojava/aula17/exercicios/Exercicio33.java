package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o ultimo termo da sequencia: ");
        int n = scanner.nextInt();

        double impar;
        double termo;
        double soma = 0;
        int div;
        String output = "Soma = ";
        
        for (int i = 1; i <= n; i++) {
            impar = (2 * i) - 1;
            div = (int)impar;
            termo = i / impar;
            soma += termo;
            output += i + "/" + div + " + " ;
        }

        System.out.println(output);
        System.out.println("Soma = " + soma);

    }
}