package org.example.ejercicio_14.clases;



public class PezPayaso extends AnimalSalvaje {

    //CONSTRUCTORES
    public PezPayaso(String reino, String tipo, String raza, String medio) {
        super(reino, tipo, raza, medio);
    }

    public PezPayaso(Animal animal) {
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
