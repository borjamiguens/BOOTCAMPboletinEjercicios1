package org.example.ejercicio_14_16.clases;


import org.example.ejercicio_13.Animal;

public class Gato extends Mascota {

    //CONSTRUCTORES

    public Gato() {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.GATO;
        this.raza = "";
        this.medio = Medio.TERRESTRE;
        this.nombre = "";
        this.propietario = "";
    }

    public Gato(String nombre) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.GATO;
        this.raza = "";
        this.medio = Medio.TERRESTRE;
        this.nombre = nombre;
        this.propietario = "";
    }

    public Gato(String raza, String nombre, String propietario) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.GATO;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.nombre = nombre;
        this.propietario = propietario;
    }

    public Gato(Animal animal) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.GATO;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.nombre = nombre;
        this.propietario = propietario;
    }


    //METODOS A IMPLEMENTAR MAS ABAJO(EN JERARQUIA)
    @Override
    public void reproducirSonido() {
        System.out.println("miau");
    }

    @Override
    public void desplazarse() {
        System.out.println("camina");
    }

    @Override
    protected Animal cloneAnimal() {
        Gato newGato=new Gato(this.raza, this.nombre, this.propietario);
        newGato.sexo=this.sexo;
        return newGato;
    }


    @Override
    public void setSexo(Enum sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Reino='" + reino + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Raza='" + raza + '\'' +
                ", Medio='" + medio + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Propietario='" + propietario + '\'' +
                '}';
    }

    /*@Override
    Animal cloneAnimal() {
        Gato newGato=new Gato(this.raza, this.nombre, this.propietario);
        newGato.sexo=this.sexo;
        return newGato;
    }*/
}
