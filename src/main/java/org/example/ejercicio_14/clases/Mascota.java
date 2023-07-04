package org.example.ejercicio_14.clases;

import org.example.ejercicio_14.clases.Animal;

public class Mascota extends Animal implements Ipropietario {

    //ATRIBUTOS
    private String nombre;
    private String propietario;

    //CONSTRUCTORES
    public Mascota(String reino, String tipo, String raza, String medio, String nombre, String propietario) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
        this.nombre = nombre;
        this.propietario=propietario;
    }

    public Mascota(Animal animal) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
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
    //METODOS A IMPLEMENTAR MAS ABAJO(EN JERARQUIA)
    @Override
    void reproducirSonido() {

    }

    @Override
    void desplazarse() {

    }

    @Override
    Animal cloneAnimal() {
        return null;
    }
}
