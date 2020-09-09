package com.bernard.cursojava.aula43.exercicios.exer03;

public class Peixe extends Animal {
    private String[] caracteristicas = {"Barbatanas", "Cauda"};

    public Peixe() {
        this.ambiente = "Mar";
        this.cor = "Cinza";
        this.numPatas = 0;
    }

    public String[] getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String[] caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        String s = "";
        for (String caracteristica : caracteristicas) {
            s += caracteristica + " e ";
        }

        return "Animal: " + getNome() + "\n" +
                "Comprimento: " + getComprimento() + "cm \n" +
                "Patas: " + getNumPatas() + "\n" +
                "Cor: " + getCor() + "\n" +
                "Ambiente: " + getAmbiente() + "\n" +
                "Velocidade: " + getVelocidade() + "m/s \n" +
                "Característica: " + s;
    }
}
