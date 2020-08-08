package com.bernard.cursojava.aula27.exercicios;

public class Exer02 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.numero = 2323424;
        cc.agencia = 645443;
        cc.especial = false;
        cc.limite = 10000.00;
        cc.saldo = 5000.00;
        
        cc.consultarSaldo();
        cc.depositarDinheiro(255.00);
        cc.consultarSaldo();
        
        cc.realizarSaque(3000.00);
        cc.consultarSaldo();
        
        cc.realizarSaque(4000.00);
        System.out.println("usando cheque especial? " + cc.usandoChequeEspecial);
    }
}
