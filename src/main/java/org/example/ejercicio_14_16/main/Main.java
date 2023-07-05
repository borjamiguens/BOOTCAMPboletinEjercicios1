package org.example.ejercicio_14_16.main;

import org.example.ejercicio_14_16.clases.*;

import java.util.ArrayList;

import static org.example.ejercicio_14_16.clases.Animal.listaAnimales;
import static org.example.ejercicio_15.clases.AnimalGranja.listaAnimalesGranja;
import static org.example.ejercicio_15.clases.AnimalSalvaje.listaAnimalesSalvajes;
import static org.example.ejercicio_15.clases.Mascota.listaMascotas;


public class Main {
    public static void main(String[] args) {

        Perro perro1 = new Perro("bulldog", "Chucho", "Joaquín");
        perro1.setSexo(Sexo.MACHO);
        Perro perro2 = new Perro("bulldog","Chucha", "Felipe");
        perro2.setSexo(Sexo.HEMBRA);
        Perro perro3 = new Perro("bulldog", "Chuchona", "Carlos");
        perro3.setSexo(Sexo.HEMBRA);

        Gato gato1 = new Gato("angora","Micho", "Andrea");
        gato1.setSexo(Sexo.MACHO);
        Gato gato2 = new Gato("angora", "Micha", "Susana");
        gato2.setSexo(Sexo.HEMBRA);

        Tucan tucan1 = new Tucan("comun");
        tucan1.setSexo(Sexo.MACHO);
        Tucan tucan2 = new Tucan("comun");
        tucan2.setSexo(Sexo.HEMBRA);

        PezPayaso pezPayaso1 = new PezPayaso("comun");
        pezPayaso1.setSexo(Sexo.MACHO);
        PezPayaso pezPayaso2 = new PezPayaso("comun");
        pezPayaso2.setSexo(Sexo.HEMBRA);

        Oveja oveja1 = new Oveja("churra","Serafín");
        oveja1.setSexo(Sexo.MACHO);
        Oveja oveja2 = new Oveja("churra","Serafín");
        oveja2.setSexo(Sexo.HEMBRA);

        Vaca vaca1 = new Vaca("rubia","Laureano");
        vaca1.setSexo(Sexo.MACHO);
        Vaca vaca2 = new Vaca("rubia","Laureano");
        vaca2.setSexo(Sexo.HEMBRA);

        //EJERCICIO_15
        for (org.example.ejercicio_15.clases.Animal e : org.example.ejercicio_15.clases.Animal.listaAnimales) {
            if (e.getClass().toString().contains("Perro") || e.getClass().toString().contains("Gato")) {
                listaMascotas.add(e);
            }
            if (e.getClass().toString().contains("Tucan") || e.getClass().toString().contains("PezPayaso")) {
                listaAnimalesSalvajes.add(e);
            }
            if (e.getClass().toString().contains("Oveja") || e.getClass().toString().contains("Vaca")) {
                listaAnimalesGranja.add(e);
            }
        }

        for (org.example.ejercicio_15.clases.Animal e : listaMascotas) {
            System.out.println(e.toString());
        }
        for (org.example.ejercicio_15.clases.Animal e : listaAnimalesSalvajes) {
            System.out.println(e.toString());
        }
        for (org.example.ejercicio_15.clases.Animal e : listaAnimalesGranja) {
            System.out.println(e.toString());
        }
        //FIN_EJ_15




        listaAnimales.add(perro1);
        listaAnimales.add(perro2);
        listaAnimales.add(perro3);

        listaAnimales.add(gato1);
        listaAnimales.add(gato2);

        listaAnimales.add(tucan1);
        listaAnimales.add(tucan2);

        listaAnimales.add(pezPayaso1);
        listaAnimales.add(pezPayaso2);

        listaAnimales.add(oveja1);
        listaAnimales.add(oveja2);

        listaAnimales.add(vaca1);
        listaAnimales.add(vaca2);


        //iterar hasta que el numero de animales deje de crecer

        do {

            //realizar una copia de la tabla
            ArrayList<Animal> listaAnimalesCopia=new ArrayList<>();
            for (int i = listaAnimales.size() - 1; i >= 0; i--) {//para cada elemento
                //para cada animal de la lista vamos a buscar en el resto de posiciones
                //animales suitables para tener hijos, misma clase y distinto sexo

                for (int j = i - 1; j >= 0; j--) {//comprobar combinaciones
                    if ((   (listaAnimales.get(i)).getClass() == listaAnimales.get(j).getClass()) && (listaAnimales.get(i).getSexo() != listaAnimales.get(j).getSexo())) {
                        //System.out.println("animal suitable para procrear" + listaAnimales.get(i).toString() + " con " + listaAnimales.get(j).toString());

                        switch (listaAnimales.get(i).getTipo().toString()) {
                            case "perro":
                                if(((Mascota) listaAnimales.get(i)).getNombre()=="Chucha"){
                                    Perro perro11=new Perro("bulldog", "Chuchin", "Joaquín");
                                    perro11.setSexo(Sexo.MACHO);
                                    listaAnimalesCopia.add(perro11);
                                }

                                if(((Mascota) listaAnimales.get(i)).getNombre()=="Chuchona") {
                                    Perro perro12=new Perro("bulldog", "Chuchina", "Joaquín");
                                    perro12.setSexo(Sexo.HEMBRA);
                                    listaAnimalesCopia.add(perro12);
                                }
                                break;
                            case "gato":
                                listaAnimalesCopia.add(new Gato());
                                break;
                            case "tucan":
                                listaAnimalesCopia.add(new Tucan());
                                break;
                            case "pezPayaso":
                                listaAnimalesCopia.add(new PezPayaso());
                                break;
                            case "oveja":
                                listaAnimalesCopia.add(new Oveja());
                                break;
                            case "vaca":
                                listaAnimalesCopia.add(new Vaca());
                                break;
                        }
                    }
                    /*listaAnimales.add(new Perro());*/
                }
                //al finalizar el for volcar los datos generados a la tabla original
            }
            for (Animal e : listaAnimalesCopia) {
                System.out.println(e.toString());
            }

        } while (false);/*"mientras el numero de animales sea distinto al bucle anterior*/

    }
}
