package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;

public class Vaca extends AnimalGranja {

    protected Vaca padre;
    protected Vaca madre;

    //CONSTRUCTORES

    public Vaca(String raza, String propietario, Sexo sexo, Vaca padre, Vaca madre, int generacion) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.VACA;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.propietario = propietario;
        this.sexo=sexo;
        this.padre=padre;
        this.madre=madre;
        this.generacion=generacion;
    }

    public Vaca(Vaca vaca) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.VACA;
        this.raza = vaca.raza;
        this.medio = Medio.TERRESTRE;
        this.propietario = vaca.propietario;
        this.sexo=vaca.sexo;
        this.padre=vaca.padre;
        this.madre=vaca.madre;
        this.generacion=vaca.generacion;
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
    protected Vaca clone() {
        return new Vaca(this.raza, this.propietario, this.sexo,this.padre, this.madre, this.generacion);
    }

    @Override
    public String toString() {
        return "Vaca{" +
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

    //GETTERS
    @Override
    public Vaca getPadre() {
        return padre;
    }
    @Override
    public Vaca getMadre() {
        return madre;
    }

}
