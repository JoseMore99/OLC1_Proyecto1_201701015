
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analizadores;

import java_cup.runtime.*;
import java.util.LinkedList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\027\000\002\002\004\000\002\002\010\000\002\003" +
    "\004\000\002\003\003\000\002\005\004\000\002\005\006" +
    "\000\002\007\011\000\002\007\007\000\002\012\005\000" +
    "\002\012\003\000\002\006\003\000\002\006\003\000\002" +
    "\006\003\000\002\013\005\000\002\013\005\000\002\013" +
    "\004\000\002\013\004\000\002\013\004\000\002\013\005" +
    "\000\002\013\003\000\002\004\004\000\002\004\003\000" +
    "\002\014\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\004\004\005\001\002\000\004\002\066\001" +
    "\002\000\006\006\011\022\006\001\002\000\004\007\043" +
    "\001\002\000\010\006\011\010\030\022\006\001\002\000" +
    "\004\020\027\001\002\000\004\015\013\001\002\000\010" +
    "\006\ufffe\010\ufffe\022\ufffe\001\002\000\004\022\014\001" +
    "\002\000\004\007\015\001\002\000\010\024\022\025\016" +
    "\026\020\001\002\000\010\012\ufff7\013\ufff7\020\ufff7\001" +
    "\002\000\010\012\ufff8\013\025\020\ufff8\001\002\000\010" +
    "\012\ufff5\013\ufff5\020\ufff5\001\002\000\006\012\023\020" +
    "\ufffa\001\002\000\010\012\ufff6\013\ufff6\020\ufff6\001\002" +
    "\000\010\024\022\025\016\026\020\001\002\000\006\012" +
    "\ufff9\020\ufff9\001\002\000\010\024\022\025\016\026\020" +
    "\001\002\000\004\020\ufffb\001\002\000\010\006\ufffd\010" +
    "\ufffd\022\ufffd\001\002\000\004\010\032\001\002\000\010" +
    "\006\uffff\010\uffff\022\uffff\001\002\000\004\022\033\001" +
    "\002\000\004\015\040\001\002\000\006\005\036\022\033" +
    "\001\002\000\006\005\uffec\022\uffec\001\002\000\004\002" +
    "\000\001\002\000\006\005\uffed\022\uffed\001\002\000\004" +
    "\023\041\001\002\000\004\020\042\001\002\000\006\005" +
    "\uffeb\022\uffeb\001\002\000\020\004\046\011\051\014\052" +
    "\016\044\017\050\021\045\023\053\001\002\000\020\004" +
    "\046\011\051\014\052\016\044\017\050\021\045\023\053" +
    "\001\002\000\020\004\046\011\051\014\052\016\044\017" +
    "\050\021\045\023\053\001\002\000\004\022\062\001\002" +
    "\000\004\020\061\001\002\000\020\004\046\011\051\014" +
    "\052\016\044\017\050\021\045\023\053\001\002\000\020" +
    "\004\046\011\051\014\052\016\044\017\050\021\045\023" +
    "\053\001\002\000\020\004\046\011\051\014\052\016\044" +
    "\017\050\021\045\023\053\001\002\000\022\004\uffee\011" +
    "\uffee\014\uffee\016\uffee\017\uffee\020\uffee\021\uffee\023\uffee" +
    "\001\002\000\020\004\046\011\051\014\052\016\044\017" +
    "\050\021\045\023\053\001\002\000\022\004\ufff4\011\ufff4" +
    "\014\ufff4\016\ufff4\017\ufff4\020\ufff4\021\ufff4\023\ufff4\001" +
    "\002\000\020\004\046\011\051\014\052\016\044\017\050" +
    "\021\045\023\053\001\002\000\022\004\ufff3\011\ufff3\014" +
    "\ufff3\016\ufff3\017\ufff3\020\ufff3\021\ufff3\023\ufff3\001\002" +
    "\000\022\004\ufff1\011\ufff1\014\ufff1\016\ufff1\017\ufff1\020" +
    "\ufff1\021\ufff1\023\ufff1\001\002\000\010\006\ufffc\010\ufffc" +
    "\022\ufffc\001\002\000\004\005\063\001\002\000\022\004" +
    "\uffef\011\uffef\014\uffef\016\uffef\017\uffef\020\uffef\021\uffef" +
    "\023\uffef\001\002\000\022\004\ufff0\011\ufff0\014\ufff0\016" +
    "\ufff0\017\ufff0\020\ufff0\021\ufff0\023\ufff0\001\002\000\022" +
    "\004\ufff2\011\ufff2\014\ufff2\016\ufff2\017\ufff2\020\ufff2\021" +
    "\ufff2\023\ufff2\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\064\000\004\002\003\001\001\000\002\001\001\000" +
    "\010\003\006\005\011\007\007\001\001\000\002\001\001" +
    "\000\006\005\030\007\007\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\006\016\012\020\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\023\001\001\000\002\001" +
    "\001\000\004\006\025\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\004" +
    "\033\014\034\001\001\000\002\001\001\000\004\014\036" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\013\046\001\001\000\004\013\064\001\001\000" +
    "\004\013\063\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\013\057\001\001\000\004\013\055\001\001\000" +
    "\004\013\053\001\001\000\002\001\001\000\004\013\054" +
    "\001\001\000\002\001\001\000\004\013\056\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



     public String resultado = "";
        public static LinkedList<Object> instrucciones;
        public static LinkedList<Object> lexemas;
        public static LinkedList<MErrores> error = new LinkedList<>();
        public void syntax_error(Symbol s)
        {
           error.add(new MErrores("sintactico","Identificador "+s.value + " no reconocido",s.right,s.left));
        }

        public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
        {
         error.add(new MErrores("sintactico","Identificador "+s.value + " no reconocido",s.right,s.left));
        }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {

  
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INIT EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INIT ::= LLAVEIZ instrucciones SEPARADOR SEPARADOR lexemas LLAVEDER 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		LinkedList<Object> a = (LinkedList<Object>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		LinkedList<Object> b = (LinkedList<Object>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 instrucciones = a; lexemas = b; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("INIT",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // instrucciones ::= instrucciones instruc 
            {
              LinkedList<Object> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		LinkedList<Object> a = (LinkedList<Object>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = a; RESULT.add(b);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // instrucciones ::= instruc 
            {
              LinkedList<Object> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new LinkedList<>(); RESULT.add(a); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instruc ::= defconj PUNTOYCOMA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = a;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instruc",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instruc ::= ID FLECHA expregular PUNTOYCOMA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Interfaces.expresiones.Nodob b = (Interfaces.expresiones.Nodob)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT =new Interfaces.expresiones.ExpRegular(aleft,aright,b,a);Interfaces.expresiones.Nodob.contador_hojas=1;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instruc",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // defconj ::= CONJ DOSPUNTOS ID FLECHA unitario COLOCHO unitario 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = new Interfaces.expresiones.conj_rango(aleft,aright,a,b,c);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("defconj",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // defconj ::= CONJ DOSPUNTOS ID FLECHA lista 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		LinkedList<Interfaces.expresiones.primitivo> b = (LinkedList<Interfaces.expresiones.primitivo>)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = new Interfaces.expresiones.conj_lista(aleft,aright,b,a);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("defconj",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // lista ::= lista COMA unitario 
            {
              LinkedList<Interfaces.expresiones.primitivo> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		LinkedList<Interfaces.expresiones.primitivo> a = (LinkedList<Interfaces.expresiones.primitivo>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = a; RESULT.add((Interfaces.expresiones.primitivo)b);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // lista ::= unitario 
            {
              LinkedList<Interfaces.expresiones.primitivo> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new LinkedList<>(); RESULT.add((Interfaces.expresiones.primitivo)a); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // unitario ::= LETRA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = new Interfaces.expresiones.primitivo(aleft,aright,a);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("unitario",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // unitario ::= DIGITO 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = new Interfaces.expresiones.primitivo(aleft,aright,a);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("unitario",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // unitario ::= SIMBOLO 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = new Interfaces.expresiones.primitivo(aleft,aright,a);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("unitario",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expregular ::= CONCATENACION expregular expregular 
            {
              Interfaces.expresiones.Nodob RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Interfaces.expresiones.Nodob a = (Interfaces.expresiones.Nodob)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Interfaces.expresiones.Nodob b = (Interfaces.expresiones.Nodob)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = new Interfaces.expresiones.Nodob(a,b,".","simbolo");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expregular",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expregular ::= DISYUNCION expregular expregular 
            {
              Interfaces.expresiones.Nodob RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Interfaces.expresiones.Nodob a = (Interfaces.expresiones.Nodob)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Interfaces.expresiones.Nodob b = (Interfaces.expresiones.Nodob)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = new Interfaces.expresiones.Nodob(a,b,"|","simbolo");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expregular",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expregular ::= MAS expregular 
            {
              Interfaces.expresiones.Nodob RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Interfaces.expresiones.Nodob a = (Interfaces.expresiones.Nodob)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT =new Interfaces.expresiones.Nodob(a,null,"+","simbolo");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expregular",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expregular ::= POR expregular 
            {
              Interfaces.expresiones.Nodob RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Interfaces.expresiones.Nodob a = (Interfaces.expresiones.Nodob)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT =new Interfaces.expresiones.Nodob(a,null,"*","simbolo");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expregular",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expregular ::= INTERROGACION expregular 
            {
              Interfaces.expresiones.Nodob RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Interfaces.expresiones.Nodob a = (Interfaces.expresiones.Nodob)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT =new Interfaces.expresiones.Nodob(a,null,"?","simbolo");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expregular",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expregular ::= LLAVEIZ ID LLAVEDER 
            {
              Interfaces.expresiones.Nodob RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT =new Interfaces.expresiones.Nodob(null,null,"{"+a+"}","conjunto");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expregular",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expregular ::= CADENA 
            {
              Interfaces.expresiones.Nodob RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT =new Interfaces.expresiones.Nodob(null,null,a,"cadena");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expregular",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // lexemas ::= lexemas lexema 
            {
              LinkedList<Object> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		LinkedList<Object> a = (LinkedList<Object>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = a; RESULT.add(b);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lexemas",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // lexemas ::= lexema 
            {
              LinkedList<Object> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new LinkedList<>(); RESULT.add(a); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lexemas",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // lexema ::= ID DOSPUNTOS CADENA PUNTOYCOMA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = new Interfaces.expresiones.lexemas(aleft,aright,a,b);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lexema",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
