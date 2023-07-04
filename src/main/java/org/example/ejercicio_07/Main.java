package org.example.ejercicio_07;

public class Main {
    public static void main(String[] args) {


        String valor= Valor.imprimirValor(24);
        String valor2= Valor.imprimirValor(24.0f);
        String valor3= Valor.imprimirValor(24.00);
        String valor4= Valor.imprimirValor("veinticuatro");


        System.out.println(valor);
        System.out.println(valor2);
        System.out.println(valor3);
        System.out.println(valor4);

    }
}
