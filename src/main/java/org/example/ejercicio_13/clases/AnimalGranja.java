package org.example.ejercicio_13.clases;

import org.example.ejercicio_11.clases.IPropietario;

import java.util.ArrayList;

public abstract class AnimalGranja extends Animal implements IPropietario {

    public static ArrayList<Animal> listaAnimalesGranja = new ArrayList<>();

    //ATRIBUTOS
    protected String propietario;


    //METODOS

    public String getPropietario() {
        return this.propietario;
    }

    ;


    public void setPropietario(String nombre) {
        this.propietario=nombre;
    }


}
