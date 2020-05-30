package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do primeiro produto: ");
        double primeiroProduto = scanner.nextDouble();

        System.out.println("Digite o preço do segundo produto: ");
        double segundoProduto = scanner.nextDouble();

        System.out.println("Digite o preço do terceiro produto: ");
        double terceiroProduto = scanner.nextDouble();

        if (primeiroProduto <= segundoProduto){
            if (primeiroProduto <= terceiroProduto){
                System.out.println("compre o primeiro produto!");
            } else {
                System.out.println("compre o terceiro produto!");
            }
        } else if (segundoProduto <= terceiroProduto){
            System.out.println("compre o segundo produto!");
        } else {
            System.out.println("compre o terceiro produto!");
        }
    }
}
