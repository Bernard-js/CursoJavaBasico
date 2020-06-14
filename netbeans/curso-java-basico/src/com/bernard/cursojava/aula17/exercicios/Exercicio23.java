package com.bernard.cursojava.aula17.exercicios;

public class Exercicio23 {
    public static void main(String[] args) {
        byte i = 1;
        float preco  = 1.99f;
        System.out.println("Lojas Java - Tabela de Preços");
        while(i <= 50){
            System.out.println(i + " - R$ " + preco);
            preco += 1.99f;
            i += 1;
	}
    }
}
