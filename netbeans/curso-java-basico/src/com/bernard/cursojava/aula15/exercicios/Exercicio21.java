package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("qual combustível você quer colocar?(G - gasolina, A - álcool)");
        String combustivel = scanner.next();

        System.out.println("Qual a quantidade de combustível em Litros?");
        float quantidade = scanner.nextFloat();

        float valorPorLitro;
        float desconto = 0;


        if (combustivel.equalsIgnoreCase("G")) {
            valorPorLitro = 2.5f;

            if (quantidade > 0 && quantidade <= 20){
                desconto = 3 * valorPorLitro / 100;
            } else if (quantidade > 20) {
                desconto = 5 * valorPorLitro / 100;
            } else {
                System.out.println("Não existe quantidade de combustível negativa");
            }

            float valorFinal = quantidade * (valorPorLitro - desconto);
            System.out.println("Valor à ser pago: " + valorFinal);
        }
        if (combustivel.equalsIgnoreCase("A")){
            valorPorLitro = 1.9f;

            if (quantidade > 0 && quantidade <= 20){
                desconto = 3 * valorPorLitro / 100;
            } else if (quantidade > 20) {
                desconto = 5 * valorPorLitro / 100;
            } else {
                System.out.println("Não existe quantidade de combustível negativa");
            }

            float valorFinal = quantidade * (valorPorLitro - desconto);
            System.out.println("Valor à ser pago: " + valorFinal);
        }
        else System.out.println("não existe este combustível!");




    }
}
