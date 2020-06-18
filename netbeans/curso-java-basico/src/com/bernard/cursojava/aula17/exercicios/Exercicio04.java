package com.bernard.cursojava.aula17.exercicios;

public class Exercicio04 {

    public static void main(String[] args) {

        long habitantesA = 80000l;
        long habitantesB = 200000l;

        float crescimentoA = 0.03f;
        float crescimentoB = 0.015f;

        int i;
        for (i = 0; habitantesA <= habitantesB; i++) {
            habitantesA += crescimentoA * habitantesA;
            habitantesB += crescimentoB * habitantesB;
        }
        
        System.out.println("População de A: " + habitantesA);
        System.out.println("População de B: " + habitantesB);
        System.out.println("quantidade de anos: " + i);
    }
}
