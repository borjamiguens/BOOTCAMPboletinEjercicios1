package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;

public class Perro extends Mascota {

    protected Perro padre;
    protected Perro madre;

    //CONSTRUCTORES
    public Perro(String raza, String nombre, String propietario, Sexo sexo, Perro padre, Perro madre, int generacion) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.PERRO;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.nombre = nombre;
        this.propietario = propietario;
        this.sexo = sexo;
        this.padre=padre;
        this.madre=madre;
        this.generacion=generacion;
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
        this.padre=perro.padre;
        this.madre=perro.madre;
        this.generacion=perro.generacion;
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
        return new Perro(this.raza,this.nombre,this.propietario,this.sexo, this.padre, this.madre, this.generacion);
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
                ", Padre='" + padre + '\'' +
                ", Madre='" + madre + '\'' +
                ", Generacion='" + generacion + '\'' +
                '}';
    }

    //GETTERS
    @Override
    public Perro getPadre() {
        return padre;
    }
    @Override
    public Perro getMadre() {
        return madre;
    }

}
