
package analizadores;
import java_cup.runtime.*;
%%

%public 
%class Lex 
%cup
%char
%column
%full
%ignorecase
%line
%unicode


%init{ 
    yyline = 1;
    yycolumn =1;
%init} 



digito = [0-9]+
letra = [a-zA-Z]
simbolo= [\!-\}]
cadena = [\"][^\"\n]+[\"]
id   = [a-zA-Z]+([a-zA-Z]|[0-9]|"_")*

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
comentario   = "//" {InputCharacter}* {LineTerminator}?

%%



"{" {  return new Symbol(sym.LLAVEIZ, yycolumn, yyline, yytext());} 
"}" { return new Symbol(sym.LLAVEDER, yycolumn, yyline, yytext());} 
"CONJ" { return new Symbol(sym.CONJ, yycolumn, yyline, yytext());} 
"->" { return new Symbol(sym.FLECHA, yycolumn, yyline, yytext());} 
"%%"  { return new Symbol(sym.SEPARADOR, yycolumn, yyline, yytext());} 
"|" { return new Symbol(sym.DISYUNCION,yycolumn, yyline, yytext());} 
"," { return new Symbol(sym.COMA,yycolumn, yyline, yytext());} 
"~" { return new Symbol(sym.COLOCHO,yycolumn, yyline, yytext());} 
"." { return new Symbol(sym.CONCATENACION, yytext());} 
":"  { return new Symbol(sym.DOSPUNTOS,yycolumn, yyline, yytext());} 
"+" { return new Symbol(sym.MAS,yycolumn, yyline, yytext());} 
"*" { return new Symbol(sym.POR, yycolumn, yyline,yytext());} 
";" { return new Symbol(sym.PUNTOYCOMA,yycolumn, yyline, yytext());} 
"?" { return new Symbol(sym.INTERROGACION, yycolumn, yyline,yytext());}

{letra} {return new Symbol(sym.LETRA,yycolumn, yyline, yytext());}
{id} {return new Symbol(sym.ID,yycolumn, yyline, yytext());}
{simbolo} {return new Symbol(sym.SIMBOLO,yycolumn, yyline, yytext());} 
{cadena} {return new Symbol(sym.CADENA,yycolumn, yyline, yytext());}
{digito} {return new Symbol(sym.DIGITO,yycolumn, yyline, yytext());} 

{comentario}      {System.out.println("Comentario: "+yytext()); }
[ \t\r\n\f]             {/* Ignorar espacios en blanco*/}
.                       { System.out.println("Error Lexico: "+yytext()+" Linea "+yyline+" Columna "+yycolumn);}