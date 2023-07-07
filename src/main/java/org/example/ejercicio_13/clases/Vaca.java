package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;

public class Vaca extends AnimalGranja {

    //CONSTRUCTORES

    public Vaca(String raza, String propietario, Sexo sexo) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.VACA;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.propietario = propietario;
        this.sexo=sexo;
    }

    public Vaca(Vaca vaca) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.VACA;
        this.raza = vaca.raza;
        this.medio = Medio.TERRESTRE;
        this.propietario = vaca.propietario;
        this.sexo=vaca.sexo;
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
        return new Vaca(this.raza, this.propietario, this.sexo);
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
                '}';
    }

}
