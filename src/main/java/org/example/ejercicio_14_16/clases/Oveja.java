package org.example.ejercicio_14_16.clases;


import org.example.ejercicio_13.Animal;

public class Oveja extends AnimalGranja {

    //CONSTRUCTORES
    public Oveja() {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.OVEJA;
        this.raza = "";
        this.medio = Medio.TERRESTRE;
        this.propietario = "";
        this.sexo=null;
        this.padre=null;
        this.madre=null;
        this.generacion=0;
    }

    public Oveja(String raza, String propietario, Enum sexo, Animal padre, Animal madre, int generacion) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.OVEJA;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.propietario = propietario;
        this.sexo=sexo;
        this.padre=padre;
        this.madre=madre;
        this.generacion=generacion;
    }

    public Oveja(Animal animal) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.OVEJA;
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
        System.out.println("beeeeee");
    }

    @Override
    public void desplazarse() {
        System.out.println("camina");
    }

    @Override
    protected Animal cloneAnimal() {
        Oveja newOveja=new Oveja(this.raza, this.propietario, this.sexo, this.padre, this.madre, this.generacion);
        newOveja.sexo=this.sexo;
        return newOveja;
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


