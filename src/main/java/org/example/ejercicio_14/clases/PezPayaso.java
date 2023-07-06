package org.example.ejercicio_14.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_13.clases.Animal;
import org.example.ejercicio_13.clases.AnimalSalvaje;

public class PezPayaso extends AnimalSalvaje {

    //CONSTRUCTORES

    public PezPayaso(String raza, Sexo sexo, Animal padre, Animal madre, int generacion) {
        this.reino = Reino.PEZ;
        this.tipo = Tipo.PEZ_PAYASO;
        this.raza = raza;
        this.medio = Medio.ACUATICO;
        this.sexo=sexo;
        this.padre=padre;
        this.madre=madre;
        this.generacion=generacion;
    }

    //CONSTRUCTOR COPIA
    public PezPayaso(PezPayaso pezPayaso) {
        this.reino = Reino.PEZ;
        this.tipo = Tipo.PEZ_PAYASO;
        this.raza = pezPayaso.raza;
        this.medio = Medio.ACUATICO;
        this.sexo=pezPayaso.sexo;
        this.padre=pezPayaso.padre;
        this.madre=pezPayaso.madre;
        this.generacion=pezPayaso.generacion;
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
    protected Animal cloneAnimal() {
        PezPayaso newPezPayaso=new PezPayaso(this.raza, this.sexo, this.padre, this.madre, this.generacion);
        return newPezPayaso;
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
