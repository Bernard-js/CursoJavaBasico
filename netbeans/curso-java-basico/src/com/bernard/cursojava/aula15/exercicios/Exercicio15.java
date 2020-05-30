package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 lados de um triângulo: ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        if ((a + b) > c || (a + c) > b || (b + c) > a){
            if (a == b || a == c || b == c){
                if (a == b && b == c){
                    System.out.println("Triangulo Equilátero");
                } else {
                    System.out.println("Triânglo Isóceles");
                }
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("por desigualdade triangular, esses 3 segmentos não formam um triangulo");
        }

    }
}
