package com.bernard.cursojava.aula26;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        van.exibirAutonomia();
        
        double autonomiaVan = van.obterAutonomia();
        System.out.println("A autonomia da van é:  " + autonomiaVan);
        System.out.println("A autonomia da van é:  " + van.obterAutonomia());
        
        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 5;
        fusca.capCombustivel = 70;
        fusca.consumoCombustivel = 0.5;
        
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        fusca.exibirAutonomia();
        
        double autonomiaFusca = fusca.obterAutonomia();
        System.out.println("A autonomia do fusca é:  " + autonomiaFusca);
        System.out.println("A autonomia do fusca é:  " + fusca.obterAutonomia());
    }
}
