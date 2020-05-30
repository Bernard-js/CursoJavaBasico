package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um dia da semana (1 - 7): ");
        byte diaSemana = scanner.nextByte();

        switch (diaSemana){

            case 1:
                System.out.println("Domingo");
            case 2:
                System.out.println("Segunda");
            case 3:
                System.out.println("Terça");
            case 4:
                System.out.println("Quarta");
            case 5:
                System.out.println("Quinta");
            case 6:
                System.out.println("Sexta");
            case 7:
                System.out.println("Sábado");
            default:
                System.out.println("Dia inválido");
        }

    }
}
