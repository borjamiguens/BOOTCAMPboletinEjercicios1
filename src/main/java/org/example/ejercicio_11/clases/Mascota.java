package org.example.ejercicio_11.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_10.clases.Animal;

import java.util.ArrayList;

public class Mascota extends Animal implements Ipropietario {

    //ATRIBUTOS
    private String nombre;
    private String propietario;

    public static ArrayList<Mascota> listaMascotasPrueba = new ArrayList<>();

    //CONSTRUCTORES
    public Mascota(Reino reino, Tipo tipo, String raza, Medio medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio);
        this.nombre = nombre;
        this.propietario = propietario;
    }

    //CONSTRUCTOR COPIA
    public Mascota(Mascota mascota) {
        super(mascota);
        this.nombre = mascota.nombre;
        this.propietario = mascota.propietario;
    }


    //METODOS

    @Override
    public String toString() {
        return "Animal{" +
                "Reino='" + super.getReino().toString() + '\'' +
                ", Tipo='" + super.getTipo().toString() + '\'' +
                ", Raza='" + super.getRaza().toString() + '\'' +
                ", Medio='" + super.getMedio().toString() + '\'' +
                ",nombre='" + nombre + '\'' +
                ", propietario='" + propietario + '\'' +
                '}';
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getPropietario() {
        return propietario;
    }

    @Override
    public void setPropietario() {

    }
}
