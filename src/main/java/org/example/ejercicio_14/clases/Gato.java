package org.example.ejercicio_14.clases;


import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_13.clases.Animal;
import org.example.ejercicio_13.clases.Mascota;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_09.clases.Medio;

public class Gato extends Mascota {

    //CONSTRUCTORES
    public Gato(String raza, String nombre, String propietario, Sexo sexo, Animal padre, Animal madre, int generacion) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.GATO;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.nombre = nombre;
        this.propietario = propietario;
        this.sexo = sexo;
        this.padre = padre;
        this.madre = madre;
        this.generacion = generacion;
    }

    //CONSTRUCTOR COPIA
    public Gato(Gato gato) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.GATO;
        this.raza = gato.raza;
        this.medio = Medio.TERRESTRE;
        this.nombre = gato.nombre;
        this.propietario = propietario;
        this.sexo = gato.sexo;
        this.padre = gato.padre;
        this.madre = gato.madre;
        this.generacion = gato.generacion;
    }


    //METODOS
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
        Gato newGato = new Gato(this.raza, this.nombre, this.propietario, this.sexo, this.padre, this.madre, this.generacion);
        return newGato;
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

}
