package org.example.ejercicio_14.clases;

import org.example.ejercicio_09.Animal;

public class AnimalGranja extends Animal implements Ipropietario {

    //ATRIBUTOS
    String propietario;

    //CONSTRUCTORES
    public AnimalGranja(String reino, String tipo, String raza, String medio, String propietario) {
        super(reino, tipo, raza, medio);
        this.propietario=propietario;
    }

    public AnimalGranja(Animal animal, String Propietario) {
        super(animal);
        this.propietario=propietario;
    }

    @Override
    public String getPropietario() {
        return this.propietario;
    }

    @Override
    public void setPropietario() {

    }
}
