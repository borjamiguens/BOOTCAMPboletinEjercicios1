package org.example.ejercicio_19.clases;

import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_13.clases.Animal;
import org.example.ejercicio_13.clases.Mascota;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import static org.example.ejercicio_13.clases.Animal.listaAnimales;

public class Fichero {

    public static void createFile() {

        File file1 = new File("D:\\BOOTCAMP\\archivoPrueba.csv");
        PrintWriter pw = null;

        try {
            pw = new PrintWriter(new FileWriter(file1));
            pw.println("ID,Reino,Tipo,Raza,Medio,Nombre,Propietario,Sexo,IdPadre,IdMadre,Generacion");
            for (int i = 0; i < listaAnimales.size(); i++) {
                Animal animalI = listaAnimales.get(i);
                pw.println(animalI.getId() + "," + animalI.getReino() + "," + animalI.getTipo() + "," + animalI.getRaza() + "," + animalI.getMedio()
                        + "," );
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (file1 != null) {
                    pw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

}
