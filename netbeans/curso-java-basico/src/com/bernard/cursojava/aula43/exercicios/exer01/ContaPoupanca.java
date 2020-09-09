package com.bernard.cursojava.aula43.exercicios.exer01;

public class ContaPoupanca extends ContaBancaria {

    private String diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta) {
        super(nomeCliente, numConta);
    }

    public void calcularNovoSaldo(double taxaRendimento){
        if (taxaRendimento >= 100 || taxaRendimento < 0)
            System.out.println("a taxa de rendimento é um numero de 0 a 100, tente novamente");
        else
            this.setSaldo(getSaldo() + (getSaldo() * taxaRendimento / 100));
    }

    public String getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(String diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
}