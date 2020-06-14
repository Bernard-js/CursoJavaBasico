package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        System.out.println("Lojas Tabajara");

        Scanner scanner = new Scanner(System.in);
        
        String continuarCompra;
        String output = "";
        boolean sair = false;
        int numProdutos = 0;
        int limite;
        double total = 0;
        double precoProduto;
        double dinheiro;
        double troco;
        

        while(!sair){
            System.out.println("Deseja continuar compra? (S/n)");
            continuarCompra = scanner.next();

            if (continuarCompra.equalsIgnoreCase("s")){
                System.out.println("Quantos produtos você deseja comprar?");
                numProdutos = scanner.nextInt();
                limite = numProdutos + 1;
                
                for (int i = 1; i <= limite; i++) {
                    
                    if (i == limite){
                        precoProduto = 0;
                    } else {
                        System.out.println("Qual o preço do produto " + i + "?");
                        precoProduto = scanner.nextDouble();
                    }
                    
                    total += precoProduto;
                    output += "Produto " + i + ": R$ " + precoProduto + "\n";

                }

                output += "Total: R$ " + total + "\n";

                System.out.println("Quanto dinheiro você pagará?");
                dinheiro = scanner.nextDouble();
                
                output += "Dinheiro: R$ " + dinheiro + "\n";

                troco = dinheiro - total;

                output += "Troco: R$ " + troco;

                System.out.println(output);
            } else {
                sair = true;
            }
        }

    }
}