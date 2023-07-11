package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_14.clases.ISexual;

import java.util.ArrayList;

public abstract class Animal implements ISexual {

    public static ArrayList<Animal> listaAnimales = new ArrayList<>();
    private static int contId=0;

    //ATRIBUTOS


    protected int id;
    protected Reino reino;
    protected Tipo tipo;
    protected String raza;
    protected Medio medio;
    protected Sexo sexo;
    protected Animal padre;
    protected Animal madre;
    protected int generacion;

    //CONSTRUCTORES
    public Animal(Reino reino, Tipo tipo, String raza, Medio medio, Animal padre, Animal madre, int generacion) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
        this.sexo = sexo;
        this.padre=padre;
        this.madre=madre;
        this.generacion=generacion;
        this.id=generarId();
    }

    //CONSTRUCTOR COPIA
    public Animal(Animal animal) {
        this.reino = animal.reino;
        this.tipo = animal.tipo;
        this.raza = animal.raza;
        this.medio = animal.medio;
        this.sexo=animal.sexo;
        this.padre=animal.padre;
        this.madre=animal.madre;
        this.generacion=animal.generacion;
        this.id=generarId();
    }

    //METODOS
    protected abstract void reproducirSonido();

    protected abstract void desplazarse();




    @Override
    public String toString() {
        return "Animal{" +
                "Id='" + id + '\'' +
                "Reino='" + reino + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Raza='" + raza + '\'' +
                ", Medio='" + medio + '\'' +
                ", Generacion='" + generacion + '\'' +
                '}';
    }


    //GETTERS


    public Integer getId() {
        return id;
    }

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
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public Sexo getSexo() {
        return sexo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReino(Reino reino) {
        this.reino = reino;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setMedio(Medio medio) {
        this.medio = medio;
    }

    public void setPadre(Animal padre) {
        this.padre = padre;
    }

    public void setMadre(Animal madre) {
        this.madre = madre;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }



    public int generarId() {
        return  contId++;
    }
}
