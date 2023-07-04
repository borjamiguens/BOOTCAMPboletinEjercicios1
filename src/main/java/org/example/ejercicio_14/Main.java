package org.example.ejercicio_14;

import org.example.ejercicio_09.Animal;

public class Main {
    public static void main(String[] args) {

        Animal perro1= new Animal("mamifero","perro","bulldog","terrestre");
        Animal gato1= new Animal("mamifero","gato","angora","terrestre");
        Animal gaviota1= new Animal("ave","gaviota","atlantica","aereo");

        Animal.listaAnimales.add(perro1);
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
