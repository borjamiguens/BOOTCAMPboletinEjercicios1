package org.example.ejercicio_14_16.main;

import org.example.ejercicio_13.Animal;
import org.example.ejercicio_14_16.clases.*;

import java.util.ArrayList;

import static org.example.ejercicio_13.Animal.listaAnimales;
import static org.example.ejercicio_13.Animal.listaAnimales;
import static org.example.ejercicio_14_16.clases.AnimalGranja.listaAnimalesGranja;
import static org.example.ejercicio_14_16.clases.AnimalSalvaje.listaAnimalesSalvajes;
import static org.example.ejercicio_14_16.clases.Mascota.listaMascotas;


public class Main {
    public static void main(String[] args) {

        //CREAMOS ANIMALES Y LOS AÑADIMOS
        Perro perro1 = new Perro("bulldog", "Chucho", "Joaquín", Sexo.MACHO, null, null, 0);
        Perro perro2 = new Perro("bulldog", "Chucha", "Felipe", Sexo.HEMBRA, null, null, 0);
        Perro perro3 = new Perro("bulldog", "Chuchon", "Carlos", Sexo.MACHO, null, null, 0);
        Perro perro4 = new Perro("bulldog", "Chuchona", "Ana", Sexo.HEMBRA, null, null, 0);
        /*Perro perro5 = new Perro("bulldog", "Perraco", "Carlos", Sexo.MACHO, null, null, 0);
        Perro perro6 = new Perro("bulldog", "Perraca", "Carlos", Sexo.HEMBRA, null, null, 0);*/

        Gato gato1 = new Gato("angora", "Micho", "Andrea", Sexo.MACHO, null, null, 0);
        Gato gato2 = new Gato("angora", "Micha", "Susana", Sexo.HEMBRA, null, null, 0);
        Gato gato3 = new Gato("persa", "Michinho", "Andrea", Sexo.MACHO, null, null, 0);
        Gato gato4 = new Gato("persa", "Michinha", "Susana", Sexo.HEMBRA, null, null, 0);

        Tucan tucan1 = new Tucan("comun", Sexo.MACHO, null, null, 0);
        Tucan tucan2 = new Tucan("comun", Sexo.HEMBRA, null, null, 0);
        Tucan tucan3 = new Tucan("comun", Sexo.HEMBRA, null, null, 0);

        PezPayaso pezPayaso1 = new PezPayaso("comun", Sexo.MACHO, null, null, 0);
        PezPayaso pezPayaso2 = new PezPayaso("comun", Sexo.HEMBRA, null, null, 0);
        PezPayaso pezPayaso3 = new PezPayaso("comun", Sexo.HEMBRA, null, null, 0);

        Oveja oveja1 = new Oveja("churra", "Serafín", Sexo.MACHO, null, null, 0);
        Oveja oveja2 = new Oveja("churra", "Serafín", Sexo.HEMBRA, null, null, 0);
        Oveja oveja3 = new Oveja("churra", "Serafín", Sexo.HEMBRA, null, null, 0);

        Vaca vaca1 = new Vaca("rubia", "Laureano", Sexo.MACHO, null, null, 0);
        Vaca vaca2 = new Vaca("rubia", "Laureano", Sexo.HEMBRA, null, null, 0);
        Vaca vaca3 = new Vaca("rubia", "Laureano", Sexo.HEMBRA, null, null, 0);

        listaAnimales.add(perro1);
        listaAnimales.add(perro2);
        listaAnimales.add(perro3);
        listaAnimales.add(perro4);

        listaAnimales.add(gato1);
        listaAnimales.add(gato2);
        listaAnimales.add(gato3);
        listaAnimales.add(gato4);

        listaAnimales.add(tucan1);
        listaAnimales.add(tucan2);
        listaAnimales.add(tucan3);

        listaAnimales.add(pezPayaso1);
        listaAnimales.add(pezPayaso2);
        listaAnimales.add(pezPayaso3);

        listaAnimales.add(oveja1);
        listaAnimales.add(oveja2);
        listaAnimales.add(oveja3);

        listaAnimales.add(vaca1);
        listaAnimales.add(vaca2);
        listaAnimales.add(vaca3);

        ///////EJERCICIO_15///////
        /*for (Animal e : listaAnimales) {
            System.out.println(e.toString());
        }*/

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
        }

        /*for (Animal e : listaMascotas) {
            System.out.println(e.toString());
        }*/
        /*for (Animal e : listaAnimalesSalvajes) {
            System.out.println(e.toString());
        }*/
        /*for (Animal e : listaAnimalesGranja) {
            System.out.println(e.toString());
        }*/
        ////////FIN_EJ_15/////////


        //iterar hasta que el numero de animales hasta un máximo de generaciones
        int generacion = 1;
        do {

            //realizar una copia de la tabla
            ArrayList<Animal> listaAnimalesCria = new ArrayList<>();
            for (int i = listaAnimales.size() - 1; i >= 0; i--) {//para cada elemento
                //para cada animal de la lista vamos a buscar en el resto de posiciones
                //animales suitables para tener hijos, misma clase y distinto sexo
                int m;
                int p;
                for (int j = i - 1; j >= 0; j--) {//comprobar combinaciones

                    //en el siguiente orden
                    //si los candidatos son de la misma especie y distinto sexo
                    //y si las madres y los padres de los candidatos son distintos o si son de la primera generación(porque sus padres serin iguales a null)
                    //y no son padre e hijo
                    //y nos son madre e hijo
                    //falta añadir la condicion de un hijo por pareja podemos probar con un arrayList de Hijos???
                    if (
                            ((listaAnimales.get(i)).getClass() == listaAnimales.get(j).getClass()) && (listaAnimales.get(i).getSexo() != listaAnimales.get(j).getSexo())
                                    && ((listaAnimales.get(i).getPadre() != listaAnimales.get(j).getPadre() && listaAnimales.get(i).getMadre() != listaAnimales.get(j).getMadre()) || (listaAnimales.get(i).getGeneracion() == 0 && listaAnimales.get(j).getGeneracion() == 0))
                                    && (listaAnimales.get(i).getPadre() != listaAnimales.get(j) || listaAnimales.get(j).getPadre() != listaAnimales.get(i))
                                    && (listaAnimales.get(i).getMadre() != listaAnimales.get(j) || listaAnimales.get(j).getMadre() != listaAnimales.get(i))
                    ) {
                        //System.out.println("animal suitable para procrear" + listaAnimales.get(i).toString() + " con " + listaAnimales.get(j).toString());

                        //discernir si madre/padre es la j o la i, es decir, si la hembra/macho es el animal del for i o del j m es la madre y p es el padre
                        if (listaAnimales.get(i).getSexo() == Sexo.HEMBRA) {
                            m = i;
                            p = j;
                        } else {
                            m = j;
                            p = i;
                        }
                        if (listaAnimales.get(i).getTipo().equals(Tipo.PERRO)) {
                            listaAnimalesCria.add(new Perro("", "", "", Sexo.MACHO, listaAnimales.get(p), listaAnimales.get(m), generacion));//un perro macho tendra un hijo con cada perra(2)
                            listaAnimalesCria.add(new Perro("", "", "", Sexo.HEMBRA, listaAnimales.get(p), listaAnimales.get(m), generacion));
                        } else if (listaAnimales.get(i).getTipo().equals(Tipo.GATO)) {
                            listaAnimalesCria.add(new Gato("", "", "", Sexo.MACHO, listaAnimales.get(p), listaAnimales.get(m), generacion));
                            listaAnimalesCria.add(new Gato("", "", "", Sexo.MACHO, listaAnimales.get(p), listaAnimales.get(m), generacion));
                        } else if (listaAnimales.get(i).getTipo().equals(Tipo.TUCAN)) {
                            listaAnimalesCria.add(new Tucan());
                        } else if (listaAnimales.get(i).getTipo().equals(Tipo.PEZ_PAYASO)) {
                            listaAnimalesCria.add(new PezPayaso());
                        } else if (listaAnimales.get(i).getTipo().equals(Tipo.OVEJA)) {
                            listaAnimalesCria.add(new Oveja());
                        } else if (listaAnimales.get(i).getTipo().equals(Tipo.VACA)) {
                            listaAnimalesCria.add(new Vaca());
                        }
                    }
                    /*listaAnimales.add(new Perro());*/
                }
                //al finalizar el for volcar los datos generados a la tabla original
            }
            /*for (Animal e : listaAnimalesCopia) {
                System.out.println(e.toString());
            }*/
            for (Animal e : listaAnimalesCria) {//añado las crias a la listaAnimales
                listaAnimales.add(e);
            }
            /*for (Animal e : listaAnimalesCria) {
                System.out.println(e.toString());
            }*/

            generacion++;
        } while (generacion < 4);/*"mientras el numero de animales sea distinto al bucle anterior generacion<4*/

        for (Animal e : listaAnimales) {
            System.out.println(e.toString());
        }
        System.out.println(listaAnimales.size());

    }
}

