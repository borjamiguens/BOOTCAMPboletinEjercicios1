package org.example.ejercicio_14_16.clases;

import org.example.ejercicio_13.Animal;

import java.util.ArrayList;

public abstract class Mascota extends Animal implements IPropietario {

    public static ArrayList<Animal> listaMascotas = new ArrayList<>();

    //ATRIBUTOS
    String nombre;
    String propietario;

    //CONSTRUCTORES
    /*public Mascota(String reino, String tipo, String raza, String medio, String nombre, String propietario) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
        this.nombre = nombre;
        this.propietario=propietario;
    }

    public Mascota(Animal animal) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
        this.nombre = nombre;
        this.propietario=propietario;
    }*/


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

    //abstract Animal cloneAnimal();
}
