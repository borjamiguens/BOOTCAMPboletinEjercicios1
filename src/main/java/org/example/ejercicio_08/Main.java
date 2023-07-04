package org.example.ejercicio_08;

import util.Input;

import java.util.ArrayList;

import static org.example.ejercicio_08.Lista.launchMenu;
import static org.example.ejercicio_08.Lista.listaNumeros;

public class Main {
    public static void main(String[] args) {

        int numero;
        Character opcion;
        int suma=0;



        do {
            opcion = launchMenu();
            switch (opcion) {
                case 'a':
                    System.out.println("Introduzca un numero");
                    numero = Input.integer();
                    listaNumeros.add(numero);
                    break;
                case 's':
                    if (!listaNumeros.isEmpty()) {
                        for (int i=0; i<listaNumeros.size(); i++) {
                            suma+=listaNumeros.get(i);
                        }   System.out.println("La suma es " + suma+"\n");//hacer la suma
                    } else {
                        System.out.println("La lista de numeros está vacia\n");
                    }
                    suma=0;
                    break;

                case 'd':
                    if (!listaNumeros.isEmpty()) {
                        listaNumeros.remove(listaNumeros.size()-1);
                    } else {
                        System.out.println("La lista de numeros está vacia\n");
                    }
                    break;
                case 'q':

                    break;
                default: {
                    System.out.println("La opción es incorrecta\n");

                }

            }
        } while(opcion!='q');
    }
}
