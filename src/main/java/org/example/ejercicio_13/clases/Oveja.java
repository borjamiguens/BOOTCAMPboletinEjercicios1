package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;

public class Oveja extends AnimalGranja {

    //CONSTRUCTORES

    public Oveja(String raza, String propietario, Sexo sexo) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.OVEJA;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.propietario = propietario;
        this.sexo=sexo;
    }

    public Oveja(Oveja oveja) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.OVEJA;
        this.raza = oveja.raza;
        this.medio = Medio.TERRESTRE;
        this.propietario = oveja.propietario;
        this.sexo=oveja.sexo;
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
    protected Oveja clone() {
        return new Oveja(this.raza, this.propietario,this.sexo);
    }

    @Override
    public String toString() {
        return "Oveja{" +
                "Reino='" + reino + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Raza='" + raza + '\'' +
                ", Medio='" + medio + '\'' +
                ", Propietario='" + propietario + '\'' +
                ", Sexo='" + sexo + '\'' +
                '}';
    }
}