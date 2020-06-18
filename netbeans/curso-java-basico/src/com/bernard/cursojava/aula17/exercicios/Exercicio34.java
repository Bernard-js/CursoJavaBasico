package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o ultimo termo da sequencia: ");
        int n = scanner.nextInt();

        double termo;
        double soma = 0;
        int div;
        String output = "Soma = ";

        for (double i = 1; i <= n; i++) {
            div = (int)i;
            termo = 1 / i;
            soma += termo;
            output += 1 + "/" + div + " + " ;
        }

        System.out.println(output);
        System.out.println("Soma = " + soma);

    }
}
