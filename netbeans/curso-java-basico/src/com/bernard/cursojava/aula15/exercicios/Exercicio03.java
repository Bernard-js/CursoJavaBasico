package com.bernard.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu sexo (M ou F)");
        String sexo = scanner.next();

        if (sexo.equalsIgnoreCase("M")){
            System.out.println("Masculino");
        } else if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
}