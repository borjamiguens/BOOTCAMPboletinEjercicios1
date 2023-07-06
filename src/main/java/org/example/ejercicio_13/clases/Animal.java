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
    //protected static ArrayList<Integer> listaId= new ArrayList<>();
    protected static Integer Id=0;

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
    protected abstract Animal cloneAnimal();

    @Override
    public String toString() {
        return "Animal{" +
                "Reino='" + reino + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Raza='" + raza + '\'' +
                ", Medio='" + medio + '\'' +
                ", Sexo='" + sexo + '\'' +
                ", Padre='" + padre + '\'' +
                ", Madre='" + madre + '\'' +
                ", Generacion='" + generacion + '\'' +
                '}';
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected Integer generaId(){
        Id++;
        //listaId.add(Id);
        return Id;
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

    public Sexo getSexo() {
        return sexo;
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

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }


}
