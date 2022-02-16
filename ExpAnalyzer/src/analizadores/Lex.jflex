/*Imports y package*/
package analizadores;
import java_cup.runtime.Symbol; 
%%

/*Define how will works our scanner*/
%class Lex 
%public 
%line /*Conteo de lineas*/
%char /*conteo de caracteres reconocidos*/
%cup /*Will works with cup*/
%unicode /*Set of characters is unicode*/
%ignorecase /*Will be ignore case; Example: Compi1 equals cOmpI1*/


%init{ 
   yyline = 1; 
   yychar = 1; 
%init} 


/*Section or regular expressions*/

digito = [0-9]+
letra = [a-zA-Z]
cadena = [\"][^\"\n]+[\"]
id   = {letra}({letra}|{digito}|"_")*
// simbolo = !|\"|
%%

/*
	Sym.* will be the name of the token
	yytext() is the actual value
*/

"{" {return new Symbol(sym.LLAVEIZ, yycolumn, yyline, yytext());} 
"}" {return new Symbol(sym.LLAVEDER, yycolumn, yyline, yytext());} 
"CONJ" {return new Symbol(sym.CONJ, yycolumn, yyline, yytext());} 
"->" {return new Symbol(sym.FLECHA, yycolumn, yyline, yytext());} 
"%%" {return new Symbol(sym.SEPARADOR, yycolumn, yyline, yytext());} 
"|" {return new Symbol(sym.DISYUNCION,yycolumn, yyline, yytext());} 
"," {return new Symbol(sym.COMA,yycolumn, yyline, yytext());} 
"~" {return new Symbol(sym.COLOCHO,yycolumn, yyline, yytext());} 
"." {return new Symbol(sym.CONCATENACION, yytext());} 
":" {return new Symbol(sym.DOSPUNTOS,yycolumn, yyline, yytext());} 
"+" {return new Symbol(sym.MAS,yycolumn, yyline, yytext());} 
"*" {return new Symbol(sym.POR, yycolumn, yyline,yytext());} 
";" {return new Symbol(sym.PUNTOYCOMA,yycolumn, yyline, yytext());} 
"?" {return new Symbol(sym.INTERROGACION, yycolumn, yyline,yytext());} 


\n {yychar=1;}

{id} {return new Symbol(sym.ID,yycolumn, yyline, yytext());} 
{cadena} {return new Symbol(sym.CADENA,yycolumn, yyline, yytext());} 
{digito} {return new Symbol(sym.DIGITO,yycolumn, yyline, yytext());} 
{letra}{return new Symbol(sym.LETRA,yycolumn, yyline, yytext());} 

[ \t\r\n\f]             {\*Ignore white spaces*\}
. {
    System.out.println("Error Lexico: "+yytext()+" Linea "+yyline+" Columna "+yycolumn);
}
