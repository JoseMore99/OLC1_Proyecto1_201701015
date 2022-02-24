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
public class ExpRegular extends Interfaces.instruccion {
    Nodob expresion;
    String id;

    public ExpRegular(int columna, int fila, Nodob expresion, String id) {
         super(columna, fila);
        this.expresion = expresion;
        this.id = id;
    }

    @Override
    public Object ejecutar(tabla_s t) {
        System.out.println(this.id);
        inorden(this.expresion);
        return this;
    }
    
    public void inorden (Nodob raiz){
        if(raiz!=null){
            inorden(raiz.iz);
            System.out.println(raiz.valor);
            inorden(raiz.der);
        }
    }
    

}
