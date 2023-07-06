package org.example.ejercicio_11.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_10.clases.Animal;

public class Mascota extends Animal implements Ipropietario{

    //ATRIBUTOS
    private String nombre;
    private String propietario;

    //CONSTRUCTORES
    public Mascota(Reino reino, Tipo tipo, String raza, Medio medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio);
        this.nombre = nombre;
        this.propietario=propietario;
    }

    //CONSTRUCTOR COPIA
    public Mascota(Mascota mascota) {
        super(mascota);
        this.nombre = mascota.nombre;
        this.propietario=mascota.propietario;
    }


    //GETTERS
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getPropietario() {
        return propietario;
    }

    @Override
    public void setPropietario() {

    }
}
