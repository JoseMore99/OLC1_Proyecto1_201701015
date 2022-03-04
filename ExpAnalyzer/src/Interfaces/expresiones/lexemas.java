/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.expresiones;

import Interfaces.tabla_s;

/**
 *
 * @author Moreira Paz
 */
public class lexemas extends Interfaces.instruccion{
    
    String id,cadena;

    public lexemas(int columna, int fila,String id, String cadena) {
        super(columna, fila);
        this.cadena = cadena;
        this.id = id;
    }

    @Override
    public Object ejecutar(tabla_s t) {
        System.out.println(id+":"+cadena);
    return this;
    }
    
}
