package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a quantidade em Kg de maçãs que irá comprar: ");
        double maca = scanner.nextShort();


        System.out.println("Escreva a quantidade em Kg morangos que irá comprar: ");
        double morangos = scanner.nextShort();

        double pesoTotal = maca + morangos;
        double kgMaca = 0;
        double kgMorango = 0;

        if (pesoTotal >= 0 && pesoTotal <= 5){
            kgMaca = 1.80;
            kgMorango = 2.50;
        } else if (pesoTotal > 5){
            kgMaca = 1.50;
            kgMorango = 2.20;
        } else {
            System.out.println("Não existe quantidade negativa");
        }

        double valorTotal = maca * kgMaca + morangos * kgMorango;

        if (valorTotal > 25 || pesoTotal > 8){
            valorTotal = valorTotal * 90 / 100;
        }

        System.out.println("Valor a ser pago: " + valorTotal);


    }
}
