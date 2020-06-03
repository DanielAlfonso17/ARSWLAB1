package edu.escuelaing.arsw.app.model;

import javax.sound.sampled.Line;
import java.io.*;
import java.util.ArrayList;



/*
 * @Author: Daniel Felipe Alfonso Bueno
 * Arquitectura de Software 2020 - I
 */
public class FileReaderE {
    private File archivo;
    public FileReaderE(File archivo) {
        this.archivo = archivo;
    }
    /*
    * @Param LineCounter conteoLineas interfaz LineCounter la cual puede ser o conteoFisico o conteoLoc depende de la instancia generada
    * donde se llama la funcion
    * Leeremos nuestros archivos con esta funcion(linea a linea) ademas utilizaremos la clase line counter, para ir contando las lineas a medida que leemos el archivo
    * omitiendo lineas en blanco
    * @Return conteoLineas.getLines() retorna el # de lineas del archivo dependiendo si es Loc o Phy
    */
    public Integer leerArchivo(LineCounter conteoLineas) throws IOException {
        conteoLineas.setLines(0);
        FileReader fr = new FileReader(archivo);
        BufferedReader buffer = new BufferedReader(new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(archivo), "UTF8")));
        String linea;
        while ((linea=buffer.readLine())!= null){
            linea = linea.trim();
            //System.out.println(linea);
            if(linea.equals("")){
                continue;
            }else{
                conteoLineas.countLines(linea);
            }
        }
        fr.close();
        System.out.println(conteoLineas.toString() + conteoLineas.getLines());
        return conteoLineas.getLines();
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
}
