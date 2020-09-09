package com.bernard.cursojava.aula43.exercicios.exer03;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(){
        this.ambiente = "Terra";
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Animal: " + getNome() + "\n" +
                "Comprimento: " + getComprimento() + " cm \n" +
                "Patas: " + getNumPatas() + "\n" +
                "Cor: " + getCor() + "\n" +
                "Ambiente: " + getAmbiente() + "\n" +
                "Velocidade: " + getVelocidade() + "m/s \n" +
                "alimento: " + getAlimento();
    }
}
