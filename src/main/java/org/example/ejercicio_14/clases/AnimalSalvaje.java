package org.example.ejercicio_14.clases;

import org.example.ejercicio_09.Animal;

public class AnimalSalvaje extends Animal {
    public AnimalSalvaje(String reino, String tipo, String raza, String medio) {
        super(reino, tipo, raza, medio);
    }

    public AnimalSalvaje(Animal animal) {
        super(animal);
    }
}
