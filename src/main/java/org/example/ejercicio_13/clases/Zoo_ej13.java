package org.example.ejercicio_13.clases;

import org.example.ejercicio_09.clases.Sexo;

public class Zoo_ej13 {
    public static void creaAmimalesEj13(){
        Perro perro1=new Perro("Bulldog","Chucho","Juan", Sexo.MACHO);
        Perro perro2=new Perro(perro1);
        Gato gato1=new Gato("angora","Micho","Maria",Sexo.MACHO);
        Gato gato2=new Gato(gato1);
        Oveja oveja1=new Oveja("churra","Sinforiano",Sexo.HEMBRA);
        Oveja oveja2=new Oveja(oveja1);
        Vaca vaca1=new Vaca("rubia","Sinforiano",Sexo.MACHO);
        Vaca vaca2=new Vaca(vaca1);
        Tucan tucan1=new Tucan("comun",Sexo.HEMBRA);
        Tucan tucan2=new Tucan(tucan1);
        PezPayaso pezPayaso1=new PezPayaso("comun",Sexo.MACHO);
        PezPayaso pezPayaso2=new PezPayaso(pezPayaso1);

        System.out.println("Chucho");
        perro1.reproducirSonido();
        perro1.desplazarse();
        System.out.println();
        System.out.println("Chucho");
        perro2.reproducirSonido();
        perro2.desplazarse();
        System.out.println();
        System.out.println("Micho");
        gato1.reproducirSonido();
        gato1.desplazarse();
        System.out.println();
        System.out.println("Oveja1");
        oveja1.reproducirSonido();
        oveja1.desplazarse();
        System.out.println();
        System.out.println("Tucan1");
        tucan1.reproducirSonido();
        tucan1.desplazarse();
        System.out.println();





    }
}
