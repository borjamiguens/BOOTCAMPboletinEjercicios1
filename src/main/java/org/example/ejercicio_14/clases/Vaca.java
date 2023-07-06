package org.example.ejercicio_14.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_13.clases.Animal;
import org.example.ejercicio_13.clases.AnimalGranja;

public class Vaca extends AnimalGranja {

    //CONSTRUCTORES

    public Vaca(String raza, String propietario, Sexo sexo, Animal padre, Animal madre, int generacion) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.VACA;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.propietario = propietario;
        this.sexo = sexo;
        this.padre = padre;
        this.madre = madre;
        this.generacion = generacion;
    }

    public Vaca(Vaca vaca) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.VACA;
        this.raza = vaca.raza;
        this.medio = Medio.TERRESTRE;
        this.propietario = vaca.propietario;
        this.sexo = vaca.sexo;
        this.padre = vaca.padre;
        this.madre = vaca.madre;
        this.generacion = vaca.generacion;
    }

    //METODOS
    @Override
    public void reproducirSonido() {
        System.out.println("muuuuuu");
    }

    @Override
    public void desplazarse() {
        System.out.println("camina");
    }

    @Override
    protected Animal cloneAnimal() {
        Vaca newVaca = new Vaca(this.raza, this.propietario, this.sexo, this.padre, this.madre, this.generacion);
        return newVaca;
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
