package org.example.ejercicio_14.clases;



public class Gato extends Mascota {

    //CONSTRUCTORES
    public Gato(String reino, String tipo, String raza, String medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio, nombre, propietario);
    }

    public Gato(Animal animal) {
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
    org.example.ejercicio_14.clases.Animal cloneAnimal() {
        return null;
    }
}
