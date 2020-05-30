package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio09 {

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
                if (b >= c ) System.out.println(a + ", " + b + ", " + c);
                else System.out.println(a + ", " + c + ", " + b);
            } else {
                System.out.println(c + ", " + a + ", " + b);
            }
        } else if(b >= c){
            if (a >= c) System.out.println(b + ", " + a + ", " + c);
            else System.out.println(b + ", " + c + ", " + a);
        } else {
            System.out.println(c + ", " + b + ", " + a);
        }
    }
}
