package edu.escuelaing.arsw.app;
import edu.escuelaing.arsw.app.model.FileReaderE;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import edu.escuelaing.arsw.app.model.LineCounter;
import edu.escuelaing.arsw.app.model.LocLineCounter;
import edu.escuelaing.arsw.app.model.PhyLineCounter;

import org.junit.Test;

import javax.sound.sampled.Line;
import java.io.File;
import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{



    @Test
    public void deberiaContarLineasFisicas() throws IOException {
        LineCounter lineasFisicas= new PhyLineCounter();
        String path = "src/main/resources/MyBatisExample.java";
        File archivo = new File(path);
        FileReaderE archivoLeer = new FileReaderE(archivo);
        Integer numeroLineasFisicas = archivoLeer.leerArchivo(lineasFisicas);
        assertTrue(34 == numeroLineasFisicas);
    }

    @Test
    public void deberiaFallarConteoLineasFisicas() throws IOException{
        LineCounter lineasFisicas= new PhyLineCounter();
        String path = "src/main/resources/MyBatisExample.java";
        File archivo = new File(path);
        FileReaderE archivoLeer = new FileReaderE(archivo);
        Integer numeroLineasFisicas = archivoLeer.leerArchivo(lineasFisicas);
        assertFalse(48 == numeroLineasFisicas);
    }

    @Test
    public void deberiaContarLineasLoc() throws  IOException{
        LineCounter lineasLoc = new LocLineCounter();
        String path = "src/main/resources/MyBatisExample.java";
        File archivo = new File(path);
        FileReaderE archivoLeer = new FileReaderE(archivo);
        Integer numeroLineasLoc = archivoLeer.leerArchivo(lineasLoc);
        assertTrue(22 == numeroLineasLoc);
    }

    @Test
    public void deberiaFallarEnContarLineasLoc() throws  IOException{
        LineCounter lineasLoc = new LocLineCounter();
        String path = "src/main/resources/MyBatisExample.java";
        File archivo = new File(path);
        FileReaderE archivoLeer = new FileReaderE(archivo);
        Integer numeroLineasLoc = archivoLeer.leerArchivo(lineasLoc);
        assertFalse(20 == numeroLineasLoc);
    }

    @Test
    public void deberiaContarLineasFisicas2()throws IOException{
        LineCounter lineasFisicas= new PhyLineCounter();
        String path = "src/main/resources/SpringBootBackendApirestApplication.java";
        File archivo = new File(path);
        FileReaderE archivoLeer = new FileReaderE(archivo);
        Integer numeroLineasFisicas = archivoLeer.leerArchivo(lineasFisicas);
        assertTrue(29 == numeroLineasFisicas);
    }

    @Test
    public void deberiaFallarConteoLineasFisicas2()throws IOException{
        LineCounter lineasFisicas= new PhyLineCounter();
        String path = "src/main/resources/SpringBootBackendApirestApplication.java";
        File archivo = new File(path);
        FileReaderE archivoLeer = new FileReaderE(archivo);
        Integer numeroLineasFisicas = archivoLeer.leerArchivo(lineasFisicas);
        assertFalse(30 == numeroLineasFisicas);
    }

    @Test
    public void deberiaContarLineasLoc2() throws  IOException{
        LineCounter lineasLoc = new LocLineCounter();
        String path = "src/main/resources/SpringBootBackendApirestApplication.java";
        File archivo = new File(path);
        FileReaderE archivoLeer = new FileReaderE(archivo);
        Integer numeroLineasLoc = archivoLeer.leerArchivo(lineasLoc);
        assertTrue(23 == numeroLineasLoc);
    }

    @Test
    public void deberiaFallarConteoLineasLoc2() throws  IOException{
        LineCounter lineasLoc = new LocLineCounter();
        String path = "src/main/resources/SpringBootBackendApirestApplication.java";
        File archivo = new File(path);
        FileReaderE archivoLeer = new FileReaderE(archivo);
        Integer numeroLineasLoc = archivoLeer.leerArchivo(lineasLoc);
        assertFalse(50 == numeroLineasLoc);
    }

    @Test
    public void deberiaContarLineasFisicas3() throws IOException {
        LineCounter lineasFisicas= new PhyLineCounter();
        String path = "src/main/resources/DonkeyPOOBGUI.java";
        File archivo = new File(path);
        FileReaderE archivoLeer = new FileReaderE(archivo);
        Integer numeroLineasFisicas = archivoLeer.leerArchivo(lineasFisicas);
        assertTrue(667 == numeroLineasFisicas);
    }

    @Test
    public void deberiaFallarConteoLineasFisicas3() throws IOException {
        LineCounter lineasFisicas= new PhyLineCounter();
        String path = "src/main/resources/DonkeyPOOBGUI.java";
        File archivo = new File(path);
        FileReaderE archivoLeer = new FileReaderE(archivo);
        Integer numeroLineasFisicas = archivoLeer.leerArchivo(lineasFisicas);
        assertFalse(668 == numeroLineasFisicas);
    }

    @Test
    public void deberiaContarLineasLoc3() throws IOException {
        LineCounter lineasFisicas= new LocLineCounter();
        String path = "src/main/resources/DonkeyPOOBGUI.java";
        File archivo = new File(path);
        FileReaderE archivoLeer = new FileReaderE(archivo);
        Integer numeroLineasLoc = archivoLeer.leerArchivo(lineasFisicas);
        assertTrue(552 == numeroLineasLoc);
    }

    @Test
    public void deberiaFallarConteoLineasLoc3() throws IOException {
        LineCounter lineasFisicas= new LocLineCounter();
        String path = "src/main/resources/DonkeyPOOBGUI.java";
        File archivo = new File(path);
        FileReaderE archivoLeer = new FileReaderE(archivo);
        Integer numeroLineasLoc = archivoLeer.leerArchivo(lineasFisicas);
        assertFalse(551 == numeroLineasLoc);
    }








}
