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
    String valor,tipo,primeros,ultimos;
    int id;
    static int contadores=1;
    static public int contador_hojas=1;
    boolean anulable;

    public Nodob(Nodob iz, Nodob der, String valor,String tipo) {
        this.iz = iz;
        this.der = der;
        this.valor = valor;
        this.tipo=tipo;
        this.id = contadores;
        contadores++;
        if(!"simbolo".equals(tipo)){
            primeros =""+ contador_hojas;
            ultimos = ""+contador_hojas;
            contador_hojas++;
            anulable=false;//si no es un simbolo entonces es un terminal por lo que es un no anulable
        }else{
            anulable=anulabilidad();
            primerosYultimos();
            
        }
    }
    
    public boolean anulabilidad(){
         if("*".equals(valor)){
             return true;
         }
         if("+".equals(valor)){
             return iz.anulable;
         }
         if("?".equals(valor)){
             return true;
         }
         if("|".equals(valor)){
             System.out.println("");
             return iz.anulable||der.anulable;
         }
         if(".".equals(valor)){
             return der.anulable&&iz.anulable;
         }
         
        return true;
     }
    
    public void primerosYultimos(){
        if("*".equals(valor)){
             primeros=iz.primeros;
             ultimos =iz.ultimos;
         }
         if("+".equals(valor)){
             primeros=iz.primeros;
             ultimos =iz.ultimos;
         }
         if("?".equals(valor)){
             primeros=iz.primeros;
             ultimos =iz.ultimos;
         }
         if("|".equals(valor)){
             primeros=iz.primeros+","+der.primeros;
             ultimos =iz.ultimos+","+der.ultimos;
         }
         if(".".equals(valor)){
             if(iz.anulable){
                 primeros=iz.primeros+","+der.primeros;
             }else{
                 primeros=iz.primeros;
             }
             if(der.anulable){
                 ultimos=iz.ultimos+","+der.ultimos;
             }else{
                 ultimos=der.ultimos;
             }
         }
         
    }
}
