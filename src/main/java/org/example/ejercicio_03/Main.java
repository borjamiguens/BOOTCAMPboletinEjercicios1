package org.example.ejercicio_03;

import util.Input;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int numero= Input.integer();
        ArrayList<Integer> arrayDivisores=new ArrayList<Integer>();

        //para cada número desde 1 hasta el numero en cuestion compruebo si es divisible
        for(int i=1;i<numero;i++){
            //si el resto es 0 añado el numero al arrayList
            if(numero%i==0)
            {
                arrayDivisores.add(i);
            }
        }
        System.out.println("Los numero divisores de " + numero + " son:");
        //para cada elemento del arrayList (divisible) lo imprimo
        for(Integer e : arrayDivisores) {
            System.out.println(e);
        }

    }
}
