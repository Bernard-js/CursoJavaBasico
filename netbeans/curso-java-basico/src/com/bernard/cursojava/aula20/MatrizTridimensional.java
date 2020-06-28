package com.bernard.cursojava.aula20;

public class MatrizTridimensional {
    public static void main(String[] args) {
        
        int[][][] matrix3D = new int[3][3][3];
        
        for (int i = 0; i < matrix3D.length; i++) {
            for (int j = 0; j < matrix3D[i].length; j++) {
                for (int k = 0; k < matrix3D[i][j].length; k++) {
                    
                    System.out.println("i = " + i + "  j = " + j + "  k = " + k);
                    matrix3D[i][j][k] = i + j + k;
                }
            }
        }
        
        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for(int i = 0; i < matrix3D.length; i++){
            for(int j = 0; j < matrix3D[i].length; j++){
                for(int k = 0; k < matrix3D[i][j].length; k++){
                    
                    soma += matrix3D[i][j][k];
                    
                    if (matrix3D[i][j][k] % 2 == 0) {
                        somaPares += matrix3D[i][j][k];
                    } else {
                        somaImpares += matrix3D[i][j][k];
                    }
                }
            }
        }
        
        System.out.println("Soma = " + soma);
        System.out.println("Soma dos Pares = " + somaPares);
        System.out.println("Soma dos Ímpares = " +somaImpares);
    }
}
