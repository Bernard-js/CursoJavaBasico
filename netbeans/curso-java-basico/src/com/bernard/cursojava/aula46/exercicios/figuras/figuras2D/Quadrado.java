package com.bernard.cursojava.aula46.exercicios.figuras.figuras2D;

import com.bernard.cursojava.aula46.exercicios.figuras.DimensaoSuperficial;
import com.bernard.cursojava.aula46.exercicios.figuras.Figura2D;

public class Quadrado extends Figura2D implements DimensaoSuperficial {

    private double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
