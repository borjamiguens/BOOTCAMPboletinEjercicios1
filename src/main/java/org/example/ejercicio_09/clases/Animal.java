package org.example.ejercicio_09.clases;

import java.util.ArrayList;

public class Animal {

    //ATRIBUTOS
    private Reino reino;
    private Tipo tipo;
    private String raza;
    private Medio medio;

    //CONSTRUCTORES
    public Animal(Reino reino, Tipo tipo, String raza, Medio medio) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
    }

    //CONSTRUCTOR DE COPIA
    public Animal(Animal animal) {
        this.reino=animal.reino;
        this.tipo = animal.tipo;
        this.raza = animal.raza;
        this.medio = animal.medio;
    }

    //METODOS
    @Override
    public String toString() {
        return "Animal{" +
                "Reino='" + reino + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Raza='" + raza + '\'' +
                ", Medio='" + medio + '\'' +
                '}';
    }

    //METODO CLONE
    @Override
    public Animal clone() {
        return new Animal(this.reino, this.tipo, this.raza, this.medio);
    }

    //GETTERS
    public Reino getReino() {
        return reino;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getRaza() {
        return raza;
    }

    public Medio getMedio() {
        return medio;
    }
}
