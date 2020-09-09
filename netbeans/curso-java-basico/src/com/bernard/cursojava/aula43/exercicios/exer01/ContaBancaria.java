package com.bernard.cursojava.aula43.exercicios.exer01;

public abstract class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    protected double saldo;

    public ContaBancaria(String nomeCliente, int numConta) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = 0.0;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }

    public void sacar(double valor){
        if (valor > this.saldo)
            System.out.println("Não é possível realizar o saque");
        else
            setSaldo(getSaldo() - valor);

    }

    public void depositar(double valor){
        setSaldo(getSaldo() + valor);
    }


}
