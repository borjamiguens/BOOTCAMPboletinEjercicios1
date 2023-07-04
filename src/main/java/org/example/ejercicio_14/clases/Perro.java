package org.example.ejercicio_14.clases;



public class Perro extends Mascota {

    //CONSTRUCTORES
    public Perro(String reino, String tipo, String raza, String medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio, nombre, propietario);
    }

    public Perro(Animal animal) {
        super(animal);
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
