package org.example.ejercicio_12.main;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_11.clases.AnimalGranja;
import org.example.ejercicio_11.clases.AnimalSalvaje;
import org.example.ejercicio_11.clases.Mascota;
import org.example.ejercicio_12.clases.Oveja;
import org.example.ejercicio_12.clases.Perro;
import org.example.ejercicio_12.clases.Tucan;
import org.example.ejercicio_12.clases.Vaca;

public class Main {
    public static void main(String[] args) {

        Perro perro1=new Perro(Reino.MAMIFERO, Tipo.PERRO,"bulldog", Medio.TERRESTRE,"Chucho","Juan");
        Oveja oveja1=new Oveja(Reino.MAMIFERO,Tipo.OVEJA,"churra",Medio.TERRESTRE,"Laureano");
        Tucan tucan1=new Tucan(Reino.AVE,Tipo.TUCAN,"comun",Medio.AEREO);

        System.out.println(perro1);
        perro1.setPropietario("Jose");
        System.out.println(perro1);

        System.out.println(oveja1);
        oveja1.setPropietario("Sinforiano");
        System.out.println(oveja1);

        System.out.println(tucan1);

    }
}
