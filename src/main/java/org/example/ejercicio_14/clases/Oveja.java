package org.example.ejercicio_14.clases;



public class Oveja extends AnimalGranja {

    //CONSTRUCTORES
    public Oveja(String reino, String tipo, String raza, String medio, String propietario) {
        super(reino, tipo, raza, medio, propietario);
    }

    public Oveja(Animal animal) {
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


