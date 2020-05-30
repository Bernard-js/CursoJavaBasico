package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva uma letra maiúscula: ");
        String letra = scanner.next();

        if (letra.length() == 1){
            switch (letra.toUpperCase()){
                case "A":
                case "E":
                case "I":
                case "O":
                case "U": System.out.println("Vogal"); break;
                default: System.out.println("Consoante");
            }
        } else {
            System.out.println("Não é uma letra");
        }

    }
}
