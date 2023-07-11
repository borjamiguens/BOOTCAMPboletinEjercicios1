package org.example.ejercicio_15.main;

import org.example.ejercicio_13.clases.*;

import static org.example.ejercicio_13.clases.Animal.listaAnimales;
import static org.example.ejercicio_13.clases.AnimalGranja.listaAnimalesGranja;
import static org.example.ejercicio_13.clases.AnimalSalvaje.listaAnimalesSalvajes;
import static org.example.ejercicio_13.clases.Mascota.listaMascotas;
import static org.example.ejercicio_14.clases.Zoo.creaAnimales;

public class Main {
    public static void main(String[] args) {

        creaAnimales();
        /*for (Animal e : listaAnimales) {
            System.out.println(e.toString());
        }*/

        for (Animal e : listaAnimales) {
            if (e instanceof Mascota) {
                listaMascotas.add((Mascota) e);
            }
            if (e instanceof AnimalSalvaje) {
                listaAnimalesSalvajes.add((AnimalSalvaje) e);
            }
            if (e instanceof AnimalGranja) {
                listaAnimalesGranja.add((AnimalGranja) e);
            }
        }

        for (Animal e : listaMascotas) {
            System.out.println("Lista Mascotas con " + e);
        }
        for (Animal e : listaAnimalesSalvajes) {
            System.out.println("Lista Salvajes con " + e);
        }
        for (Animal e : listaAnimalesGranja) {
            System.out.println("Lista Granja con " + e);
        }

    }
}
