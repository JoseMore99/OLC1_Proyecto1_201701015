/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.expresiones;

import Interfaces.tabla_s;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Moreira Paz
 */
public class ExpRegular extends Interfaces.instruccion {
    Nodob expresion;
    String id,acumulado;

    public ExpRegular(int columna, int fila, Nodob expresion, String id) {
         super(columna, fila);
        this.expresion = expresion;
        this.id = id;
    }

    @Override
    public Object ejecutar(tabla_s t) {
        System.out.println(this.id);
        acumulado ="";
        FileWriter ficha = null;
        PrintWriter escritor = null;
        try
        {
            ficha = new FileWriter("src/ARBOLES_201701015/arbol"+id+".dot");
            escritor = new PrintWriter(ficha);

                escritor.println("digraph G{\nnode [shape=circle]; ");
                inorden(this.expresion);
                escritor.println(acumulado);
                escritor.println("}");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // aprovechamos el finally para asegurarnos que se cierra el fichero.
              ficha.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        try {
            String cmd = "dot -Tpng src/ARBOLES_201701015/arbol"+id+".dot -o src/ARBOLES_201701015/arbol"+id+".png";
            Runtime.getRuntime().exec(cmd); 
        } catch (IOException ioe){
            System.out.println (ioe);
        }
        return this;
    }
    
    public void inorden (Nodob raiz){
        if(raiz!=null){
            if (raiz.tipo.equals("cadena")){
                acumulado = acumulado + "nodo"+raiz.id+"[label="+raiz.valor+"];\n";
            }else{
                 acumulado = acumulado + "nodo"+raiz.id+"[label=\""+raiz.valor+"\"];\n";
            }
            if (raiz.iz!=null){
                acumulado=acumulado+"nodo"+raiz.id+"->nodo"+raiz.iz.id+"\n";
            }
            if (raiz.der!=null){
                acumulado=acumulado+"nodo"+raiz.id+"->nodo"+raiz.der.id+"\n";
            }
            inorden(raiz.iz);
            System.out.println(raiz.valor);
            inorden(raiz.der);
        }
    }
    

}
