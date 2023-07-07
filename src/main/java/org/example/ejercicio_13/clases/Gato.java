package org.example.ejercicio_13.clases;


import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_09.clases.Medio;

public class Gato extends Mascota {

    //CONSTRUCTORES
    public Gato(String raza, String nombre, String propietario) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.GATO;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.nombre = nombre;
        this.propietario = propietario;
    }

    //CONSTRUCTOR COPIA
    public Gato(Gato gato) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.GATO;
        this.raza = gato.raza;
        this.medio = Medio.TERRESTRE;
        this.nombre = gato.nombre;
        this.propietario = gato.propietario;
    }


    //METODOS
    @Override
    public void reproducirSonido() {
        System.out.println("miau");
    }

    @Override
    public void desplazarse() {
        System.out.println("camina");
    }

    @Override
    protected Gato clone() {
        return new Gato(this.raza,this.propietario,this.propietario);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "Reino='" + reino + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Raza='" + raza + '\'' +
                ", Medio='" + medio + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Propietario='" + propietario + '\'' +
                '}';
    }

}

