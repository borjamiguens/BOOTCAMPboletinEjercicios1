package org.example.ejercicio_09.main;

import org.example.ejercicio_09.clases.Animal;
import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Tipo;

public class Main {
    public static void main(String[] args) {

        Animal perro1= new Animal(Reino.MAMIFERO, Tipo.PERRO,"bulldog", Medio.TERRESTRE);
        Animal gato1= new Animal(Reino.MAMIFERO,Tipo.GATO,"angora",Medio.TERRESTRE);
        Animal tucan1= new Animal(Reino.AVE,Tipo.TUCAN,"comun",Medio.AEREO);

        Animal.listaAnimales.add(perro1);
        Animal.listaAnimales.add(gato1);
        Animal.listaAnimales.add(tucan1);



        for(Animal e : Animal.listaAnimales){
            System.out.println(e.toString());
        }

    }
}
