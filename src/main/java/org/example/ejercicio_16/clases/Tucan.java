package org.example.ejercicio_16.clases;


public class Tucan extends AnimalSalvaje {

    //CONSTRUCTORES

    public Tucan() {
        this.reino = "";
        this.tipo = "";
        this.raza = "";
        this.medio = "";
    }

    public Tucan(String reino, String tipo, String raza, String medio) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;

    }

    public Tucan(Animal animal) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;

    }

    //METODOS A IMPLEMENTAR MAS ABAJO(EN JERARQUIA)
    @Override
    void reproducirSonido() {
        System.out.println("graznido");
    }

    @Override
    void desplazarse() {
        System.out.println("vuela");
    }

    @Override
    Animal cloneAnimal() {
        return new Tucan(this.reino, this.tipo, this.raza, this.medio);
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
