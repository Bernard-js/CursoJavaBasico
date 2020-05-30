package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        double number = scanner.nextDouble();

        if (number < 0) System.out.println("Negativo");
        else System.out.println("Positivo");
    }
}
