package org.example.ejercicio_14_16.clases;


public class Tucan extends AnimalSalvaje {

    //CONSTRUCTORES

    public Tucan() {
        this.reino = Reino.AVE;
        this.tipo = Tipo.TUCAN;
        this.raza = "";
        this.medio = Medio.AEREO;
    }

    public Tucan(String raza) {
        this.reino = Reino.AVE;
        this.tipo = Tipo.TUCAN;
        this.raza = raza;
        this.medio = Medio.AEREO;
    }

    public Tucan(Animal animal) {
        this.reino = Reino.AVE;
        this.tipo = Tipo.TUCAN;
        this.raza = raza;
        this.medio = Medio.AEREO;
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
        Tucan newTucan=new Tucan(this.raza);
        newTucan.sexo=this.sexo;
        return newTucan;
    }

    @Override
    public void setSexo(Enum sexo) {
        this.sexo = sexo;
    }
}
