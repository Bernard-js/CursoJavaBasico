package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva algum ano: ");
        int ano = scanner.nextInt();

        if ((ano % 4) == 0) System.out.println("Esse ano é bissexto");
        else System.out.println("Este ano não é bissexto");
    }
}
