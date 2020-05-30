package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Em qual turno você estuda (M - matutino V - vespertino N - noturno): ");
        String turno = scanner.next();

        switch (turno.toUpperCase()){
            case "M": System.out.println("Bom Dia!"); break;
            case "V": System.out.println("Boa Tarde!"); break;
            case "N": System.out.println("Boa Noite!"); break;
            default: System.out.println("Não existe nenhum dia com esta sigla.");
        }
    }
}
