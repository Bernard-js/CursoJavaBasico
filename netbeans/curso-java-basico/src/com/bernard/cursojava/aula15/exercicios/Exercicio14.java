package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva sua primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.println("Escreva sua segunda nota: ");
        float nota2 = scanner.nextFloat();

        float media = nota1 + nota2 / 2;

        if (media >= 6 && media <= 10){
            System.out.println("Aprovado");
        } else if (media >= 0){
            System.out.println("Reprovado");
        } else {
            System.out.println("Só são possíveis médias de 0 a 10");
        }
    }
}
