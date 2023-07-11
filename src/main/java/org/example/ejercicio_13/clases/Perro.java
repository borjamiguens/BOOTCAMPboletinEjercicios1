package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;

public class Perro extends Mascota {

    protected Perro padre;
    protected Perro madre;

    //CONSTRUCTORES
    public Perro(String raza, String nombre, String propietario, Sexo sexo, Perro padre, Perro madre, int generacion) {
        super(Reino.MAMIFERO,Tipo.PERRO, raza,Medio.TERRESTRE,nombre,propietario,sexo,padre, madre, generacion);
    }


    //CONSTRUCTOR COPIA
    public Perro(Perro perro) {
        super(perro);
    }

    //METODOS
    @Override
    public void reproducirSonido() {
        System.out.println("guau");
    }

    @Override
    public void desplazarse() {
        System.out.println("camina");
    }

    @Override
    protected Perro clone() {
        return new Perro(this.raza,this.nombre,this.propietario,this.sexo, this.padre, this.madre, this.generacion);
    }


    //GETTERS
    @Override
    public Perro getPadre() {
        return padre;
    }
    @Override
    public Perro getMadre() {
        return madre;
    }

    @Override
    public void setSexo(Sexo sexo) {

    }
}
