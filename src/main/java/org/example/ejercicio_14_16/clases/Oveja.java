package org.example.ejercicio_14_16.clases;


public class Oveja extends AnimalGranja {

    //CONSTRUCTORES
    public Oveja() {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.OVEJA;
        this.raza = "";
        this.medio = Medio.TERRESTRE;
        this.propietario = "";
    }

    public Oveja(String raza, String propietario) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.OVEJA;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.propietario = propietario;
    }

    public Oveja(Animal animal) {
        this.reino = Reino.MAMIFERO;
        this.tipo = Tipo.OVEJA;
        this.raza = raza;
        this.medio = Medio.TERRESTRE;
        this.propietario = propietario;
    }

    //METODOS A IMPLEMENTAR MAS ABAJO(EN JERARQUIA)
    @Override
    void reproducirSonido() {
        System.out.println("beeeeee");
    }

    @Override
    void desplazarse() {
        System.out.println("camina");
    }

    @Override
    Animal cloneAnimal() {

        Oveja newOveja=new Oveja(this.raza, this.propietario);
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
                '}';
    }
}


