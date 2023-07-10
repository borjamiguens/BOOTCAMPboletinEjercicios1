package org.example.ejercicio_19.clases;

import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_13.clases.Animal;
import org.example.ejercicio_13.clases.AnimalGranja;
import org.example.ejercicio_13.clases.Mascota;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import static org.example.ejercicio_13.clases.Animal.listaAnimales;

public class Fichero {

    public static void createFile() {

        File file1 = new File("D:\\BOOTCAMP\\archivoPrueba.csv");
        PrintWriter pw = null;
        String nombreMascota = "";
        String nombrePropietario = "";
        String idPadre="";
        String idMadre="";

        try {
            pw = new PrintWriter(new FileWriter(file1));
            pw.println("ID,Reino,Tipo,Raza,Medio,Nombre,Propietario,Sexo,IdPadre,IdMadre,Generacion");
            for (int i = 0; i < listaAnimales.size(); i++) {
                Animal animalI = listaAnimales.get(i);
                //Si el animal es mascota tendrá nombre
                if (animalI.getClass().getSuperclass() == Mascota.class)
                {
                    nombreMascota = ((Mascota) animalI).getNombre();
                }
                else nombreMascota = "";

                //Si el animal es mascota o de granja tendrá propietario
                if (animalI.getClass().getSuperclass() == Mascota.class)
                {//Mascota
                    nombrePropietario = ((Mascota) animalI).getPropietario();
                }
                else {
                    if (animalI.getClass().getSuperclass() == AnimalGranja.class)
                    {//AnimalGranja
                        nombrePropietario = ((AnimalGranja) animalI).getPropietario();
                    }
                    else nombrePropietario = "";
                }

                if(animalI.getGeneracion()==0)
                {
                    idPadre="";
                    idMadre="";
                }
                else
                {
                    idPadre = animalI.getPadre().getId().toString();
                    idMadre = animalI.getMadre().getId().toString();
                }

                pw.println(animalI.getId() + "," + animalI.getReino() + "," + animalI.getTipo() + "," + animalI.getRaza() + "," + animalI.getMedio()
                        + "," + nombreMascota+ "," + nombrePropietario+ "," + animalI.getSexo()+ "," + idPadre+ "," + idMadre
                        + "," + animalI.getGeneracion());
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
