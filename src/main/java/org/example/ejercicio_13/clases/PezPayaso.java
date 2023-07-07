package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;

public class PezPayaso extends AnimalSalvaje {

    //CONSTRUCTORES
    public PezPayaso(String raza, Sexo sexo) {
        this.reino = Reino.PEZ;
        this.tipo = Tipo.PEZ_PAYASO;
        this.raza = raza;
        this.medio = Medio.ACUATICO;
        this.sexo=sexo;
    }

    //CONSTRUCTOR COPIA
    public PezPayaso(PezPayaso pezPayaso) {
        this.reino = Reino.PEZ;
        this.tipo = Tipo.PEZ_PAYASO;
        this.raza = pezPayaso.raza;
        this.medio = Medio.ACUATICO;
        this.sexo=pezPayaso.sexo;
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
        return new PezPayaso(this.raza,this.sexo);
    }


    @Override
    public String toString() {
        return "Pez Payaso{" +
                "Reino='" + reino + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Raza='" + raza + '\'' +
                ", Medio='" + medio + '\'' +
                ", Sexo='" + sexo + '\'' +
                '}';
    }
}
