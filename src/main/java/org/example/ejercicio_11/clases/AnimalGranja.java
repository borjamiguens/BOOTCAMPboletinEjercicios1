package org.example.ejercicio_11.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_10.clases.Animal;

public class AnimalGranja extends Animal implements Ipropietario{

    //ATRIBUTOS
    String propietario;

    //CONSTRUCTORES
    public AnimalGranja(Reino reino, Tipo tipo, String raza, Medio medio, String propietario) {
        super(reino, tipo, raza, medio);
        this.propietario=propietario;
    }

    //CONSTRUCTOR COPIA
    public AnimalGranja(AnimalGranja animalGranja) {
        super(animalGranja);
        this.propietario=animalGranja.propietario;
    }

    @Override
    public String getPropietario() {
        return this.propietario;
    }

    @Override
    public void setPropietario() {

    }
}
