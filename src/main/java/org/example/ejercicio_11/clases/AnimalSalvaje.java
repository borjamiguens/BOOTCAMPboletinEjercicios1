package org.example.ejercicio_11.clases;

import org.example.ejercicio_10.clases.Animal;
import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Tipo;

import java.util.ArrayList;

public class AnimalSalvaje extends Animal {

    public static ArrayList<AnimalSalvaje> listaAnimalesSalvajesPrueba=new ArrayList<>();

    //CONSTRUCTORES
    public AnimalSalvaje(Reino reino, Tipo tipo, String raza, Medio medio) {
        super(reino, tipo, raza, medio);
    }

    //CONSTRUCTOR COPIA
    public AnimalSalvaje(AnimalSalvaje animalSalvaje) {
        super(animalSalvaje);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
