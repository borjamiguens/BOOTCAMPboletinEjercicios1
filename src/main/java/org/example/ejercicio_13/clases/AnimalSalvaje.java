package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_13.clases.Animal;

import java.util.ArrayList;

public abstract class AnimalSalvaje extends Animal {

    public static ArrayList<AnimalSalvaje> listaAnimalesSalvajes = new ArrayList<>();

    //CONSTRUCTORES
    public AnimalSalvaje(Reino reino, Tipo tipo, String raza, Medio medio, Sexo sexo, AnimalSalvaje padre, AnimalSalvaje madre, int generacion) {
        super(reino, tipo, raza, medio, sexo, padre, madre, generacion);
    }

    //CONSTRUCTOR COPIA
    public AnimalSalvaje(AnimalSalvaje animalSalvaje) {
        super(animalSalvaje);
    }

    @Override
    public String toString() {
        return super.toString() +
                '}';
    }

}
