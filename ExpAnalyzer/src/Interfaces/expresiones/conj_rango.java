/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.expresiones;

import Interfaces.instruccion;
import Interfaces.tabla_s;

/**
 *
 * @author Moreira Paz
 */
public class conj_rango extends Interfaces.instruccion {

    primitivo inicio,fin;
    char inicio_char,fin_char;
    public conj_rango(int columna, int fila, primitivo inicio,primitivo fin) {
        super(columna, fila);
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public Object ejecutar(tabla_s t) {
        this.inicio_char = (char) inicio.ejecutar(t);
        this.fin_char = (char) fin.ejecutar(t);
        return this;
    }
    
}
