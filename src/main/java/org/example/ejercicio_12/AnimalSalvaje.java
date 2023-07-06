package org.example.ejercicio_12;

import org.example.ejercicio_09.clases.Animal;

public class AnimalSalvaje extends Animal {
    public AnimalSalvaje(String reino, String tipo, String raza, String medio) {
        super(reino, tipo, raza, medio);
    }

    public AnimalSalvaje(Animal animal) {
        super(animal);
    }
}
