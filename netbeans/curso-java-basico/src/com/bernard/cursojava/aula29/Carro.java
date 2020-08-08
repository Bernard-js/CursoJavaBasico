package com.bernard.cursojava.aula29;

import com.bernard.cursojava.aula27.*;

public class Carro {
    
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro() {
        System.out.println("A classe carro foi instanciada");
        numPassageiros = 4;
    }

    public Carro(String marca_){
        marca = marca_;
    }

    public Carro(String marca_, String modelo_, int numPassageiros_, 
            double capCombustivel_, double consumoCombustivel_) {
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }
    
    
    
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
    }
    
    double obterAutonomia(){
        System.out.println("O método obterAutonomia foi chamado!");
        return capCombustivel * consumoCombustivel;
    }
    
    double calcularCombustivel(double km){
        double qtdCombustivel = km / consumoCombustivel;
        
        return qtdCombustivel;
    }
}
