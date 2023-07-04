package org.example.ejercicio_12;

import org.example.ejercicio_09.Animal;

public class PezPayaso extends Animal {

    //CONSTRUCTORES
    public PezPayaso(String reino, String tipo, String raza, String medio) {
        super(reino, tipo, raza, medio);
    }

    public PezPayaso(Animal animal) {
        super(animal);
    }
}
