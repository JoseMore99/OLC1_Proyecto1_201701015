/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.expresiones;

/**
 *
 * @author Moreira Paz
 */
public class Nodob {
    Nodob iz,der;
    String valor;

    public Nodob(Nodob iz, Nodob der, String valor) {
        this.iz = iz;
        this.der = der;
        this.valor = valor;
    }
    
}
