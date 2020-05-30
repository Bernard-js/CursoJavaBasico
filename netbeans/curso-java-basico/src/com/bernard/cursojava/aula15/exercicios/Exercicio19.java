package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número inteiro qualquer");
        int x = scanner.nextInt();

        System.out.println("Escreva outro número inteiro qualquer");
        int y = scanner.nextInt();

        System.out.println("Qual operação você quer fazer? " +
                "(+ -> adição; - -> subtração; x ou * -> multiplicação; / -> divisão)");

        String operador = scanner.next();

        long resultado = 0;

        switch (operador.toLowerCase()){
            case "+":
                resultado = x + y;
                System.out.println("Soma dos números: " + resultado);
                break;
            case "-":
                resultado = x - y;
                System.out.println("Subtração dos números: " + resultado);
                break;
            case "x":
            case "*":
                resultado = x * y;
                System.out.println("multiplicação dos números: " + resultado);
                break;
            case "/":
                resultado = x / y;
                System.out.println("Divisão dos números: " + resultado);
                break;
            default:
                System.out.println("operador inválido");
        }

        if ((resultado % 2) == 0) System.out.println(resultado + " é par");
        else System.out.println(resultado + " é ímpar");

        if (resultado >= 0) System.out.println(resultado + " é positivo");
        else System.out.println(resultado + " é negativo");

    }
}
