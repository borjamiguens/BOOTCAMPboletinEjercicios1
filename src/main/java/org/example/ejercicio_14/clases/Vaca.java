package org.example.ejercicio_14.clases;



public class Vaca extends AnimalGranja {

    //CONSTRUCTORES
    public Vaca(String reino, String tipo, String raza, String medio, String propietario) {
        super(reino, tipo, raza, medio, propietario);
    }

    public Vaca(Animal animal) {
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
