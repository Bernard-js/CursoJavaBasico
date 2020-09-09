package com.bernard.cursojava.aula43.exercicios.exer03;

public class Teste {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Mamifero mamifero = new Mamifero();
        Peixe peixe = new Peixe();

        peixe.setNome("Tubarão");
        peixe.setComprimento(300);
        peixe.setVelocidade(1.5);

        animal.setNome("Camelo");
        animal.setComprimento(150);
        animal.setCor("Amarelo");
        animal.setAmbiente("Terra");
        animal.setVelocidade(2.0);

        mamifero.setNome("Urso-do-canadá");
        mamifero.setComprimento(180);
        mamifero.setCor("Vermelho");
        mamifero.setVelocidade(0.5);
        mamifero.setAlimento("Mel");

        System.out.println("Zoo:");
        System.out.println("----------------------------------------");
        System.out.println(animal.toString());
        System.out.println("----------------------------------------");
        System.out.println(peixe.toString());
        System.out.println("----------------------------------------");
        System.out.println(mamifero.toString());
        System.out.println("-----------------------------------------");
    }
}
