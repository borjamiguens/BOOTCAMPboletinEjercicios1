package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_11.clases.IPropietario;

import java.util.ArrayList;

public abstract class AnimalGranja extends Animal implements IPropietario {

    public static ArrayList<AnimalGranja> listaAnimalesGranja = new ArrayList<>();

    //ATRIBUTOS
    protected String propietario;


    //CONSTRUCTORES
    public AnimalGranja(Reino reino, Tipo tipo, String raza, Medio medio, String propietario, Sexo sexo, AnimalGranja padre, AnimalGranja madre, int generacion) {
        super(reino, tipo, raza, medio,sexo, padre, madre, generacion);
        this.propietario=propietario;
    }

    //CONSTRUCTOR COPIA
    public AnimalGranja(AnimalGranja animalGranja) {
        super(animalGranja);
        this.propietario=propietario;
    }



    //METODOS

    @Override
    public String toString() {
        return super.toString() +
                ", Propietario='" + propietario + '\'' +
                '}';
    }
    public String getPropietario() {
        return this.propietario;
    }

    public void setPropietario(String nombre) {
        this.propietario=nombre;
    }


}
