package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;

public class Vaca extends AnimalGranja {

    protected Vaca padre;
    protected Vaca madre;

    //CONSTRUCTORES
    public Vaca(String raza,String propietario, Sexo sexo, Vaca padre, Vaca madre, int generacion) {
        super(Reino.MAMIFERO,Tipo.VACA, raza,Medio.TERRESTRE,propietario,sexo,padre, madre, generacion);
    }

    //CONSTRUCTOR COPIA
    public Vaca(Vaca vaca) {
        super(vaca);
    }

    //METODOS
    @Override
    public void reproducirSonido() {
        System.out.println("muuuuuu");
    }

    @Override
    public void desplazarse() {
        System.out.println("camina");
    }

    @Override
    protected Vaca clone() {
        return new Vaca(this.raza, this.propietario, this.sexo,this.padre, this.madre, this.generacion);
    }



    //GETTERS
    @Override
    public Vaca getPadre() {
        return padre;
    }
    @Override
    public Vaca getMadre() {
        return madre;
    }

}
