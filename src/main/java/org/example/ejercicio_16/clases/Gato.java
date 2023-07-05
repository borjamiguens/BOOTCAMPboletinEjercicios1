package org.example.ejercicio_16.clases;


public class Gato extends Mascota {

    //CONSTRUCTORES
    public Gato(String reino, String tipo, String raza, String medio, String nombre, String propietario) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
        this.nombre = nombre;
        this.propietario = propietario;
    }

    public Gato(Animal animal) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
        this.nombre = nombre;
        this.propietario = propietario;
    }


    //METODOS A IMPLEMENTAR MAS ABAJO(EN JERARQUIA)
    @Override
    void reproducirSonido() {
        System.out.println("miau");
    }

    @Override
    void desplazarse() {
        System.out.println("camina");
    }

    @Override
    Animal cloneAnimal() {
        return new Gato(this.reino, this.tipo, this.raza, this.medio, this.nombre, this.propietario);
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
                ", Nombre='" + nombre + '\'' +
                ", Propietario='" + propietario + '\'' +
                '}';
    }
}
