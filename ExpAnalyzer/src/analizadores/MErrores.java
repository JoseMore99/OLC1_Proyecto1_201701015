/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores;

/**
 *
 * @author Moreira Paz
 */
public class MErrores {
    public String tipo,desc;
    public int linea,columna;

    public MErrores(String tipo, String desc, int linea, int columna) {
        this.tipo = tipo;
        this.desc = desc;
        this.linea = linea+1;
        this.columna = columna+1;
    }
    
}
