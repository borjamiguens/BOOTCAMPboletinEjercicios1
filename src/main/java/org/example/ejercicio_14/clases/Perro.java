package org.example.ejercicio_14.clases;


import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_13.clases.Animal;
import org.example.ejercicio_13.clases.Mascota;

public class Perro extends Mascota {

    //CONSTRUCTORES


    public Perro(String raza, String nombre, String propietario, Sexo sexo, Animal padre, Animal madre, int generacion) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.PERRO;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.nombre = nombre;
        this.propietario = propietario;
        this.sexo = sexo;
        this.padre = padre;
        this.madre = madre;
        this.generacion = generacion;
    }

    public Perro(Perro perro) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.PERRO;
        this.raza = perro.raza;
        this.medio = Medio.TERRESTRE;
        this.nombre = perro.nombre;
        this.propietario = propietario;
        this.sexo = perro.sexo;
        this.padre = perro.padre;
        this.madre = perro.madre;
        this.generacion = perro.generacion;
    }

    //METODOS
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
        Perro newPerro = new Perro(this.raza, this.nombre, this.propietario, this.sexo, this.padre, this.madre, this.generacion);
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

}
