package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_13.clases.Animal;
import org.example.ejercicio_13.clases.AnimalSalvaje;

public class Tucan extends AnimalSalvaje {

    //CONSTRUCTORES
    public Tucan(String raza, Sexo sexo) {
        this.reino = Reino.AVE;
        this.tipo = Tipo.TUCAN;
        this.raza = raza;
        this.medio = Medio.AEREO;
        this.sexo= sexo;
    }

    //CONSTRUCTOR COPIA
    public Tucan(Tucan tucan) {
        this.reino = Reino.AVE;
        this.tipo = Tipo.TUCAN;
        this.raza = tucan.raza;
        this.medio = Medio.AEREO;
        this.sexo=tucan.sexo;
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
        return new Tucan(this.raza,this.sexo);
    }

    @Override
    public String toString() {
        return "Tucan{" +
                "Reino='" + reino + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Raza='" + raza + '\'' +
                ", Medio='" + medio + '\'' +
                ", Sexo='" + sexo + '\'' +
                '}';
    }
}

