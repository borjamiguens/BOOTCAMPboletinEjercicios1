package org.example.ejercicio_10.main;

import org.example.ejercicio_09.clases.Animal;
import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_09.clases.Animal;



public class Main {
    public static void main(String[] args) {

        Animal perro1= new Animal(Reino.MAMIFERO, Tipo.PERRO,"bulldog", Medio.TERRESTRE);
        Animal gato1= new Animal(Reino.MAMIFERO,Tipo.GATO,"angora",Medio.TERRESTRE);
        Animal tucan1= new Animal(Reino.AVE,Tipo.TUCAN,"comun",Medio.AEREO);

        System.out.println(perro1.toString());
        System.out.println(gato1.toString());
        System.out.println(tucan1.toString());

        Animal perro2=new Animal(perro1);
        System.out.println(perro2.toString());

        Animal gato2=gato1.clone();
        System.out.println(gato2);

    }
}
