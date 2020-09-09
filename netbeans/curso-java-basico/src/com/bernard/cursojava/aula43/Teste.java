package com.bernard.cursojava.aula43;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setCurso("ciencia da computação");
        int[] notas = {1, 4, 8, 3, 7};
        aluno.setNotas(notas);
        System.out.println(aluno);

        String s1 = "sjkkjsdjsfskjskjsd";
        String s2 = "sjkkjsdjsfskjskjsd";

        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();
        aluno2.setCurso("ciencia da computação");
        int[] notas2 = {2, 3, 8, 9, 10};
        aluno2.setNotas(notas2);
        System.out.println(aluno.equals(aluno2));


    }
}
