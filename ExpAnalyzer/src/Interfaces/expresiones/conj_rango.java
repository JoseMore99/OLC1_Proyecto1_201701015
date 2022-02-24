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
    String inicio_char,fin_char,id;
    public conj_rango(int columna, int fila,String id, Object inicio,Object fin) {
        super(columna, fila);
        this.id = id;
        this.inicio = (primitivo) inicio;
        this.fin = (primitivo) fin;
        
    }

    @Override
    public Object ejecutar(tabla_s t) {
        this.inicio_char =  (String) inicio.ejecutar(t);
        this.fin_char =  (String) fin.ejecutar(t);
         System.out.println("conjunto "+id +":"+inicio_char+"~"+fin_char);
        return this;
    }
    
}
