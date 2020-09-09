package com.bernard.cursojava.aula43.exercicios.exer01;

public class Teste {
    public static void main(String[] args) {
        ContaEspecial contaEspecial = new ContaEspecial("Jonas", 782373, 7000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Nole", 635546);

        contaEspecial.setSaldo(5000.0);
        contaPoupanca.setSaldo(4000.0);

        contaEspecial.sacar(8000.0);
        contaPoupanca.sacar(2000.0);
        System.out.println(contaPoupanca.getSaldo());
        contaPoupanca.calcularNovoSaldo(7);
        System.out.println(contaPoupanca.getSaldo());

        contaPoupanca.toString();
        contaEspecial.toString();


    }

}
