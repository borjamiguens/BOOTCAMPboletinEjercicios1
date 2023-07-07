package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;

import java.util.ArrayList;

public abstract class Animal {

    //ATRIBUTOS
    public static ArrayList<Animal> listaAnimales = new ArrayList<>();


    protected Reino reino;
    protected Tipo tipo;
    protected String raza;
    protected Medio medio;


    //METODOS
    protected abstract void reproducirSonido();
    protected abstract void desplazarse();


    @Override
    public String toString() {
        return "Animal{" +
                "Reino='" + reino + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Raza='" + raza + '\'' +
                ", Medio='" + medio + '\'' +
                '}';
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
