package com.bernard.cursojava.aula43;

public class Teste {
    public static void main(String[] args) {
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();


        aluno.setEndereco("Rua1, num1");
        professor.setEndereco("Rua2, num2");

        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());

    }
}
