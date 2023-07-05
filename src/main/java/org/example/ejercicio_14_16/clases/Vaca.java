package org.example.ejercicio_14_16.clases;


public class Vaca extends AnimalGranja {

    //CONSTRUCTORES
    public Vaca() {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.VACA;
        this.raza = "";
        this.medio = Medio.TERRESTRE;
        this.propietario = "";
    }

    public Vaca(String raza, String propietario) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.VACA;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.propietario = propietario;
    }

    public Vaca(Animal animal) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.VACA;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
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
        Vaca newVaca=new Vaca(this.raza, this.propietario);
        newVaca.sexo=this.sexo;
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
                '}';
    }

}
