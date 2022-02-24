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
public class primitivo extends Interfaces.instruccion{
    
    String valor;
    int ascii;
    public primitivo(int columna, int fila, String valor) {
        super(columna, fila);
        this.valor = valor;
        
    }

    @Override
    public Object ejecutar(tabla_s t) {
        //calcular ascii
        //System.out.println("Entro a primitivo");
        return this.valor;
    }
    
}
