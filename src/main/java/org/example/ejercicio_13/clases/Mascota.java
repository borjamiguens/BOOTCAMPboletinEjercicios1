package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_11.clases.IPropietario;
import org.example.ejercicio_13.clases.Animal;

import java.util.ArrayList;

public abstract class Mascota extends Animal implements IPropietario {
    public static ArrayList<Mascota> listaMascotas = new ArrayList<>();
    //ATRIBUTOS
    protected String nombre;
    protected String propietario;

    //CONSTRUCTORES
    public Mascota(Reino reino, Tipo tipo, String raza, Medio medio,String nombre, String propietario, Sexo sexo, Mascota padre, Mascota madre, int generacion) {
        super(reino, tipo, raza,medio, padre, madre, generacion);
        this.nombre=nombre;
        this.propietario=propietario;


        /*this.reino = Reino.MAMIFERO;

        this.tipo = Tipo.PERRO;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.nombre = nombre;
        this.propietario = propietario;

        this.sexo = sexo;
        this.padre=padre;
        this.madre=madre;
        this.generacion=generacion;
        this.id=generarId();*/

    }

    //CONSTRUCTOR COPIA
    public Mascota(Mascota mascota) {
        super(mascota);
        this.nombre=nombre;
        this.propietario=propietario;

    }

    @Override
    public String toString() {
        return super.toString() +
                ", Nombre='" + nombre + '\'' +
                ", Propietario='" + propietario + '\'' +
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
    public void setPropietario(String propietario) {
        this.propietario=propietario;
    }


}
