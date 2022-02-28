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
import java.util.Iterator;

/**
 *
 * @author Moreira Paz
 */
public class ExpRegular extends Interfaces.instruccion {
    Nodob expresion;
    String id,acumulado;
    int hojas,contadorh=0;
    Tab_siguientes TablaSig [];
    
    public ExpRegular(int columna, int fila, Nodob expresion, String id) {
        super(columna, fila);
        this.expresion =  new Nodob(expresion, new Nodob(null, null, "#", "final"), ".", "simbolo");
        this.id = id;
        this.hojas = Integer.valueOf(this.expresion.ultimos);
        this.TablaSig = new Tab_siguientes[hojas];
    }

    @Override
    public Object ejecutar(tabla_s t) {
        System.out.println(this.id);
        grafArbol();
        grafTablaSig();
        return this;
    }
    
    public void inorden (Nodob raiz){
        if(raiz!=null){
            
            if (!"simbolo".equals(raiz.tipo)){
                acumulado = acumulado + "nodo"+raiz.id+"[label=\""+raiz.primeros+"|{"+raiz.anulable+"|"+raiz.valor.replaceAll("\"","")+"|"+raiz.ultimos+"}|"+raiz.ultimos+"\"];\n";
                TablaSig[contadorh]=new Tab_siguientes(raiz.valor, contadorh+1);
                contadorh++;
            }else{
               acumulado = acumulado + "nodo"+raiz.id+"[label=\""+raiz.primeros+"|{"+raiz.anulable+"|\\"+raiz.valor.replaceAll("\"","")+"}|"+raiz.ultimos+"\"];\n";
            }
            if (raiz.iz!=null){
                acumulado=acumulado+"nodo"+raiz.id+"->nodo"+raiz.iz.id+"\n";
            }
            if (raiz.der!=null){
                acumulado=acumulado+"nodo"+raiz.id+"->nodo"+raiz.der.id+"\n";
            }
            inorden(raiz.iz);
            //System.out.println(raiz.valor);
            inorden(raiz.der);
        }
    }
    
    public void grafArbol(){
        acumulado ="";
        FileWriter ficha = null;
        PrintWriter escritor = null;
        try
        {
            ficha = new FileWriter("src/ARBOLES_201701015/arbol"+id+".dot");
            escritor = new PrintWriter(ficha);
            escritor.println("digraph G{\nnode [shape=record];\n");
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
    }
    
    public void inordensig(Nodob raiz){//recorremos el arbol para la tabla de siguientes
        if(raiz!=null){
            if (".".equals(raiz.valor)){
                
                String last [];
                String first [];
                last = raiz.iz.ultimos.split(",");
                first = raiz.der.primeros.split(",");
                for (int i = 0; last.length > i; i++) {
                    for (int j = 0; first.length > j; j++) {
                         if (!TablaSig[Integer.valueOf(last[i])-1].siguientes.contains(first[j])){
                             TablaSig[Integer.valueOf(last[i])-1].siguientes.add(first[j]);
                             /*for (Object siguiente : TablaSig[Integer.valueOf(last[i])-1].siguientes) {
                                 System.out.print(siguiente);
                             }
                             System.out.println("");*/
                         }
                   }
                }
            }
            if ("*".equals(raiz.valor)){
                String last [];
                String first [];
                last = raiz.iz.ultimos.split(",");
                first = raiz.iz.primeros.split(",");
                for (int i = 0; last.length > i; i++) {
                    for (int j = 0; first.length > j; j++) {
                        TablaSig[Integer.valueOf(last[i])-1].siguientes.add(first[j]);
                   }
                }
            }
            if ("+".equals(raiz.valor)){
                String last [];
                String first [];
                last = raiz.iz.ultimos.split(",");
                first = raiz.iz.primeros.split(",");
                for (int i = 0; last.length > i; i++) {
                    for (int j = 0; first.length > j; j++) {
                        TablaSig[Integer.valueOf(last[i])-1].siguientes.add(first[j]);
                   }
                }
            }
            inordensig(raiz.iz);
            inordensig(raiz.der);
        }
    }
    
    public void grafTablaSig(){
        inordensig(expresion);
        FileWriter ficha = null;
        PrintWriter escritor = null;
        
        try
        {
            ficha = new FileWriter("src/SIGUIENTES_201701015/sig"+id+".dot");
            escritor = new PrintWriter(ficha);
            escritor.println("digraph G{\nnode [shape=record];");
            escritor.println("table [ label = <\n<table>");
             escritor.println("<tr><td>Terminal</td><td>id</td><td>siguientes</td></tr>");
            for (Tab_siguientes tab : TablaSig) {
                escritor.println("<tr>");
                String a = tab.valor.replace("{", "\\{ ").replace("}", " \\}");
                escritor.print("<td>"+a+"</td><td>"+tab.numero+"</td>");
                escritor.print("<td>");
                for (Object o : tab.siguientes) {
                      escritor.print("-"+o+"-");
                }
                  escritor.println("</td>");
                escritor.println("</tr>");
            }
            escritor.println("</table>> ]");
            escritor.println("}");
        } catch (Exception e) {
            System.out.println("Algo fallo :c");
        } finally {
           try {
           // aprovechamos el finally para asegurarnos que se cierra el fichero.
              ficha.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        try {
            String cmd = "dot -Tpng src/SIGUIENTES_201701015/sig"+id+".dot -o src/SIGUIENTES_201701015/sig"+id+".png";
            Runtime.getRuntime().exec(cmd); 
        } catch (IOException ioe){
            System.out.println (ioe);
        }
    }
    
    public void grafTablaTrans(){
        
    }

}
