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
                + "CONJ:pecas-> a,b,c,3,2,1;\n"
                + "CONJ:sibom ->%~=;\n"
                + "exprex1 -> .{letra}*|\"_\" | {letra}{digito};\n"
                + "}";
        

        Ventana V = new Ventana();
        V.setVisible(true);
    }

}
