package org.example.ejercicio_14_16.clases;


import org.example.ejercicio_13.clases.Animal;

public class Vaca extends AnimalGranja {

    //CONSTRUCTORES
    public Vaca() {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.VACA;
        this.raza = "";
        this.medio = Medio.TERRESTRE;
        this.propietario = "";
        this.sexo=null;
        this.padre=null;
        this.madre=null;
        this.generacion=0;
    }

    public Vaca(String raza, String propietario, Enum sexo, Animal padre, Animal madre, int generacion) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.VACA;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.propietario = propietario;
        this.sexo=sexo;
        this.padre=padre;
        this.madre=madre;
        this.generacion=generacion;
    }

    public Vaca(Animal animal) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.VACA;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.propietario = propietario;
        this.sexo=null;
        this.padre=null;
        this.madre=null;
        this.generacion=0;
    }

    //METODOS A IMPLEMENTAR MAS ABAJO(EN JERARQUIA)
    @Override
    public void reproducirSonido() {
        System.out.println("muuuuuu");
    }

    @Override
    public void desplazarse() {
        System.out.println("camina");
    }

    @Override
    protected Animal cloneAnimal() {
        Vaca newVaca=new Vaca(this.raza, this.propietario, this.sexo, this.padre, this.madre, this.generacion);
        return newVaca;
    }


    @Override
    public void setSexo(Enum sexo) {
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
                ", Sexo='" + sexo + '\'' +
                ", Padre='" + padre + '\'' +
                ", Madre='" + madre + '\'' +
                ", Generacion='" + generacion + '\'' +
                '}';
    }

}
