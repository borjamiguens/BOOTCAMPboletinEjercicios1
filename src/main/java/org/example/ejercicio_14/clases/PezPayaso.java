package org.example.ejercicio_14.clases;


public class PezPayaso extends AnimalSalvaje {

    //CONSTRUCTORES
    public PezPayaso(String reino, String tipo, String raza, String medio) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;

    }

    public PezPayaso(Animal animal) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;

    }

    //METODOS A IMPLEMENTAR MAS ABAJO(EN JERARQUIA)
    @Override
    void reproducirSonido() {
        System.out.println("inaudible");
    }

    @Override
    void desplazarse() {
        System.out.println("nada");
    }

    @Override
    org.example.ejercicio_14.clases.Animal cloneAnimal() {
        return new PezPayaso(this.reino, this.tipo, this.raza, this.medio);
    }
}
