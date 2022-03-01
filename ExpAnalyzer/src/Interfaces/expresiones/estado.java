/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.expresiones;

import java.util.LinkedList;

/**
 *
 * @author Moreira Paz
 */
public class estado {
    String nombre;
    LinkedList<Object> siguientes;
    LinkedList<transision> Transisiones;

    public estado(String nombre) {
        this.nombre = nombre;
        this.siguientes = new LinkedList<>();
        this.Transisiones = new LinkedList<>();
    }
    
    
     
}
