package org.example.ejercicio_11;

import org.example.ejercicio_09.Animal;

public class Mascota extends Animal implements Ipropietario{

    //ATRIBUTOS
    private String nombre;
    private String propietario;

    //CONSTRUCTORES
    public Mascota(String reino, String tipo, String raza, String medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio);
        this.nombre = nombre;
        this.propietario=propietario;
    }

    public Mascota(Animal animal, String nombre, String Propietario) {
        super(animal);
        this.nombre = nombre;
        this.propietario=propietario;
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
