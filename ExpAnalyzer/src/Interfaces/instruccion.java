/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Moreira Paz
 */
public abstract class instruccion {
    
    public abstract Object ejecutar(tabla_s t);
    int columna;
    int fila;

    public instruccion(int columna, int fila) {
        this.columna = columna;
        this.fila = fila;
    }
    
     
}
