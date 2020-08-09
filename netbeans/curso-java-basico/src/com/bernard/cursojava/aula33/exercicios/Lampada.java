package com.bernard.cursojava.aula33.exercicios;

public class Lampada {
    private String marca;
    private String tipo;
    private int potencia;
    private double preco;
    private boolean acesa;

    public Lampada(String marca, String tipo, int potencia) {
        this.marca = marca;
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isAcesa() {
        return acesa;
    }

    private void setAcesa(boolean acesa) {
        this.acesa = acesa;
    }
    
    void ligar(){
        setAcesa(true);
    }
    
    void desligar(){
        setAcesa(false);
    }
}
