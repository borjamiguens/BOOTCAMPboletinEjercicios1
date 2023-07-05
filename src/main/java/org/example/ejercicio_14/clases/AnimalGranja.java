package org.example.ejercicio_14.clases;

import org.example.ejercicio_14.clases.Animal;

public abstract class AnimalGranja extends Animal implements Ipropietario {

    //ATRIBUTOS
    String propietario;

    //CONSTRUCTORES

    /*public AnimalGranja(String reino, String tipo, String raza, String medio, String propietario) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
        this.propietario = propietario;
    }

    public AnimalGranja(Animal animal) {
        this.reino = animal.reino;
        this.tipo = animal.tipo;
        this.raza = animal.raza;
        this.medio = animal.medio;
        this.propietario = propietario;
    }*/

    //METODOS
    @Override
    public String getPropietario() {
        return this.propietario;
    }

    @Override
    public void setPropietario() {

    }

}
