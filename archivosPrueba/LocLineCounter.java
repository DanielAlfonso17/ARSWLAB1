package edu.escuelaing.arsw.app.model;

public class LocLineCounter implements LineCounter {
    private Integer lines;


    public LocLineCounter(){
        this.lines = 0;
    }
    /*
    * @Param linea linea que deseamos contar para verificar si tiene comentarios
    * Verificamos si tiene algun tipo de comentario de java, si tiene omitimos esta linea, si no sumamos uno a la linea
    */
    @Override
    public void countLines(String linea) {
        if(linea.startsWith("/*") || linea.startsWith("*") || linea.startsWith("//") || linea.endsWith("*/"));
        else{
            lines++;
        }
    }

    @Override
    public Integer getLines() {
        return lines;
    }

    @Override
    public void setLines(Integer lines) {
        this.lines = lines;
    }

    @Override
    public String toString(){
        return "Numero de lineas sin comentarios: ";
    }
}
