package com.bernard.cursojava.aula14;

import java.util.Scanner;

public class IfElse {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Coloque a sua idade");
        int idade = scan.nextInt();
        
        if(idade >= 18){
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
        
        //barato < 150
        //150 - 280 - pedir desconto
        // > 280 - muito caro
        
        System.out.println("Coloque o preço do imóvel em mil reais: ");
        double valor = scan.nextDouble();
        
        if (valor < 150) {
            System.out.println("é possivel pagar á vista");
        } else if (valor <= 280) {
            System.out.println("posso financiar com meu banco");
        } else {
            System.out.println("Impossível financiamento com o meu banco");
        }
    }
}

