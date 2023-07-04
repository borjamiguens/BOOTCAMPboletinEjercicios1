package org.example.ejercicio_08;

import util.Input;

import java.util.ArrayList;

class Lista {
    static ArrayList<Integer> listaNumeros=new ArrayList<>();

    static Character launchMenu(){
        System.out.println("Seleccione opcion desada" +"\n"+ "a) Introduzca numero"
                +"\n"+ "s) Obtener suma" +"\n"+ "d) Eliminar ultimo elemento"
                +"\n"+ "q) Salir del programa");
        return Input.character();
    }

}
