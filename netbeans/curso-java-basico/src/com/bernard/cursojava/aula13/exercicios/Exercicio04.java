package com.bernard.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe as notas dos 4 trimestres e será calculada a média");
        System.out.println("Nota do primeiro trimestre: ");
        float nota1 = scan.nextFloat();
        System.out.println("Nota do segundo trimestre: ");
        float nota2 = scan.nextFloat();
        System.out.println("Nota do terceiro trimestre: ");
        float nota3 = scan.nextFloat();
        System.out.println("Nota do quarto trimestre: ");
        float nota4 = scan.nextFloat();
        
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas: " + media);
    }
}

