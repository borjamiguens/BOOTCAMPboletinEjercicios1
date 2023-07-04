package org.example.ejercicio_14.clases;



public class Tucan extends AnimalSalvaje {

    //CONSTRUCTORES
    public Tucan(String reino, String tipo, String raza, String medio) {
        super(reino, tipo, raza, medio);
    }

    public Tucan(Animal animal) {
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
