package org.example.ejercicio_12.clases;

import org.example.ejercicio_09.clases.Animal;
import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_11.clases.AnimalSalvaje;

public class PezPayaso extends AnimalSalvaje {

    //CONSTRUCTORES
    public PezPayaso(Reino reino, Tipo tipo, String raza, Medio medio) {
        super(reino, tipo, raza, medio);
    }

    public PezPayaso(PezPayaso pezPayaso) {
        super(pezPayaso);
    }
}
