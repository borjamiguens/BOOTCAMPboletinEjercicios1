package org.example.ejercicio_13.clases;


import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_09.clases.Medio;

public class Gato extends Mascota {

    protected Gato padre;
    protected Gato madre;

    //CONSTRUCTORES
    public Gato(String raza, String nombre, String propietario, Sexo sexo, Gato padre, Gato madre, int generacion) {
        super(Reino.MAMIFERO,Tipo.GATO, raza,Medio.TERRESTRE,nombre,propietario,sexo,padre, madre, generacion);
    }

    //CONSTRUCTOR COPIA
    public Gato(Gato gato) {
        super(gato);
    }


    //METODOS
    @Override
    public void reproducirSonido() {
        System.out.println("miau");
    }

    @Override
    public void desplazarse() {
        System.out.println("camina");
    }

    @Override
    protected Gato clone() {
        return new Gato(this.raza,this.propietario,this.propietario,this.sexo, this.padre, this.madre, this.generacion);
    }



    //GETTERS
    @Override
    public Gato getPadre() {
        return padre;
    }
    @Override
    public Gato getMadre() {
        return madre;
    }

    @Override
    public void setSexo(Sexo sexo) {

    }
}

