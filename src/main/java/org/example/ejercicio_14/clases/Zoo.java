package org.example.ejercicio_14.clases;

import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_13.clases.*;


import static org.example.ejercicio_13.clases.Animal.listaAnimales;

public class Zoo {
    public static void creaAnimales(){
        //CREAMOS ANIMALES Y LOS AÑADIMOS
        Perro perro1 = new Perro("bulldog", "Chucho", "Joaquín", Sexo.MACHO);
        Perro perro2 = new Perro("bulldog", "Chucha", "Felipe", Sexo.HEMBRA);
        Perro perro3 = new Perro("bulldog", "Chuchona", "Carlos", Sexo.HEMBRA);
        Perro perro4 = new Perro("bulldog", "Chuchon", "Ana", Sexo.MACHO);
        Perro perro5 = new Perro("bulldog", "Perraco", "Carlos", Sexo.MACHO);
        Perro perro6 = new Perro("bulldog", "Perraca", "Carlos", Sexo.HEMBRA);

        Gato gato1 = new Gato("angora", "Micho", "Andrea", Sexo.MACHO);
        Gato gato2 = new Gato("angora", "Micha", "Susana", Sexo.HEMBRA);
        Gato gato3 = new Gato("persa", "Michinha", "Andrea", Sexo.HEMBRA);
        Gato gato4 = new Gato("persa", "Michinho", "Susana", Sexo.MACHO);

        Tucan tucan1 = new Tucan("comun", Sexo.MACHO);
        Tucan tucan2 = new Tucan("comun", Sexo.HEMBRA);
        Tucan tucan3 = new Tucan("comun", Sexo.HEMBRA);

        PezPayaso pezPayaso1 = new PezPayaso("comun", Sexo.MACHO);
        PezPayaso pezPayaso2 = new PezPayaso("comun", Sexo.HEMBRA);
        PezPayaso pezPayaso3 = new PezPayaso("comun", Sexo.HEMBRA);

        Oveja oveja1 = new Oveja("churra", "Serafín", Sexo.MACHO);
        Oveja oveja2 = new Oveja("churra", "Serafín", Sexo.HEMBRA);
        Oveja oveja3 = new Oveja("churra", "Serafín", Sexo.HEMBRA);

        Vaca vaca1 = new Vaca("rubia", "Laureano", Sexo.MACHO);
        Vaca vaca2 = new Vaca("rubia", "Laureano", Sexo.HEMBRA);
        Vaca vaca3 = new Vaca("rubia", "Laureano", Sexo.HEMBRA);

        listaAnimales.add(perro1);
        listaAnimales.add(perro2);
        listaAnimales.add(perro3);
        listaAnimales.add(perro4);

        listaAnimales.add(gato1);
        listaAnimales.add(gato2);
        listaAnimales.add(gato3);
        listaAnimales.add(gato4);

        listaAnimales.add(tucan1);
        listaAnimales.add(tucan2);
        listaAnimales.add(tucan3);

        listaAnimales.add(pezPayaso1);
        listaAnimales.add(pezPayaso2);
        listaAnimales.add(pezPayaso3);

        listaAnimales.add(oveja1);
        listaAnimales.add(oveja2);
        listaAnimales.add(oveja3);

        listaAnimales.add(vaca1);
        listaAnimales.add(vaca2);
        listaAnimales.add(vaca3);
    }
}
