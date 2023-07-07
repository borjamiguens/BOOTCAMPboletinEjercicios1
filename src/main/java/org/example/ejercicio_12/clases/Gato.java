package org.example.ejercicio_12.clases;

import org.example.ejercicio_09.clases.Animal;
import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_11.clases.Mascota;

public class Gato extends Mascota {

    //CONSTRUCTORES
    public Gato(Reino reino, Tipo tipo, String raza, Medio medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio, nombre, propietario);
    }

    //CONSTRUCTOR COPIA
    public Gato(Gato gato) {
        super(gato);
    }
}
