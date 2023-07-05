package org.example.ejercicio_16.main;

import org.example.ejercicio_16.clases.*;

import static org.example.ejercicio_16.clases.Animal.listaAnimales;
import static org.example.ejercicio_16.clases.AnimalGranja.listaAnimalesGranja;
import static org.example.ejercicio_16.clases.AnimalSalvaje.listaAnimalesSalvajes;
import static org.example.ejercicio_16.clases.Mascota.listaMascotas;


public class Main {
    public static void main(String[] args) {

        Perro perro1 = new Perro("mamifero", "perro", "bulldog", "terrestre", "Chucho", "Joaquín");
        Perro perro2 = new Perro("mamifero", "perro", "bulldog", "terrestre", "Chucha", "Felipe");
        Gato gato1 = new Gato("mamifero", "gato", "angora", "terrestre", "Micho", "Andrea");
        Gato gato2 = new Gato("mamifero", "gato", "angora", "terrestre", "Micha", "Susana");
        Tucan tucan1 = new Tucan("ave", "tucan", "comun", "marino");
        Tucan tucan2 = new Tucan("ave", "tucan", "comun", "marino");
        PezPayaso pezPayaso1 = new PezPayaso("pez", "pezPayaso", "comun", "marino");
        PezPayaso pezPayaso2 = new PezPayaso("pez", "pezPayaso", "comun", "marino");
        Oveja oveja1 = new Oveja("mamifero", "oveja", "churra", "terrestre", "Serafín");
        Oveja oveja2 = new Oveja("mamifero", "oveja", "churra", "terrestre", "Serafín");
        Vaca vaca1 = new Vaca("mamifero", "vaca", "rubia", "terrestre", "Laureano");
        Vaca vaca2 = new Vaca("mamifero", "vaca", "rubia", "terrestre", "Laureano");

        perro1.setSexo("macho");
        listaAnimales.add(perro1);
        perro2.setSexo("hembra");
        listaAnimales.add(perro2);

        gato1.setSexo("macho");
        listaAnimales.add(gato1);
        gato2.setSexo("hembra");
        listaAnimales.add(gato2);

        tucan1.setSexo("macho");
        listaAnimales.add(tucan1);
        /*tucan2.setSexo("hembra");
        listaAnimales.add(tucan2);*/

        pezPayaso1.setSexo("macho");
        listaAnimales.add(pezPayaso1);
        /*pezPayaso2.setSexo("hembra");
        listaAnimales.add(pezPayaso2);*/

        oveja1.setSexo("macho");
        listaAnimales.add(oveja1);
        /*oveja2.setSexo("hembra");
        listaAnimales.add(oveja2);*/

        vaca1.setSexo("macho");
        listaAnimales.add(vaca1);
        /*vaca2.setSexo("hembra");
        listaAnimales.add(vaca2);
*/

        /*Animal perro2=new Animal(perro1);
        Animal perro3=perro1.cloneAnimal();
        listaAnimales.add(perro2);
        listaAnimales.add(perro3);*/

        /*for (Animal e : listaAnimales) {
            System.out.println(e.toString());
        }

        for (Animal e : listaAnimales) {
            if (e.getClass().toString().contains("Perro") || e.getClass().toString().contains("Gato")) {
                listaMascotas.add(e);
            }
            if (e.getClass().toString().contains("Tucan") || e.getClass().toString().contains("PezPayaso")) {
                listaAnimalesSalvajes.add(e);
            }
            if (e.getClass().toString().contains("Oveja") || e.getClass().toString().contains("Vaca")) {
                listaAnimalesGranja.add(e);
            }
        }*/

        /*for (Animal e : listaMascotas) {
            System.out.println(e.toString());
        }
        for (Animal e : listaAnimalesSalvajes) {
            System.out.println(e.toString());
        }
        for (Animal e : listaAnimalesGranja) {
            System.out.println(e.toString());
        }*/


        //iterar hasta que el numero de animales deje de crecer
        int tamanoListaAnimalesAnt;
        do {
            tamanoListaAnimalesAnt= listaAnimales.size();

        for (int i = listaAnimales.size() - 1; i >= 0; i--) {//para cada animal de la lista vamos a buscar en el resto de posiciones
            //animales suitables para tener hijos, misma clase y distinto sexo
            for (int j = i - 1; j >= 0; j--) {//comprobar
                if ((listaAnimales.get(i).getClass() == listaAnimales.get(j).getClass()) && (listaAnimales.get(i).getSexo() != listaAnimales.get(j).getSexo())) {
                    System.out.println("animal suitable para procrear" + listaAnimales.get(i).toString() + " con " + listaAnimales.get(i + j + 1).toString());
                    tamanoListaAnimalesAnt++;
                    switch (listaAnimales.get(i).getTipo().toString()) {
                        case "perro":
                            listaAnimales.add(new Perro());

                            break;
                        case "gato":
                            listaAnimales.add(new Gato());
                            break;
                        case "tucan":
                            listaAnimales.add(new Tucan());
                            break;
                        case "pezPayaso":
                            listaAnimales.add(new PezPayaso());
                            break;
                        case "oveja":
                            listaAnimales.add(new Oveja());
                            break;
                        case "vaca":
                            listaAnimales.add(new Vaca());
                            break;


                    }


                }
                /*listaAnimales.add(new Perro());*/
            }

        }
        for (Animal e : listaAnimales) {
            System.out.println(e.toString());
        }

        } while (tamanoListaAnimalesAnt != listaAnimales.size()/*"mientras el numero de animales sea distinto al bucle anterior--buscar un flag de estado anterior"*/);

    }
}
