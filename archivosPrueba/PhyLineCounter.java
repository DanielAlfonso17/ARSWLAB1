package edu.escuelaing.arsw.app.model;

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
