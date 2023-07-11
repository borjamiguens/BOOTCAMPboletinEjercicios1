package org.example.ejercicio_19.clases;

import org.example.ejercicio_09.clases.Reino;
import org.example.ejercicio_13.clases.Animal;
import org.example.ejercicio_13.clases.AnimalGranja;
import org.example.ejercicio_13.clases.Mascota;
import org.example.ejercicio_13.clases.Perro;

import java.io.*;
import java.util.Arrays;

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

    public static void readFile(){
        BufferedReader br=null;
        listaAnimales.clear();
        try{
            br=new BufferedReader(new FileReader(new File("D:\\BOOTCAMP\\archivoPrueba.csv")));
            String linea="";
            int i=0;
            while ((linea=br.readLine()) !=null){
                /*System.out.println(linea);*/
                /*listaAnimales.get(i)*/

                String [] campo = linea.split(",");
                /*System.out.println(Arrays.toString(campo));*/
                //intentar convertir los datos string a los tipos correspondientes en los argumentos de constructor
                Perro perro1=new Perro(campo[3],campo[5],campo[6],null,null,null,0);
                listaAnimales.add(perro1);
                i++;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if(null!=br){
                    br.close();
                }
            } catch (Exception e2){
                e2.printStackTrace();
            }
        }
        for(Animal e : listaAnimales){
            System.out.println(e.toString());
        }
    }

}
