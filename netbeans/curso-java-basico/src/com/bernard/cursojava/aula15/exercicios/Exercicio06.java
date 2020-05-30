package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double a = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        double b = scanner.nextDouble();

        System.out.println("Digite mais um número: ");
        double c = scanner.nextDouble();

        if (a >= b){
            if (a >= c){
                System.out.println("O maior número é: " + a);
            } else {
                System.out.println("O maior número é: " + c);
            }
        } else if (b >= c){
            System.out.println("O maior número é: " + b);
        } else {
            System.out.println("O maior número é: " + c);
        }

    }
}
