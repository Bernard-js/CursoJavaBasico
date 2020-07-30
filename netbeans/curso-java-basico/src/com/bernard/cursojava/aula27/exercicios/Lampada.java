package com.bernard.cursojava.aula27.exercicios;

public class Lampada {
    String marca;
    String tipo;
    int potencia;
    double preco;
    boolean acesa;
    
    void ligar(){
        this.acesa = true;
    }
    
    void desligar(){
        this.acesa = false;
    }
}
