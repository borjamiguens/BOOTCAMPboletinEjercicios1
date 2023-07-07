package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_14.clases.ISexual;

import java.util.ArrayList;

public abstract class Animal implements ISexual {

    //ATRIBUTOS
    public static ArrayList<Animal> listaAnimales = new ArrayList<>();


    protected Reino reino;
    protected Tipo tipo;
    protected String raza;
    protected Medio medio;
    protected Sexo sexo;
    protected Animal padre;
    protected Animal madre;

    protected int generacion;


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
                ", Generacion='" + generacion + '\'' +
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


    public Animal getPadre() {
        return padre;
    }

    public Animal getMadre() {
        return madre;
    }

    public int getGeneracion() {
        return generacion;
    }

    @Override
    public Sexo getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
