package org.example.ejercicio_14_16.clases;


public class PezPayaso extends AnimalSalvaje {

    //CONSTRUCTORES
    public PezPayaso() {
        this.reino = Reino.PEZ;
        this.tipo = Tipo.PEZ_PAYASO;
        this.raza = "";
        this.medio = Medio.ACUATICO;
    }

    public PezPayaso(String raza) {
        this.reino = Reino.PEZ;
        this.tipo = Tipo.PEZ_PAYASO;
        this.raza = raza;
        this.medio = Medio.ACUATICO;
    }

    public PezPayaso(Animal animal) {
        this.reino = Reino.PEZ;
        this.tipo = Tipo.PEZ_PAYASO;
        this.raza = raza;
        this.medio = Medio.ACUATICO;
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
        PezPayaso newPezPayaso=new PezPayaso(this.raza);
        newPezPayaso.sexo=this.sexo;
        return newPezPayaso;
    }

    @Override
    public void setSexo(Enum sexo) {
        this.sexo = sexo;
    }
}
