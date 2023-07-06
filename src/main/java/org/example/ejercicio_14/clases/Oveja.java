package org.example.ejercicio_14.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;

import org.example.ejercicio_13.clases.Animal;
import org.example.ejercicio_13.clases.AnimalGranja;

public class Oveja extends AnimalGranja {

    //CONSTRUCTORES

    public Oveja(String raza, String propietario, Sexo sexo, Animal padre, Animal madre, int generacion) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.OVEJA;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.propietario = propietario;
        this.sexo = sexo;
        this.padre = padre;
        this.madre = madre;
        this.generacion = generacion;
    }

    public Oveja(Oveja oveja) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.OVEJA;
        this.raza = oveja.raza;
        this.medio = Medio.TERRESTRE;
        this.propietario = oveja.propietario;
        this.sexo = oveja.sexo;
        this.padre = oveja.padre;
        this.madre = oveja.madre;
        this.generacion = oveja.generacion;
    }


    //METODOS
    @Override
    public void reproducirSonido() {
        System.out.println("beeeeee");
    }

    @Override
    public void desplazarse() {
        System.out.println("camina");
    }

    @Override
    protected Animal cloneAnimal() {
        Oveja newOveja = new Oveja(this.raza, this.propietario, this.sexo, this.padre, this.madre, this.generacion);
        return newOveja;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Reino='" + reino + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Raza='" + raza + '\'' +
                ", Medio='" + medio + '\'' +
                ", Propietario='" + propietario + '\'' +
                ", Sexo='" + sexo + '\'' +
                ", Padre='" + padre + '\'' +
                ", Madre='" + madre + '\'' +
                ", Generacion='" + generacion + '\'' +
                '}';
    }
}


