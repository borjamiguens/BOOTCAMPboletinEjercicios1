package org.example.ejercicio_14.clases;


public class Oveja extends AnimalGranja {

    //CONSTRUCTORES
    public Oveja(String reino, String tipo, String raza, String medio, String propietario) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
        this.propietario = propietario;
    }

    public Oveja(Animal animal) {
        this.reino = animal.reino;
        this.tipo = animal.tipo;
        this.raza = animal.raza;
        this.medio = animal.medio;
        this.propietario = propietario;
    }

    //METODOS A IMPLEMENTAR MAS ABAJO(EN JERARQUIA)
    @Override
    void reproducirSonido() {
        System.out.println("beeeeee");
    }

    @Override
    void desplazarse() {
        System.out.println("camina");
    }

    @Override
    Animal cloneAnimal() {
        return new Oveja(this.reino, this.tipo, this.raza, this.medio, this.propietario);
    }
}


