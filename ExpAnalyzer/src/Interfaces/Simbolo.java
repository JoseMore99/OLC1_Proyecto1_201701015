/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Moreira Paz
 */
public class Simbolo {
    String nombre,tipo;
    int fila,columna;
    Object valor;

    public Simbolo(String nombre, Object valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
    
}
