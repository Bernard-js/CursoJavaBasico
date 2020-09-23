package com.bernard.cursojava.aula45;

public class Teste2 {
    
    public static void main(String[] args) {
        //DownCasting

        //exemplo 1: OK
        //retorno do método pode referenciar String
        Object obj1 = obterString();
        String s1 = (String) obj1;

        //exemplo2: OK
        //o2 referencia String explicitamente
        Object o2 = "Curso de Java";
        String s2 = (String) o2;

        //exemplo 3: FALHA em tempo de execução
        //o3 não referencia a String
        Object o3 = new Object();
        String s3 = (String) o3;

        //exemplo 4: FALHA em tempo de compilação
        //o4 nunca referencia String já que método é int
        Integer o4 = obterInteiro();
        //String s4 = (String) o4; 
    }

    public static String obterString(){
        return "Minha String";
    }

    public static int obterInteiro(){
        return 1;
    }
}
