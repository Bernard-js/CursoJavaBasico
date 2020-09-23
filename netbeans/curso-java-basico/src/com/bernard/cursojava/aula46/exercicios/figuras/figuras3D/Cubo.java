package com.bernard.cursojava.aula46.exercicios.figuras.figuras3D;

import com.bernard.cursojava.aula46.exercicios.figuras.DimensaoSuperficial;
import com.bernard.cursojava.aula46.exercicios.figuras.Figura3D;

public class Cubo extends Figura3D implements DimensaoVolumetrica, DimensaoSuperficial {

    private double lado;

    //Calula a área total da superfície cubica
    @Override
    public double calcularArea() {
        return 6 * lado * lado;
    }

    @Override
    public double calcularVolume() {
        return lado * lado * lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    
}
