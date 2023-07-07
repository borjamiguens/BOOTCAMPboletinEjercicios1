package org.example.ejercicio_12.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_09.clases.Animal;
import org.example.ejercicio_11.clases.AnimalGranja;

public class Vaca extends AnimalGranja {

    //CONSTRUCTORES
    public Vaca(Reino reino, Tipo tipo, String raza, Medio medio, String propietario) {
        super(reino, tipo, raza, medio, propietario);
    }

    //CONSTRUCTOR COPIA
    public Vaca(Vaca vaca) {
        super(vaca);
    }
}
