package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a sua nota do primeiro semestre: ");
        float primeiroSemestre = scanner.nextFloat();

        System.out.println("Escreva a nota do seu segundo semestre: ");
        float segundoSemestre = scanner.nextFloat();

        float media = (primeiroSemestre + segundoSemestre) / 2;

        if (media >= 7) {
            if (media == 10){
                System.out.println("Aprovado com distinção");
            } else {
                System.out.println("Aprovado");
            }
        } else {
            System.out.println("Reprovado");
        }
    }
}
