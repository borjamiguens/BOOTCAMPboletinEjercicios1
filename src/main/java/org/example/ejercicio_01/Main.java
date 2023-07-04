package org.example.ejercicio_01;

import util.Input;

public class Main {
    public static void main(String[] args) {
        int numero= Input.integer();
        String paridad="";
        if(numero%2==0){
            paridad="par";
        } else
            paridad="impar";

        System.out.println("El número " + numero + " es " + paridad);
    }
}
