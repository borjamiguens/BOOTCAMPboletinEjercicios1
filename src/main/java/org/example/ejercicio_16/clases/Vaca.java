package org.example.ejercicio_16.clases;


public class Vaca extends AnimalGranja {

    //CONSTRUCTORES
    public Vaca(String reino, String tipo, String raza, String medio, String propietario) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
        this.propietario = propietario;
    }

    public Vaca(Animal animal) {
        this.reino = animal.reino;
        this.tipo = animal.tipo;
        this.raza = animal.raza;
        this.medio = animal.medio;
        this.propietario = propietario;
    }

    //METODOS A IMPLEMENTAR MAS ABAJO(EN JERARQUIA)
    @Override
    void reproducirSonido() {
        System.out.println("muuuuuu");
    }

    @Override
    void desplazarse() {
        System.out.println("camina");
    }

    @Override
    Animal cloneAnimal() {
        return new Vaca(this.reino, this.tipo, this.raza, this.medio, this.propietario);
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Reino='" + reino + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Raza='" + raza + '\'' +
                ", Medio='" + medio + '\'' +
                ", Propietario='" + propietario + '\'' +
                '}';
    }

}
