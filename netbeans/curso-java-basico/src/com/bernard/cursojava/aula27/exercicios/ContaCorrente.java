package com.bernard.cursojava.aula27.exercicios;

import java.util.Scanner;

public class ContaCorrente {
    int numero;
    int agencia;
    double saldo;
    boolean especial;
    double limite;
    boolean usandoChequeEspecial;
    Scanner scanner;
    
    void realizarSaque(double dinheiro){
        scanner = new Scanner(System.in);
        if (saldo <= dinheiro) {
            
            saldo -= dinheiro;
            
            System.out.println("Você não tem saldo suficiente na conta");
            System.out.println("pedir empréstimo no cheque especial?(S/N)");
            String resposta = scanner.next();
            
            if (resposta.equalsIgnoreCase("s")) {
                usandoChequeEspecial = true;
                saldo = 0;
            } else {
                System.out.println("Sua conta está no vermelho.");
            }
        } else {
            saldo = saldo - dinheiro;
        }
    }
    
    void depositarDinheiro(double dinheiro){
        saldo = saldo + dinheiro;
    }
    
    void consultarSaldo(){
        System.out.println("o seu saldo atual é: " + this.saldo); 
    }
    
    void verificarCheque(){
        if (usandoChequeEspecial) {
            System.out.println("Você está usando o cheque especial");
        } else {
            System.out.println("Não está usando cheque");
        }
    }
}
