/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expanalyzer;
import analizadores.Parser;
import analizadores.Lex;
import static analizadores.Parser.instrucciones;
import java.io.BufferedReader;
import java.io.StringReader;
/**
 *
 * @author Moreira Paz
 */
public class ExpAnalyzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Interfaces.tabla_s t = new Interfaces.tabla_s();// almacena conjuntos y estructuras 
        String texto = "{"
                + "CONJ:digito-> 0~9;\n"
                + "CONJ:letra -> a~c;\n"
                + "}";
        Lex scanner = new Lex(new BufferedReader(new StringReader(texto)));
        Parser parser = new Parser(scanner);
        parser.parse();
        
        
        instrucciones.forEach((instruccion) -> {
            if(instruccion.getClass()==Interfaces.expresiones.primitivo.class){
                Interfaces.expresiones.primitivo o =(Interfaces.expresiones.primitivo)instruccion;
                System.out.println(o.ejecutar(t)); 
            }
            if(instruccion.getClass()==Interfaces.expresiones.conj_rango.class){
                Interfaces.expresiones.conj_rango o =(Interfaces.expresiones.conj_rango)instruccion;
                o.ejecutar(t);
            }
            
        });
        try{
        }catch(Exception e){
            
        }
        System.out.println("Finalizando analisis...");
        
        //Ventana V = new Ventana();
        //V.setVisible(true);
    }
    
}
