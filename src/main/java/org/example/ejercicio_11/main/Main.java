package org.example.ejercicio_11.main;


import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_09.clases.Animal;
import org.example.ejercicio_11.clases.AnimalGranja;
import org.example.ejercicio_11.clases.AnimalSalvaje;
import org.example.ejercicio_11.clases.Mascota;

import static org.example.ejercicio_11.clases.AnimalGranja.listaAnimalesGranjaPrueba;
import static org.example.ejercicio_11.clases.AnimalSalvaje.listaAnimalesSalvajesPrueba;
import static org.example.ejercicio_11.clases.Mascota.listaMascotasPrueba;

public class Main {
    public static void main(String[] args) {

        Mascota mascota1=new Mascota(Reino.MAMIFERO,Tipo.PERRO,"bulldog",Medio.TERRESTRE,"Chucho","Juan");
        AnimalGranja animalGranja1=new AnimalGranja(Reino.MAMIFERO,Tipo.OVEJA,"churra",Medio.TERRESTRE,"Laureano");
        AnimalSalvaje animalSalvaje1=new AnimalSalvaje(Reino.AVE,Tipo.TUCAN,"comun",Medio.AEREO);

        System.out.println(mascota1);
        mascota1.setPropietario("Jose");
        System.out.println(mascota1);

        System.out.println(animalGranja1);
        animalGranja1.setPropietario("Sinforiano");
        System.out.println(animalGranja1);

        System.out.println(animalSalvaje1);


    }
}
