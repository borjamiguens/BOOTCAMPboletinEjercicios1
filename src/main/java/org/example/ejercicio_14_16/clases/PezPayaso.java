package org.example.ejercicio_14_16.clases;


import org.example.ejercicio_13.Animal;

public class PezPayaso extends AnimalSalvaje {

    //CONSTRUCTORES
    public PezPayaso() {
        this.reino = Reino.PEZ;
        this.tipo = Tipo.PEZ_PAYASO;
        this.raza = "";
        this.medio = Medio.ACUATICO;
        this.sexo=null;
        this.padre=null;
        this.madre=null;
        this.generacion=0;
    }

    public PezPayaso(String raza, Enum sexo, Animal padre, Animal madre, int generacion) {
        this.reino = Reino.PEZ;
        this.tipo = Tipo.PEZ_PAYASO;
        this.raza = raza;
        this.medio = Medio.ACUATICO;
        this.sexo=sexo;
        this.padre=padre;
        this.madre=madre;
        this.generacion=generacion;
    }

    public PezPayaso(Animal animal) {
        this.reino = Reino.PEZ;
        this.tipo = Tipo.PEZ_PAYASO;
        this.raza = raza;
        this.medio = Medio.ACUATICO;
        this.sexo=null;
        this.padre=null;
        this.madre=null;
        this.generacion=0;
    }

    //METODOS A IMPLEMENTAR MAS ABAJO(EN JERARQUIA)
    @Override
    public void reproducirSonido() {
        System.out.println("inaudible");
    }

    @Override
    public void desplazarse() {
        System.out.println("nada");
    }

    @Override
    protected Animal cloneAnimal() {
        PezPayaso newPezPayaso=new PezPayaso(this.raza, this.sexo, this.padre, this.madre, this.generacion);
        return newPezPayaso;
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
