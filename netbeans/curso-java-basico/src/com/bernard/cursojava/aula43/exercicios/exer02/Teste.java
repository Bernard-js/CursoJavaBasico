package com.bernard.cursojava.aula43.exercicios.exer02;

public class Teste {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica1 = new PessoaFisica("Roberto", "63282764", 1500.0);
        PessoaFisica pessoaFisica2 = new PessoaFisica("Roberto", "63282764", 3500.0);
        PessoaFisica pessoaFisica3 = new PessoaFisica("Roberto", "63282764", 2300.0);
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Coca-Cola", "53663737", 10000000.0);
        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("Ambev", "53663737", 2300000.0);
        PessoaJuridica pessoaJuridica3 = new PessoaJuridica("Santander", "53663737", 8970000.0);

        System.out.println(pessoaFisica1.toString());
        System.out.println(pessoaFisica2.toString());
        System.out.println(pessoaFisica3.toString());
        System.out.println(pessoaJuridica1.toString());
        System.out.println(pessoaJuridica2.toString());
        System.out.println(pessoaJuridica3.toString());
    }
}
