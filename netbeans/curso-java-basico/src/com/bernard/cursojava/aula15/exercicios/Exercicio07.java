package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio07 {

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
                System.out.println("O maior número: " + a);
                if (b >= c ) System.out.println("O menor número: " + c);
                else System.out.println("O menor número: " + b);
            } else {
                System.out.println("O maior número: " + c);
                System.out.println("O menor número: " + b);
            }
        } else if(b >= c){
            System.out.println("O maior número: " + b);
            if (a >= c) System.out.println("O menor número: " + c);
            else System.out.println("O menor número: " + a);
        } else {
            System.out.println("O maior número: " + c);
            System.out.println("O menor número: " + a);
        }
    }
}
