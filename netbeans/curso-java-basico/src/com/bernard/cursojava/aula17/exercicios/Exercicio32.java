package com.bernard.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio32 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean sair = false;
        String continuarCompra;
        String output = "";
        int codigo, quantidade;
        double preco, total;

        
        while(!sair){
            System.out.println("Deseja Realizar outra compra?(S/n)");
            continuarCompra = scanner.next();

            if(continuarCompra.equalsIgnoreCase("s")){

                System.out.println("Escreva o código do produto(entre 100 e 105): ");
                codigo = scanner.nextInt();
                System.out.println("Escreva a quantidade do produto: ");
                quantidade = scanner.nextInt();

                if(codigo == 100){
                    preco = 1.20;
                    total = preco * quantidade;
                    output += "Cachorro-Quente: preço = R$" + preco;
                    output += " - quantidade = " + quantidade;
                    output += " - total a pagar = R$" + total;
                }

                if(codigo == 101){
                    preco = 1.30;
                    total = preco * quantidade;
                    output += "Folhado: preço = R$" + preco;
                    output += " - quantidade = " + quantidade;
                    output += " - total a pagar = R$" + total;
                }

                if(codigo == 102){
                    preco = 1.50;
                    total = preco * quantidade;
                    output += "Sanduíche: preço = R$" + preco;
                    output += " - quantidade = " + quantidade;
                    output += " - total a pagar = R$" + total;
                }

                if(codigo == 103){
                    preco = 1.20;
                    total = preco * quantidade;
                    output += "Pizza: preço = R$" + preco;
                    output += " - quantidade = " + quantidade;
                    output += " - total a pagar = R$" + total;
                }

                if(codigo == 104){
                    preco = 1.30;
                    total = preco * quantidade;
                    output += "Cheeseburger: preço = R$" + preco;
                    output += " - quantidade = " + quantidade;
                    output += " - total a pagar = R$" + total;
                }

                if(codigo == 105){
                    preco = 1.00;
                    total = preco * quantidade;
                    output += "Pão na chapa: preço = R$" + preco;
                    output += " - quantidade = " + quantidade;
                    output += " - total a pagar = R$" + total;
                }
                System.out.println(output);
            } else {
                sair = true;
            }
        }
    }
}