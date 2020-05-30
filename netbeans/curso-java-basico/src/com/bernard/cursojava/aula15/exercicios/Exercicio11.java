package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu salário atual?");
        float salarioAtual = scanner.nextFloat();


        float percentualAumento = 0;

        if (salarioAtual < 280) percentualAumento = 20;

        else if (salarioAtual < 700) percentualAumento = 15;

        else if (salarioAtual < 1500) percentualAumento = 10;

        else percentualAumento = 5;

        float aumento = salarioAtual * percentualAumento / 100;
        float novoSalário = salarioAtual + aumento;

        System.out.println("o seu salário atual é de: " + salarioAtual);
        System.out.println("O reajuste salarial será de " + percentualAumento + "%, o que corresponde a " + aumento + " Reais");
        System.out.println("O seu salário será de " + novoSalário + " Reais");
    }
}
