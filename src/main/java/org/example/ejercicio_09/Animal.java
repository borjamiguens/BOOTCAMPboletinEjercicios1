package org.example.ejercicio_09;

import java.util.ArrayList;

public class Animal {

    //ATRIBUTOS
    static ArrayList<Animal> listaAnimales=new ArrayList<>();
    private String reino;
    private String tipo;
    private String raza;
    private String medio;

    //CONSTRUCTORES
    public Animal(String reino, String tipo, String raza, String medio) {
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

    public Animal cloneAnimal(){
        return new Animal(this.reino, this.tipo, this.raza, this.medio);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    //GETTERS
    public String getReino() {
        return reino;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRaza() {
        return raza;
    }

    public String getMedio() {
        return medio;
    }
}
