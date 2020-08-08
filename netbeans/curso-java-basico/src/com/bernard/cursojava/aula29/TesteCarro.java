package com.bernard.cursojava.aula29;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        Carro van2 = new Carro("Fiat");
        van2.modelo = "Ducato";
        
        System.out.println(van2.marca);
        
        Carro van3 = new Carro("Fiat", "Ducato", 4, 100, 0.2);
        System.out.println(van3.marca);
        System.out.println(van3.modelo);
        System.out.println(van3.numPassageiros);
        System.out.println(van3.consumoCombustivel);
        System.out.println(van3.capCombustivel);

    }
}
