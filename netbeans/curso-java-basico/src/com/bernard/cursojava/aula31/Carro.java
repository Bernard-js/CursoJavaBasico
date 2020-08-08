package com.bernard.cursojava.aula31;

public class Carro {
    
    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel;

    public Carro(String marca, String modelo, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() { }
    
    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + "km");
    }
    
    private double calcCombGasto(double km){
        return km / this.consumoCombustivel;
    }
    
    public double calcQtdComb(double km){
        return calcCombGasto(km);
    }
    
    public double obterAutonomia(){
        System.out.println("O método obterAutonomia foi chamado!");
        return this.capCombustivel * this.consumoCombustivel;
    }
}
