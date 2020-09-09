package com.bernard.cursojava.aula43.exercicios.exer01;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public ContaEspecial(String nomeCliente, int numConta, double limite) {
        super(nomeCliente, numConta);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > this.limite)
            System.out.println("o valor requisitado é maior que o limite da sua conta, não é possível realizar o saque");
        else
            setSaldo(getSaldo() - valor);
    }
}
