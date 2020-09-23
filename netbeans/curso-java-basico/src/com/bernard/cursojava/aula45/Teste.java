package com.bernard.cursojava.aula45;

public class Teste {
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Pessoa alunoPessoa = aluno; //Upcasting

        Pessoa aluno2 = (Pessoa) new Aluno();

        Pessoa aluno3 = new Pessoa();
        Aluno aluno4 = (Aluno) aluno3;

        //Instanceof
        Pessoa pessoa = new Pessoa();

        if (pessoa instanceof Pessoa) System.out.println("é do tipo pessoa");
    }
}
