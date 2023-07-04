package org.example.ejercicio_14;

import org.example.ejercicio_14.clases.*;

public class Main {
    public static void main(String[] args) {

        Perro perro1= new Perro("mamifero","perro","bulldog","terrestre","Josh","Joaquín");
        Animal gato1= new Gato("mamifero","gato","angora","terrestre","Micho","Andrea");
        Animal tucan1= new Tucan("ave","gaviota","atlantica","aereo");
        Animal pezPayaso1= new Tucan("ave","gaviota","atlantica","aereo");

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
