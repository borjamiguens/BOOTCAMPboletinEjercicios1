package org.example.ejercicio_14_16.clases;


import org.example.ejercicio_13.Animal;

public class Perro extends Mascota {

    //CONSTRUCTORES

    public Perro() {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.PERRO;
        this.raza = "";
        this.medio = Medio.TERRESTRE;
        this.nombre = "";
        this.propietario = "";
    }

    public Perro(String nombre) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.PERRO;
        this.raza = "";
        this.medio = Medio.TERRESTRE;
        this.nombre = nombre;
        this.propietario = "";
    }

    public Perro(String raza, String nombre, String propietario) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.PERRO;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.nombre = nombre;
        this.propietario = propietario;
       }

    public Perro(Animal animal) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.PERRO;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.nombre = nombre;
        this.propietario = propietario;
    }

    //METODOS A IMPLEMENTAR MAS ABAJO(EN JERARQUIA)
    @Override
    public void reproducirSonido() {
        System.out.println("guau");
    }

    @Override
    public void desplazarse() {
        System.out.println("camina");
    }

    /*@Override
    Animal cloneAnimal() {
        Perro newPerro=new Perro(this.raza, this.nombre, this.propietario);
        newPerro.sexo=this.sexo;
        return newPerro;
    }*/




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

    @Override
    public void setSexo(Enum sexo) {

    }
}
