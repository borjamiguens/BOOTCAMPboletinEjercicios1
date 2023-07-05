package org.example.ejercicio_16.clases;


public class PezPayaso extends AnimalSalvaje {

    //CONSTRUCTORES
    public PezPayaso() {
        this.reino = "";
        this.tipo = "";
        this.raza = "";
        this.medio = "";
    }

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
    Animal cloneAnimal() {
        return new PezPayaso(this.reino, this.tipo, this.raza, this.medio);
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
