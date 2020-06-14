package com.bernard.cursojava.aula17.exercicios;

public class Exercicio24 {
    public static void main(String[] args) {

        System.out.println("Preço do pão: R$ 0.18");
        System.out.println("Panificadora Cacetinho - Tabela de Preços");

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " - " + (0.18 * i));
        }
    }
}