package com.bernard.cursojava.aula40;


public class Teste {
    public static void main(String[] args) {
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();
        Pessoa pessoa = new Pessoa();

        aluno.setEndereco("Rua1, num1");
        professor.setEndereco("Rua2, num2");
        pessoa.setEndereco("Rua3, num3");

        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
        System.out.println(pessoa.obterEtiquetaEndereco());
    }
}
