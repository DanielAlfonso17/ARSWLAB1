package edu.escuelaing.arsw.app;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import edu.escuelaing.arsw.app.model.FileReaderE;
import edu.escuelaing.arsw.app.model.LineCounter;
import edu.escuelaing.arsw.app.model.LocLineCounter;
import edu.escuelaing.arsw.app.model.PhyLineCounter;

public class App
{
    /*
    * Aplicacion principal, donde evaluamos el tipo de conteo que se realizara. Ademas verificamos si es un directorio para realizar
    * la respectiva recursión sobre este o si es un archivo leer y contar sus lineas
     */
    public static void main(String[] args ) throws IOException {
        String tipoConteo = args[0];
        String path = args[1];
        LineCounter conteoLineas = null;
        if(tipoConteo.equals("phy")){
            conteoLineas= new PhyLineCounter();

        }else if(tipoConteo.equals("loc")){
            conteoLineas = new LocLineCounter();
        }
        File archivo = new File(path);
        if(archivo.isDirectory()) {
            File[] listaArchivos = archivo.listFiles();
            for (int x = 0; x < listaArchivos.length; x++) {
                if (listaArchivos[x].isFile()) {
                    System.out.println("Archivo: " + listaArchivos[x].getPath());
                    FileReaderE archivoLeer = new FileReaderE(listaArchivos[x]);
                    archivoLeer.leerArchivo(conteoLineas);
                }
            }
        }else{
            System.out.println("Archivo: "+ archivo.getPath());
            FileReaderE archivoLeer= new FileReaderE(archivo);
            archivoLeer.leerArchivo(conteoLineas);
        }



    }
}
