package org.example.ejercicio_14.main;

import org.example.ejercicio_14.clases.*;

import static org.example.ejercicio_14.clases.Animal.listaAnimales;


public class Main {
    public static void main(String[] args) {

        Perro perro1 = new Perro("mamifero", "perro", "bulldog", "terrestre", "Chucho", "Joaquín");
        Perro perro2 = new Perro("mamifero", "perro", "bulldog", "terrestre", "Chucha", "Felipe");
        Gato gato1 = new Gato("mamifero", "gato", "angora", "terrestre", "Micho", "Andrea");
        Gato gato2 = new Gato("mamifero", "gato", "angora", "terrestre", "Micha", "Susana");
        Tucan tucan1 = new Tucan("ave", "pajaro", "comun", "marino");
        Tucan tucan2 = new Tucan("ave", "pajaro", "comun", "marino");
        PezPayaso pezPayaso1 = new PezPayaso("pez", "pez tropical", "comun", "marino");
        PezPayaso pezPayaso2 = new PezPayaso("pez", "pez tropical", "comun", "marino");
        Oveja oveja1 = new Oveja("mamifero", "ovino", "churra", "terrestre", "Serafín");
        Oveja oveja2 = new Oveja("mamifero", "ovino", "churra", "terrestre", "Serafín");
        Vaca vaca1 = new Vaca("mamifero", "vacuno", "rubia", "terrestre", "Laureano");
        Vaca vaca2 = new Vaca("mamifero", "vacuno", "rubia", "terrestre", "Laureano");

        perro1.setSexo("macho");
        listaAnimales.add(perro1);
        perro2.setSexo("hembra");
        listaAnimales.add(perro2);

        gato1.setSexo("macho");
        listaAnimales.add(gato1);
        gato2.setSexo("hembra");
        listaAnimales.add(gato2);

        tucan1.setSexo("macho");
        listaAnimales.add(tucan1);
        tucan2.setSexo("hembra");
        listaAnimales.add(tucan2);

        pezPayaso1.setSexo("macho");
        listaAnimales.add(pezPayaso1);
        pezPayaso2.setSexo("hembra");
        listaAnimales.add(pezPayaso2);

        oveja1.setSexo("macho");
        listaAnimales.add(oveja1);
        oveja2.setSexo("hembra");
        listaAnimales.add(oveja2);

        vaca1.setSexo("macho");
        listaAnimales.add(vaca1);
        vaca2.setSexo("hembra");
        listaAnimales.add(vaca2);


        /*Animal perro2=new Animal(perro1);
        Animal perro3=perro1.cloneAnimal();
        listaAnimales.add(perro2);
        listaAnimales.add(perro3);

        for(Animal e : listaAnimales){
            System.out.println(e.toString());
        }*/

    }
}
