package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;

public class Perro extends Mascota {

    //CONSTRUCTORES
    public Perro(String raza, String nombre, String propietario, Sexo sexo) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.PERRO;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.nombre = nombre;
        this.propietario = propietario;
        this.sexo = sexo;
    }

    //CONSTRUCTOR COPIA
    public Perro(Perro perro) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.PERRO;
        this.raza = perro.raza;
        this.medio = Medio.TERRESTRE;
        this.nombre = perro.nombre;
        this.propietario = perro.propietario;
        this.sexo=perro.sexo;
    }

    //METODOS
    @Override
    public void reproducirSonido() {
        System.out.println("guau");
    }

    @Override
    public void desplazarse() {
        System.out.println("camina");
    }

    @Override
    protected Perro clone() {
        return new Perro(this.raza,this.nombre,this.propietario,this.sexo);
    }


    @Override
    public String toString() {
        return "Perro{" +
                "Reino='" + reino + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Raza='" + raza + '\'' +
                ", Medio='" + medio + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Propietario='" + propietario + '\'' +
                ", Sexo='" + sexo + '\'' +
                '}';
    }

}
