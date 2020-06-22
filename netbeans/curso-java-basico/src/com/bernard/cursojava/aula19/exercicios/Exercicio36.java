package com.bernard.cursojava.aula19.exercicios;

public class Exercicio36 {
    public static void main(String[] args) {
        int[] vetor = new int[11];
        int potencia;
        System.out.print("vetor = ");
        for (int i = 0; i < vetor.length; i++) {
            potencia = 1;
            for (int j = 0; j < i; j++) {
                potencia = potencia * 2;
            }
            System.out.print(potencia + ", ");
        }
    }
}
