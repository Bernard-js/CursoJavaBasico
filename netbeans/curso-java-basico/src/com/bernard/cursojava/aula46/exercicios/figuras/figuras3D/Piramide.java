package com.bernard.cursojava.aula46.exercicios.figuras.figuras3D;

import com.bernard.cursojava.aula46.exercicios.figuras.Figura3D;

public class Piramide extends Figura3D  {
    
    private double arestaBase;
    private double altura;
    private double numLadosBase;
    private final double APOTEMA = Math.sqrt((altura * altura) + (arestaBase / 2 * arestaBase / 2));
    private final double AREA_BASE = arestaBase * arestaBase;
    
    @Override
    public double calcularArea() {
        return AREA_BASE + (numLadosBase * APOTEMA * arestaBase / 2);
    }

    @Override
    public double calcularVolume() {
        return ( 1 / 3 * AREA_BASE * altura);
    }

    public double getAPOTEMA() {
        return APOTEMA;
    }

    public double getAREA_BASE() {
        return AREA_BASE;
    }

    public double getAltura() {
        return altura;
    }

    public double getNumLadosBase() {
        return numLadosBase;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public void setNumLadosBase(double numLadosBase) {
        this.numLadosBase = numLadosBase;
    }

}
