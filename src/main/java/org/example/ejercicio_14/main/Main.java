package org.example.ejercicio_14.main;


import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_13.clases.Animal;
import org.example.ejercicio_14.clases.*;

import java.util.ArrayList;

import static org.example.ejercicio_13.clases.Animal.listaAnimales;
import static org.example.ejercicio_13.clases.AnimalGranja.listaAnimalesGranja;
import static org.example.ejercicio_13.clases.AnimalSalvaje.listaAnimalesSalvajes;
import static org.example.ejercicio_13.clases.Mascota.listaMascotas;
import static org.example.ejercicio_14.clases.Zoo.creaAnimales;


public class Main {
    public static void main(String[] args) {
        Zoo.creaAnimales();
        for(Animal e : listaAnimales){
            System.out.println(e);
        }
        System.out.println("El primer animal es un " + listaAnimales.get(0).getTipo() + " y es " + listaAnimales.get(0).getSexo());
        listaAnimales.get(0).setSexo(Sexo.HEMBRA);
        System.out.println("Si le cambiasemos el sexo al " + listaAnimales.get(0).getTipo() + " sería " + listaAnimales.get(0).getSexo());
    }
}

