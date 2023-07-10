package org.example.ejercicio_13.clases;

import org.example.ejercicio_11.clases.IPropietario;
import org.example.ejercicio_13.clases.Animal;

import java.util.ArrayList;

public abstract class Mascota extends Animal implements IPropietario {
    public static ArrayList<Animal> listaMascotas = new ArrayList<>();
    //ATRIBUTOS
    protected String nombre;
    protected String propietario;



    //GETTERS

    public String getNombre() {
        return nombre;
    }
    @Override
    public String getPropietario() {
        return propietario;
    }

    @Override
    public void setPropietario(String propietario) {
        this.propietario=propietario;
    }


}
