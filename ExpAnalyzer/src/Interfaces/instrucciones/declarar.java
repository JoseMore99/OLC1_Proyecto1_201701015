/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.instrucciones;

import Interfaces.expresiones.conj_rango;
import Interfaces.instruccion;
import Interfaces.tabla_s;

/**
 *
 * @author Moreira Paz
 */
public class declarar extends Interfaces.instruccion{

    String nombre;
    conj_rango expresion;
    public declarar(int columna, int fila,String nombre, conj_rango expresion) {
        super(columna, fila);
        this.nombre = nombre;
        this.expresion = expresion;
    }

    @Override
    public Object ejecutar(tabla_s t) {
        conj_rango c = (conj_rango) this.expresion.ejecutar(t);
       
        System.out.println("nombre: "+this.nombre+" inicio:");
        return this;
    }
    
}
