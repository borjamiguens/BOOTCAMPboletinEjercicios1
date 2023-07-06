package org.example.ejercicio_14.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_13.clases.Animal;
import org.example.ejercicio_13.clases.AnimalSalvaje;

public class Tucan extends AnimalSalvaje {

    //CONSTRUCTORES

    public Tucan(String raza, Sexo sexo, Animal padre, Animal madre, int generacion) {
        this.reino = Reino.AVE;
        this.tipo = Tipo.TUCAN;
        this.raza = raza;
        this.medio = Medio.AEREO;
        this.sexo=sexo;
        this.padre=padre;
        this.madre=madre;
        this.generacion=generacion;
    }
    //CONSTRUCTOR COPIA
    public Tucan(Tucan tucan) {
        this.reino = Reino.AVE;
        this.tipo = Tipo.TUCAN;
        this.raza = tucan.raza;
        this.medio = Medio.AEREO;
        this.sexo=tucan.sexo;
        this.padre=tucan.padre;
        this.madre=tucan.madre;
        this.generacion=tucan.generacion;
    }

    //METODOS
    @Override
    public void reproducirSonido() {
        System.out.println("graznido");
    }

    @Override
    public void desplazarse() {
        System.out.println("vuela");
    }

    @Override
    protected Animal cloneAnimal() {
        Tucan newTucan=new Tucan(this.raza, this.sexo, this.padre, this.madre, this.generacion);
        return newTucan;
    }


    @Override
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

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
}
