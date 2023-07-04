package org.example.ejercicio_06;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    int numeroIteraciones=20;
    ArrayList<Integer> arrayNumeros=new ArrayList<>();
    arrayNumeros.add(0);
    arrayNumeros.add(1);

    for(int i=2; i < numeroIteraciones; i++){

        arrayNumeros.add(arrayNumeros.get(i-1) + arrayNumeros.get(i-2));

    }
    for(Integer e : arrayNumeros){
        System.out.println(e);
    }

    }
}
