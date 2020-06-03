package edu.escuelaing.arsw.app.model;

/*
 * @Author: Daniel Felipe Alfonso Bueno
 * Arquitectura de Software 2020 - I
 */

public class PhyLineCounter implements LineCounter {
    private Integer lines;

    public PhyLineCounter(){
        this.lines = 0;
    }
    /*
    * @Param linea linea actual a contar
    * Suma uno a la linea sin importar si tiene comentario o no
    */
    @Override
    public void countLines(String linea) {
        lines++;
    }

    @Override
    public Integer getLines() {
        return lines;
    }

    public void setLines(Integer lines) {
        this.lines = lines;
    }
    @Override
    public String toString(){
        return "Numero de lineas fisicas: ";
    }
}
