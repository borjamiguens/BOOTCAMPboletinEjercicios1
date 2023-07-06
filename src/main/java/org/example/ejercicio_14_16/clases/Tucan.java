package org.example.ejercicio_14_16.clases;


import org.example.ejercicio_13.Animal;

public class Tucan extends AnimalSalvaje {

    //CONSTRUCTORES

    public Tucan() {
        this.reino = Reino.AVE;
        this.tipo = Tipo.TUCAN;
        this.raza = "";
        this.medio = Medio.AEREO;
        this.sexo=null;
        this.padre=null;
        this.madre=null;
        this.generacion=0;
    }

    public Tucan(String raza, Enum sexo, Animal padre, Animal madre, int generacion) {
        this.reino = Reino.AVE;
        this.tipo = Tipo.TUCAN;
        this.raza = raza;
        this.medio = Medio.AEREO;
        this.sexo=sexo;
        this.padre=padre;
        this.madre=madre;
        this.generacion=generacion;
    }

    public Tucan(Animal animal) {
        this.reino = Reino.AVE;
        this.tipo = Tipo.TUCAN;
        this.raza = raza;
        this.medio = Medio.AEREO;
        this.sexo=null;
        this.padre=null;
        this.madre=null;
        this.generacion=0;
    }

    //METODOS A IMPLEMENTAR MAS ABAJO(EN JERARQUIA)
    @Override
    public void reproducirSonido() {
        System.out.println("graznido");
    }

    @Override
    public void desplazarse() {
        System.out.println("vuela");
    }

    @Override
    protected Animal cloneAnimal() {
        Tucan newTucan=new Tucan(this.raza, this.sexo, this.padre, this.madre, this.generacion);
        return newTucan;
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
                ", Sexo='" + sexo + '\'' +
                ", Padre='" + padre + '\'' +
                ", Madre='" + madre + '\'' +
                ", Generacion='" + generacion + '\'' +
                '}';
    }
}
