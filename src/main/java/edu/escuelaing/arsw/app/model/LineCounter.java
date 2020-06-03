package edu.escuelaing.arsw.app.model;


/*
 * @Author: Daniel Felipe Alfonso Bueno
 * Arquitectura de Software 2020 - I
 */
public interface LineCounter {
    public void countLines(String linea);

    public Integer getLines();

    public String toString();

    public void setLines(Integer lines);

}
