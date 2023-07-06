package org.example.ejercicio_12;

import org.example.ejercicio_09.clases.Animal;
import org.example.ejercicio_11.clases.AnimalGranja;

public class Oveja extends AnimalGranja {

    //CONSTRUCTORES
    public Oveja(String reino, String tipo, String raza, String medio, String propietario) {
        super(reino, tipo, raza, medio, propietario);
    }

    public Oveja(Animal animal, String Propietario) {
        super(animal, Propietario);
    }
}
