package org.example.ejercicio_11.main;


import org.example.ejercicio_09.clases.Medio;
import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_09.clases.Tipo;
import org.example.ejercicio_10.clases.Animal;
import org.example.ejercicio_11.clases.AnimalGranja;
import org.example.ejercicio_11.clases.AnimalSalvaje;
import org.example.ejercicio_11.clases.Mascota;

import static org.example.ejercicio_11.clases.AnimalGranja.listaAnimalesGranjaPrueba;
import static org.example.ejercicio_11.clases.AnimalSalvaje.listaAnimalesSalvajesPrueba;
import static org.example.ejercicio_11.clases.Mascota.listaMascotasPrueba;

public class Main {
    public static void main(String[] args) {
        Mascota perro1= new Mascota(Reino.MAMIFERO, Tipo.PERRO,"bulldog", Medio.TERRESTRE,"perrucho","Juan");
        Mascota gato1= new Mascota(Reino.MAMIFERO,Tipo.GATO,"angora",Medio.TERRESTRE,"gatucho","Fina");
        Mascota perro2=new Mascota(perro1);
        AnimalSalvaje tucan1=new AnimalSalvaje(Reino.AVE,Tipo.TUCAN,"comun",Medio.AEREO);
        AnimalGranja oveja1=new AnimalGranja(Reino.MAMIFERO,Tipo.OVEJA,"churra",Medio.TERRESTRE,"Juanjo");
        AnimalGranja vaca1=new AnimalGranja(Reino.MAMIFERO,Tipo.VACA,"rubia",Medio.TERRESTRE,"Juanjo");

        listaMascotasPrueba.add(perro1);
        listaMascotasPrueba.add(gato1);
        listaMascotasPrueba.add(perro2);
        for(Mascota e: listaMascotasPrueba){
            System.out.println(e.toString());
        }

        listaAnimalesSalvajesPrueba.add(tucan1);
        for(AnimalSalvaje e: listaAnimalesSalvajesPrueba){
            System.out.println(e.toString());
        }

        listaAnimalesGranjaPrueba.add(oveja1);
        listaAnimalesGranjaPrueba.add(vaca1);
        for(AnimalGranja e: listaAnimalesGranjaPrueba){
            System.out.println(e.toString());
        }





    }








}
