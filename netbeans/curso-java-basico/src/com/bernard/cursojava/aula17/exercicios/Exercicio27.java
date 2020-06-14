package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean sair = false;
        String novoEstudo;
        int numTemp;
        int temperatura;
        int maiorTemp = Integer.MIN_VALUE;
        int menorTemp = Integer.MAX_VALUE;
        int soma = 0;
        double media;

        while(!sair){
            System.out.println("Você deseja fazer um novo estudo? (S/n)");
            novoEstudo = scanner.next();

            if(novoEstudo.equalsIgnoreCase("s")){
                System.out.println("Quantas temperaturas você gostaria de estudar?");
                numTemp = scanner.nextInt();

                for (int i = 1; i <= numTemp; i++) {
                    System.out.println("digite a temperatura " + i + ":");
                    temperatura = scanner.nextInt();
                    if(temperatura > maiorTemp){
                        maiorTemp = temperatura;
                    }
                    if(menorTemp > temperatura){
                        menorTemp = temperatura;
                    }
                    soma += temperatura;
                }

                media = soma / numTemp;

                System.out.println("Maior Temperatura: " + maiorTemp);
                System.out.println("Menor Temperatura: " + menorTemp);
                System.out.println("Média: " + media);
            } else {
                sair = true;
            }
        }
    }
}