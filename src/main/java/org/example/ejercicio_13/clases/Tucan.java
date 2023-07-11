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
        super(Reino.AVE,Tipo.TUCAN, raza,Medio.AEREO,sexo,padre, madre, generacion);
    }


    //CONSTRUCTOR COPIA
    public Tucan(Tucan tucan) {
        super(tucan);
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



    //GETTERS

}

