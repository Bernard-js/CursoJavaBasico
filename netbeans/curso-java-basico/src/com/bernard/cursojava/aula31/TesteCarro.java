package com.bernard.cursojava.aula31;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro("Fiat", "Ducato", 15);
        
        van.marca = "Fiat";
        
        System.out.println(van.calcQtdComb(25));
    }
}
