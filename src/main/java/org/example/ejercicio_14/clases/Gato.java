package org.example.ejercicio_14.clases;

import org.example.ejercicio_09.Animal;

public class Gato extends Mascota {

    //CONSTRUCTORES
    public Gato(String reino, String tipo, String raza, String medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio, nombre, propietario);
    }

    public Gato(Animal animal, String nombre, String Propietario) {
        super(animal, nombre, Propietario);
    }
}
