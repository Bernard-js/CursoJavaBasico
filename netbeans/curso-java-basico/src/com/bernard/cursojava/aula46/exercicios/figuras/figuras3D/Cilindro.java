package com.bernard.cursojava.aula46.exercicios.figuras.figuras3D;

import com.bernard.cursojava.aula46.exercicios.figuras.Figura3D;

public class Cilindro extends Figura3D {

    private double raioBase;
    private double altura;
    private final double AREA_BASE = Math.PI * raioBase * raioBase;


    //Calula a área total da superfície cilindrica
    @Override
    public double calcularArea() {

        double areaLateral = 2 * Math.PI * raioBase * altura;

        return (2 * AREA_BASE) + areaLateral;
    }

    @Override
    public double calcularVolume() {
        
        return (AREA_BASE * altura);
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setRaioBase(double raioBase) {
        this.raioBase = raioBase;
    }

    public double getAltura() {
        return altura;
    }

    public double getRaioBase() {
        return raioBase;
    }
    
}
