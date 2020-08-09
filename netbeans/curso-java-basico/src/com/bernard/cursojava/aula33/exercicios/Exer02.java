package com.bernard.cursojava.aula33.exercicios;

public class Exer02 {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(23452626, 718728, true);
        
        System.out.println("Número: " + c1.getNumero());
        System.out.println("Agência: " + c1.getAgencia());
        c1.consultarSaldo();
        c1.depositarDinheiro(250);
        c1.consultarSaldo();
        c1.realizarSaque(500);
        c1.verificarCheque();
        c1.consultarSaldo();
    }
}
