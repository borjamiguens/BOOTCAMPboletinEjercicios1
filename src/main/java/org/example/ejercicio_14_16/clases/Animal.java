package org.example.ejercicio_14_16.clases;

import java.util.ArrayList;

public abstract class Animal implements ISexual {

    //ATRIBUTOS
    public static ArrayList<Animal> listaAnimales = new ArrayList<>();
    Enum reino;
    Enum tipo;
    String raza;
    Enum medio;
    Enum sexo;

    //CONSTRUCTORES
    /*public Animal(String reino, String tipo, String raza, String medio) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
    }

    public Animal(Animal animal) {
        this.reino=animal.reino;
        this.tipo = animal.tipo;
        this.raza = animal.raza;
        this.medio = animal.medio;
    }*/

    //METODOS
    abstract void reproducirSonido();

    abstract void desplazarse();

    @Override
    public String toString() {
        return "Animal{" +
                "Reino='" + reino + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Raza='" + raza + '\'' +
                ", Medio='" + medio + '\'' +
                '}';
    }

    abstract Animal cloneAnimal();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    //GETTERS
    public Enum getReino() {
        return reino;
    }

    public Enum getTipo() {
        return tipo;
    }

    public String getRaza() {
        return raza;
    }

    public Enum getMedio() {
        return medio;
    }

    public Enum getSexo() {
        return sexo;
    }
}
