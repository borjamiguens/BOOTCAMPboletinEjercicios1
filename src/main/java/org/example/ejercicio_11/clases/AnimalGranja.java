package org.example.ejercicio_11.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_09.clases.Animal;

import java.util.ArrayList;

public class AnimalGranja extends Animal implements IPropietario{

    //ATRIBUTOS
    String propietario;

    public static ArrayList<AnimalGranja> listaAnimalesGranjaPrueba = new ArrayList<>();

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
    public void setPropietario(String propietario) {
        this.propietario=propietario;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Reino='" + super.getTipo().toString() + '\'' +
                ", Tipo='" + super.getTipo().toString() + '\'' +
                ", Raza='" + super.getRaza().toString() + '\'' +
                ", Medio='" + super.getMedio().toString() + '\'' +
                ", propietario='" + propietario + '\'' +
                '}';
    }


}
