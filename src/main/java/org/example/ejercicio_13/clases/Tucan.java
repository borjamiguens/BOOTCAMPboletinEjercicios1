package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_13.clases.Animal;
import org.example.ejercicio_13.clases.AnimalSalvaje;

public class Tucan extends AnimalSalvaje {

    protected Tucan padre;
    protected Tucan madre;

    //CONSTRUCTORES
    public Tucan(String raza, Sexo sexo, Tucan padre, Tucan madre, int generacion) {
        this.reino = Reino.AVE;
        this.tipo = Tipo.TUCAN;
        this.raza = raza;
        this.medio = Medio.AEREO;
        this.sexo= sexo;
        this.id=generarId();
    }

    //CONSTRUCTOR COPIA
    public Tucan(Tucan tucan) {
        this.reino = Reino.AVE;
        this.tipo = Tipo.TUCAN;
        this.raza = tucan.raza;
        this.medio = Medio.AEREO;
        this.sexo=tucan.sexo;
        this.id=generarId();
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
    protected Tucan clone() {
        return new Tucan(this.raza,this.sexo, this.padre, this.madre, this.generacion);
    }

    @Override
    public String toString() {
        return "Tucan{" +
                "Id='" + id + '\'' +
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

    //GETTERS
    @Override
    public Tucan getPadre() {
        return padre;
    }
    @Override
    public Tucan getMadre() {
        return madre;
    }
}

