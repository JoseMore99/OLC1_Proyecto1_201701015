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
public class Tab_siguientes {
    String valor;
    int numero;
    LinkedList<Object> siguientes;

    public Tab_siguientes(String valor, int numero) {
        this.valor = valor;
        this.numero = numero;
        this.siguientes = new LinkedList<>();
    }
    
}
