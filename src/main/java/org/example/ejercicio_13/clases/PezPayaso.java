package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;

public class PezPayaso extends AnimalSalvaje {

    protected PezPayaso padre;
    protected PezPayaso madre;

    //CONSTRUCTORES
    public PezPayaso(String raza, Sexo sexo, PezPayaso padre, PezPayaso madre, int generacion) {
        super(Reino.PEZ,Tipo.PEZ_PAYASO, raza,Medio.ACUATICO,sexo,padre, madre, generacion);
    }


    //CONSTRUCTOR COPIA
    public PezPayaso(PezPayaso pezPayaso) {
        super(pezPayaso);
    }

    //METODOS
    @Override
    public void reproducirSonido() {
        System.out.println("inaudible");
    }

    @Override
    public void desplazarse() {
        System.out.println("nada");
    }

    @Override
    protected PezPayaso clone() {
        return new PezPayaso(this.raza,this.sexo, this.padre, this.madre, this.generacion);
    }



    //GETTERS
    public PezPayaso getPadre() {
        return padre;
    }

    public PezPayaso getMadre() {
        return madre;
    }
}
