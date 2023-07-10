package org.example.ejercicio_19.main;

import org.example.ejercicio_14.clases.Zoo;
import org.example.ejercicio_19.clases.Fichero;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        Zoo.creaAnimales();
        Zoo.criarAnimales(3);
        Fichero.createFile();
    }
}
