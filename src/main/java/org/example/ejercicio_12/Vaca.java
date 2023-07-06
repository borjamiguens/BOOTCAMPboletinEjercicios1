package org.example.ejercicio_12;

import org.example.ejercicio_09.clases.Animal;
import org.example.ejercicio_11.clases.AnimalGranja;

public class Vaca extends AnimalGranja {

    //CONSTRUCTORES
    public Vaca(String reino, String tipo, String raza, String medio, String propietario) {
        super(reino, tipo, raza, medio, propietario);
    }

    public Vaca(Animal animal, String Propietario) {
        super(animal, Propietario);
    }
}
