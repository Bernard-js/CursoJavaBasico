package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio30 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o número da tabuada: ");
        short tabuada = scanner.nextShort();

        System.out.println("digite o inicio da tabuada: ");
        byte inicioTabuada = scanner.nextByte();

        System.out.println("digite o fim da tabuada: ");
        byte fimTabuada = scanner.nextByte();
        
        if (inicioTabuada <= fimTabuada){
            System.out.println("começar por: " + inicioTabuada);
            System.out.println("Terminar em: " + fimTabuada);
            System.out.println("");
            System.out.println("irei montar a tabuada de " + tabuada + " começando em " + inicioTabuada + " e terminando em " + fimTabuada);

            int resultado;
            while(inicioTabuada <= fimTabuada){
                resultado = tabuada * inicioTabuada;
                System.out.println(tabuada + " X " + inicioTabuada + " = " + resultado);
                inicioTabuada += 1;
            }
        } else {
            System.out.println("o início da tabuada deve ser um número menor que o fim da tabuada. tente novamente");
        }    
    }
}