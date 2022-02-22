/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.LinkedList;

/**
 *
 * @author Moreira Paz
 */
public class tabla_s {
    
    LinkedList<Simbolo> tabla;
    public tabla_s() {
        this.tabla = new LinkedList<>();
    }

    public boolean nuevoSimbolo(Simbolo nuevo){
      if(!existeSimbolo(nuevo.nombre)){
          tabla.add(nuevo);
          return true;
      }
      return false;
    }

    public boolean existeSimbolo(String nombre){
        return tabla.stream().anyMatch(simbolo -> (simbolo.nombre.equals(nombre)));
    }

    public Simbolo getSimbolo(String nombre){
        for (Simbolo simbolo : tabla) {
            if(simbolo.nombre.equals(nombre)){
                return simbolo;
            }
        }
        return null;
    }

    public void imprimir(){
        tabla.forEach(simbolo -> {
            System.out.println("Nombre: "+simbolo.nombre);
        });
    }
}
