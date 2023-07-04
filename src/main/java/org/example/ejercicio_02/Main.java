package org.example.ejercicio_02;

import util.Input;

public class Main {
    public static void main(String[] args) {

        int numero= Input.integer();
        String multiplo="no";
        //inicializo array de numeros primos
        int[] arrayPrimos={1,2,3,5,7};
        //voy a dividir el numero entre cada elemento del array de primos
        for(int i=0; i<arrayPrimos.length;i++)
        {
            if(numero%arrayPrimos[i]==0){
                multiplo="si";
                break;
            }else {
                multiplo="no";

            }

        }

        System.out.println("El número " + numero + " "+ multiplo + " es multiplo de algun numero primo del 1 al 10");
    }
}
