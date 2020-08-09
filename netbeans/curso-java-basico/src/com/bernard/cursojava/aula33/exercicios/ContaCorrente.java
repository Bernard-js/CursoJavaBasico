package com.bernard.cursojava.aula33.exercicios;

import java.util.Scanner;

public class ContaCorrente {
    private int numero;
    private int agencia;
    private double saldo;
    private boolean especial;
    private double limite;
    private boolean usandoChequeEspecial;
    private Scanner scanner;

    public ContaCorrente(int numero, int agencia, boolean especial) {
        this.numero = numero;
        this.agencia = agencia;
        this.especial = especial;
        
        if (especial) {
            this.saldo = 150.00;
            this.limite = 10000.00;
        } else {
            this.saldo = 100.00;
            this.limite = 5000.00;
        }
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean isUsandoChequeEspecial() {
        return usandoChequeEspecial;
    }

    public void setUsandoChequeEspecial(boolean usandoChequeEspecial) {
        this.usandoChequeEspecial = usandoChequeEspecial;
    }
    
    void realizarSaque(double dinheiro){
        scanner = new Scanner(System.in);
        if (getSaldo() <= dinheiro) {
            
            setSaldo(getSaldo() - dinheiro);
            
            System.out.println("Você não tem saldo suficiente na conta");
            System.out.println("pedir empréstimo no cheque especial?(S/N)");
            String resposta = scanner.next();
            
            if (resposta.equalsIgnoreCase("s")) {
                setUsandoChequeEspecial(true);
                saldo = 0;
            } else {
                System.out.println("Sua conta está no vermelho.");
            }
        } else {
            setSaldo(getSaldo() - dinheiro);
        }
    }
    
    void depositarDinheiro(double dinheiro){
        setSaldo(getSaldo() + dinheiro);
    }
    
    void consultarSaldo(){
        System.out.println("o seu saldo atual é: " + getSaldo()); 
    }
    
    void verificarCheque(){
        if (isUsandoChequeEspecial()) {
            System.out.println("Você está usando o cheque especial");
        } else {
            System.out.println("Não está usando cheque");
        }
    }
    
}
