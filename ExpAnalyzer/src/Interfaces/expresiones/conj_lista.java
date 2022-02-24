/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.expresiones;

import Interfaces.tabla_s;
import java.util.LinkedList;

/**
 *
 * @author Moreira Paz
 */
public class conj_lista extends Interfaces.instruccion{
    LinkedList<primitivo> lista =new  LinkedList<>();
    String id;
    public conj_lista(int columna, int fila, LinkedList<primitivo> lista,String id) {
        super(columna, fila);
        this.lista=lista;
        this.id =id;
    }

    @Override
    public Object ejecutar(tabla_s t) {
        System.out.print("lista "+id +":"); 
        this.lista.forEach((instruccion) -> {
            if(instruccion.getClass()==Interfaces.expresiones.primitivo.class){
                Interfaces.expresiones.primitivo o =(Interfaces.expresiones.primitivo)instruccion;
                System.out.print(o.ejecutar(t)+","); 
            }
            
        });
        System.out.println("");
        return this;
    }
    
}
