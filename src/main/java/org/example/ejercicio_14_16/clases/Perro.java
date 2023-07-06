package org.example.ejercicio_14_16.clases;


import org.example.ejercicio_13.clases.Animal;

public class Perro extends Mascota {

    //CONSTRUCTORES

    public Perro() {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.PERRO;
        this.raza = "";
        this.medio = Medio.TERRESTRE;
        this.nombre = "";
        this.propietario = "";
        this.sexo=null;
        this.padre=null;
        this.madre=null;
        this.generacion=0;
    }

    public Perro(String nombre) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.PERRO;
        this.raza = "";
        this.medio = Medio.TERRESTRE;
        this.nombre = nombre;
        this.propietario = "";
        this.sexo=null;
        this.padre=null;
        this.madre=null;
        this.generacion=0;

    }

    public Perro(String raza, String nombre, String propietario, Enum sexo, Animal padre, Animal madre, int generacion) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.PERRO;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.nombre = nombre;
        this.propietario = propietario;
        this.sexo=sexo;
        this.padre=padre;
        this.madre=madre;
        this.generacion=generacion;
       }

    public Perro(Animal animal) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.PERRO;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.nombre = nombre;
        this.propietario = propietario;
        this.sexo=null;
        this.padre=null;
        this.madre=null;
        this.generacion=0;
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

    @Override
    protected Animal cloneAnimal() {
        Perro newPerro=new Perro(this.raza, this.nombre, this.propietario,this.sexo,this.padre,this.madre,this.generacion);
        return newPerro;
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
                ", Sexo='" + sexo + '\'' +
                ", Padre='" + padre + '\'' +
                ", Madre='" + madre + '\'' +
                ", Generacion='" + generacion + '\'' +
                '}';
    }

    @Override
    public void setSexo(Enum sexo) {
        this.sexo=sexo;
    }
}
