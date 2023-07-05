package org.example.ejercicio_14;

import org.example.ejercicio_14.clases.*;

public class Main {
    public static void main(String[] args) {

        Perro perro1= new Perro("mamifero","perro","bulldog","terrestre","Josh","Joaquín");
        Gato gato1= new Gato("mamifero","gato","angora","terrestre","Micho","Andrea");
        Tucan tucan1= new Tucan("ave","pajaro","comun","marino");
        PezPayaso pezPayaso1= new PezPayaso("pez","pez tropical","comun","marino");
        Oveja oveja1=new Oveja("mamifero","ovino","churra","terrestre","Serafín");
        Vaca vaca1=new Vaca("mamifero","vacuno","rubia","terrestre","Laureano");

        listaAnimales.
        Animal.add(perro1);
        Animal.listaAnimales.add(gato1);
        Animal.listaAnimales.add(gaviota1);

        Animal perro2=new Animal(perro1);
        Animal perro3=perro1.cloneAnimal();
        Animal.listaAnimales.add(perro2);
        Animal.listaAnimales.add(perro3);

        for(Animal e : Animal.listaAnimales){
            System.out.println(e.toString());
        }

    }
}
