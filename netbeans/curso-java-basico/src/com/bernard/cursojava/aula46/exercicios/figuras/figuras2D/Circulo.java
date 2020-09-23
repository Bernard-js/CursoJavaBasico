package com.bernard.cursojava.aula46.exercicios.figuras.figuras2D;

import com.bernard.cursojava.aula46.exercicios.figuras.DimensaoSuperficial;
import com.bernard.cursojava.aula46.exercicios.figuras.Figura2D;

public class Circulo extends Figura2D {

    private double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
