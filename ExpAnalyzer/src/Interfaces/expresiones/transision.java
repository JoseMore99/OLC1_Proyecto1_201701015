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
public class transision {
    String terminal,Nombre;
    LinkedList<Object> siguientes;

    public transision(String terminal, String Nombre) {
        this.terminal = terminal;
        this.Nombre = Nombre;
        this.siguientes = new LinkedList<>();
    }
    
}
