package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Sexo;
import org.example.ejercicio_09.clases.Tipo;

public class Oveja extends AnimalGranja {

    protected Oveja padre;
    protected Oveja madre;
    //CONSTRUCTORES
    public Oveja(String raza,String propietario,Sexo sexo,  Oveja padre, Oveja madre, int generacion) {
        super(Reino.MAMIFERO,Tipo.OVEJA, raza,Medio.TERRESTRE, propietario, sexo,padre, madre, generacion);
    }

    //CONSTRUCTOR COPIA
    public Oveja(Oveja oveja) {
        super(oveja);
    }

    //METODOS
    @Override
    public void reproducirSonido() {
        System.out.println("beeeeee");
    }

    @Override
    public void desplazarse() {
        System.out.println("camina");
    }

    @Override
    protected Oveja clone() {
        return new Oveja(this.raza, this.propietario,this.sexo,this.padre, this.madre, this.generacion);
    }

    //GETTERS


}