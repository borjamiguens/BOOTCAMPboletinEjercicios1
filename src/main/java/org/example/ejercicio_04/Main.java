package org.example.ejercicio_04;

import util.Input;

public class Main {
    public static void main(String[] args) {

        int numero= Input.integer();
        int resultado=numero;


        for(int i=numero-1; i>0; i--){
            resultado*=i;
        }

        System.out.println("El numero factorial de " + numero + " es " + resultado );

    }
}
