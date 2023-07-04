package org.example.ejercicio_14.clases;

import org.example.ejercicio_14.clases.Animal;

public abstract class AnimalSalvaje extends Animal {

    //CONSTRUCTORES
    public AnimalSalvaje(String reino, String tipo, String raza, String medio) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
    }

    public AnimalSalvaje(Animal animal) {
        this.reino=animal.reino;
        this.tipo = animal.tipo;
        this.raza = animal.raza;
        this.medio = animal.medio;
    }


}
