package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        long num = scanner.nextLong();

        if ((num % 2) == 0) System.out.println(num + " é par");
        else System.out.println(num + " é ímpar");
    }
}


