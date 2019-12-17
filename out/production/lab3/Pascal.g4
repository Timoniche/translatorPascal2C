grammar Pascal;
//______________________________________________________________________________________________________________________

options {
    language = Java;
}

@header {
    import java.util.Map;
    import java.util.HashMap;
    import java.util.*;
}

@members {

//    Map<String, String> typesMap = Map.ofEntries(
//        entry("writeln", "cout"),
//        entry("read", "cin")
//    );

    Map<String, String> typesMap = new HashMap<String, String>() {{
        put("integer", "int");
    }};

    static Map<String, String> varType = new HashMap<>();
    static ArrayList<String> vars = new ArrayList<>();
    static ArrayList<String> params = new ArrayList<>();
    static int indent = 0;
    static String curFunctionName = "";

    public static String fixedLengthString(String string, int length) {
        if (length == 0) return "";
        return String.format("%1$" + length + "s", string);
    }

    public static String getTypesFormat(boolean lnNeeded, boolean refsNeeded) {
        String ret = "\"";
        int listSize = params.size();
        for (int i = 0; i < listSize; i++) {
            String type = varType.get(params.get(i));
            //deduction of expressions
            if (type == null) { ret += "%d"; }
            else if (type.equals("integer")) {
                ret += "%d";
            }
        }
        if (lnNeeded) {ret += "\\n"; }
        if (listSize > 0) ret += "\"";
        for (int i = 0; i < listSize; i++) {
            if (refsNeeded) {ret += ", &"; } else {ret += ", ";}
            ret += params.get(i);
        }
        return ret;
    }
}
//______________________________________________________________________________________________________________________
program
    : { System.out.println("#include <stdio.h>"); }block
    ;
block
    : (variableDeclarationPart
    | procedureOrFunction SEMI)*
    main = compoundStatement DOT {
        String indentBraces = fixedLengthString("", indent - 4);
        System.out.println(indentBraces + "int main()");
        System.out.println(indentBraces + "{");
        System.out.print($main.ret);
        System.out.println(indentBraces + "    return 0;");
        System.out.println(indentBraces + "}");
        indent -= 4;
    }
    ;
//Procedure & function block
//______________________________________________________________________________________________________________________
procedureOrFunction
   : procedure
   | function
   ;

procedure
   : {String list = "";} PROCEDURE identifier (formalParameterList {list = $formalParameterList.ret; })? SEMI compoundStatement {
        String indentBraces = fixedLengthString("", indent - 4);
        System.out.println(indentBraces + "void " +
            $identifier.text + " (" + list + ")");
        System.out.println(indentBraces + "{");
        System.out.print($compoundStatement.ret);
        System.out.println(indentBraces + "}");
        indent -= 4;
   }
   ;

function
   : {String list = "";} FUNCTION identifier { curFunctionName = $identifier.text; }(formalParameterList {list = $formalParameterList.ret; })? COLON type SEMI compoundStatement {
        String indentBraces = fixedLengthString("", indent - 4);
        //if (!list.equals("")) list += ", ";
        System.out.println(indentBraces + typesMap.get($type.text) + ' ' +
                    $identifier.text + " (" + list + ")");
        System.out.println(indentBraces + "{");
        System.out.print($compoundStatement.ret);
        System.out.println(indentBraces + "}");
        indent -= 4;
   }
   ;

formalParameterList returns[String ret = ""]
   : LPAREN argsDeclaration {
       $ret += $argsDeclaration.ret;
       //$ret += '(' + $argsDeclaration.ret;
   } (SEMI argsDeclaration {
       $ret += $argsDeclaration.ret;
   })* RPAREN
   //{ $ret += ')'; }
   ;

argsDeclaration returns[String ret = ""]
      : identifierList COLON type {
        if (vars.size() > 0) {
            varType.put(vars.get(0), $type.text);
            $ret += typesMap.get($type.text) + ' ' + vars.get(0);
        }
        for (int i = 1; i < vars.size(); i++) {
            varType.put(vars.get(i), $type.text);
            $ret += ", " + typesMap.get($type.text) + ' ' + vars.get(i);
        }
        vars.clear();
      }
      ;
//______________________________________________________________________________________________________________________

compoundStatement returns [String ret = ""]
   : BEGIN statements END {
       $ret += $statements.trCode;
   }
   ;
//Vars block
//______________________________________________________________________________________________________________________
variableDeclarationPart
   : VAR variableDeclaration {
       System.out.println($variableDeclaration.ret);
   } (SEMI variableDeclaration {
       System.out.println($variableDeclaration.ret);
   })* SEMI
   ;

variableDeclaration returns[String ret = ""]
      : identifierList COLON type {
        if (vars.size() > 0) {
            varType.put(vars.get(0), $type.text);
            $ret += typesMap.get($type.text) + ' ' + vars.get(0);
        }
        for (int i = 1; i < vars.size(); i++) {
            varType.put(vars.get(i), $type.text);
            $ret += ", " + vars.get(i);
        }
        if (vars.size() > 0) {
            $ret += ';';
        }
        vars.clear();
      }
      ;

identifierList
   : identifier {
     vars.add($identifier.text);
   }
   (COMMA identifier { vars.add($identifier.text); })*
   ;

type
   : identifier
   | (CHAR | BOOLEAN | INTEGER | REAL | STRING)
   ;

identifier
   : IDENT
   ;

//Statement block
//______________________________________________________________________________________________________________________
statements returns[String trCode]
   : { indent += 4; } statement { $trCode = $statement.trCode; } (SEMI statement {
   $trCode += "\n";
   $trCode += $statement.trCode;
   })*
   ;
statement returns[String trCode = ""]
   : simpleStatement { $trCode = $simpleStatement.trCode; }
   | structuredStatement { $trCode = $structuredStatement.ret; }
   ;
//______________________________________________________________________________________________________________________
simpleStatement returns[String trCode = ""]
   : assignmentStatement { $trCode = $assignmentStatement.trCode; }
   | procedureStatement { $trCode = $procedureStatement.trCode; }
   | emptyStatement
   ;
assignmentStatement returns[String trCode = ""]
   : variable ASSIGN (expression {
    if ($variable.text.equals(curFunctionName)) {
        $trCode = fixedLengthString("", indent) + "return " + $expression.text + ';';
    } else {
        $trCode = fixedLengthString("", indent) + $variable.text + " = "
        + $expression.text + ';';
    }
    }
   | procedureStatement { $trCode = fixedLengthString("", indent) + $variable.text + " = "
    + $procedureStatement.trCode.substring(4); })
   ;
procedureStatement returns[String trCode = ""]
   : identifier (LPAREN parameterList RPAREN)? {
     $trCode += fixedLengthString("", indent);
     String funName = $identifier.text;
     int listSize = params.size();
     switch(funName) {
         //read(a, b) -> scanf("%d%d", &a, &b);
         case "read":
            $trCode += "scanf(";
            $trCode += getTypesFormat(false, true);
            $trCode += ");";
            break;
         //writeln(a + b) -> printf("%d\n", a + b);
         case "writeln":
            $trCode += "printf(";
            $trCode += getTypesFormat(true, false);
            $trCode += ");";
            break;
         default:
            $trCode += funName + '(' + $parameterList.text + ");";
            break;
     }
     params.clear();
   }
   ;
parameterList
   : expression { params.add($expression.text); } (COMMA expression { params.add($expression.text); })*
   ;
emptyStatement
   :
   ;
//______________________________________________________________________________________________________________________
structuredStatement returns[String ret = ""]
   : compoundStatement
   | ifStatement { $ret = $ifStatement.ret; }
   | forStatement { $ret = $forStatement.ret; }
   ;
ifStatement returns[String ret = ""]
//todo: (: ELSE statement)? why so
   : { indent += 4; } IF expression THEN fst = statement {
   $ret += fixedLengthString("", indent - 4) + "if" + " (" + $expression.text + ") {\n" +
   $fst.trCode + '\n' + fixedLengthString("", indent - 4) + "}";
   }
   (ELSE snd = statement {
   $ret += " else {\n" + $snd.trCode + '\n' + fixedLengthString("", indent - 4) + "}";
   })?
   { indent -= 4; }
   ;

forStatement returns[String ret = ""]
   : FOR identifier {
       indent += 4;
       $ret += fixedLengthString("", indent - 4) + "for (" + typesMap.get(varType.get($identifier.text)) +
       ' ' + $identifier.text;
   } ASSIGN forList {
       $ret += " = " + $forList.ret + " > " + $identifier.text + "; " +
       $identifier.text + "++)\n";
   } DO statement {
       $ret += fixedLengthString("", indent - 4) + "{\n" + $statement.trCode + "\n" +
       fixedLengthString("", indent - 4) + "}";
       indent -= 4;
   }
   ;
forList returns[String ret = ""]
   : initialValue TO finalValue {
       $ret += $initialValue.text + "; " + $finalValue.text;
   }
   ;
initialValue
   : expression
   ;
finalValue
   : expression
   ;
//______________________________________________________________________________________________________________________
expression
   : simpleExpression (relationaloperator expression)?
   ;

relationaloperator
   : EQUAL
   | NOT_EQUAL
   | LT
   | LE
   | GE
   | GT
   | IN
   ;
simpleExpression
   : term (additiveoperator simpleExpression)?
   ;
additiveoperator
   : PLUS
   | MINUS
   | OR
   ;

term
   : signedFactor (multiplicativeoperator term)?
   ;

multiplicativeoperator
       : STAR
       | SLASH
       | DIV
       | MOD
       | AND
       ;

signedFactor
   : (PLUS | MINUS)? factor
   ;
factor
   : variable
   | LPAREN expression RPAREN
   | NOT factor
   | bool
   ;
variable
   : (AT identifier | identifier | NUM_INT) (LBRACK expression (COMMA expression)* RBRACK | LBRACK2 expression (COMMA expression)* RBRACK2 | DOT identifier | POINTER)*
   ;
bool
   : TRUE
   | FALSE
   ;

//______________________________________________________________________________________________________________________

fragment A
   : ('a' | 'A')
   ;


fragment B
   : ('b' | 'B')
   ;


fragment C
   : ('c' | 'C')
   ;


fragment D
   : ('d' | 'D')
   ;


fragment E
   : ('e' | 'E')
   ;


fragment F
   : ('f' | 'F')
   ;


fragment G
   : ('g' | 'G')
   ;


fragment H
   : ('h' | 'H')
   ;


fragment I
   : ('i' | 'I')
   ;


fragment J
   : ('j' | 'J')
   ;


fragment K
   : ('k' | 'K')
   ;


fragment L
   : ('l' | 'L')
   ;


fragment M
   : ('m' | 'M')
   ;


fragment N
   : ('n' | 'N')
   ;


fragment O
   : ('o' | 'O')
   ;


fragment P
   : ('p' | 'P')
   ;


fragment Q
   : ('q' | 'Q')
   ;


fragment R
   : ('r' | 'R')
   ;


fragment S
   : ('s' | 'S')
   ;


fragment T
   : ('t' | 'T')
   ;


fragment U
   : ('u' | 'U')
   ;


fragment V
   : ('v' | 'V')
   ;


fragment W
   : ('w' | 'W')
   ;


fragment X
   : ('x' | 'X')
   ;


fragment Y
   : ('y' | 'Y')
   ;


fragment Z
   : ('z' | 'Z')
   ;


AND
   : A N D
   ;


ARRAY
   : A R R A Y
   ;


BEGIN
   : B E G I N
   ;


BOOLEAN
   : B O O L E A N
   ;


CASE
   : C A S E
   ;


CHAR
   : C H A R
   ;


CHR
   : C H R
   ;


CONST
   : C O N S T
   ;


DIV
   : D I V
   ;


DO
   : D O
   ;


DOWNTO
   : D O W N T O
   ;


ELSE
   : E L S E
   ;


END
   : E N D
   ;


FILE
   : F I L E
   ;


FOR
   : F O R
   ;


FUNCTION
   : F U N C T I O N
   ;


GOTO
   : G O T O
   ;


IF
   : I F
   ;


IN
   : I N
   ;


INTEGER
   : I N T E G E R
   ;


LABEL
   : L A B E L
   ;


MOD
   : M O D
   ;


NIL
   : N I L
   ;


NOT
   : N O T
   ;


OF
   : O F
   ;


OR
   : O R
   ;


PACKED
   : P A C K E D
   ;


PROCEDURE
   : P R O C E D U R E
   ;


PROGRAM
   : P R O G R A M
   ;


REAL
   : R E A L
   ;


RECORD
   : R E C O R D
   ;


REPEAT
   : R E P E A T
   ;


SET
   : S E T
   ;


THEN
   : T H E N
   ;


TO
   : T O
   ;


TYPE
   : T Y P E
   ;


UNTIL
   : U N T I L
   ;


VAR
   : V A R
   ;


WHILE
   : W H I L E
   ;


WITH
   : W I T H
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


STAR
   : '*'
   ;


SLASH
   : '/'
   ;


ASSIGN
   : ':='
   ;


COMMA
   : ','
   ;


SEMI
   : ';'
   ;


COLON
   : ':'
   ;


EQUAL
   : '='
   ;


NOT_EQUAL
   : '<>'
   ;


LT
   : '<'
   ;


LE
   : '<='
   ;


GE
   : '>='
   ;


GT
   : '>'
   ;


LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;


LBRACK
   : '['
   ;


LBRACK2
   : '(.'
   ;


RBRACK
   : ']'
   ;


RBRACK2
   : '.)'
   ;


POINTER
   : '^'
   ;


AT
   : '@'
   ;


DOT
   : '.'
   ;


DOTDOT
   : '..'
   ;


LCURLY
   : '{'
   ;


RCURLY
   : '}'
   ;


UNIT
   : U N I T
   ;


INTERFACE
   : I N T E R F A C E
   ;


USES
   : U S E S
   ;


STRING
   : S T R I N G
   ;


IMPLEMENTATION
   : I M P L E M E N T A T I O N
   ;


TRUE
   : T R U E
   ;


FALSE
   : F A L S E
   ;


WS
   : [ \t\r\n] -> skip
   ;


COMMENT_1
   : '(*' .*? '*)' -> skip
   ;


COMMENT_2
   : '{' .*? '}' -> skip
   ;


IDENT
   : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
   ;


STRING_LITERAL
   : '\'' ('\'\'' | ~ ('\''))* '\''
   ;


NUM_INT
   : ('0' .. '9') +
   ;


NUM_REAL
   : ('0' .. '9') + (('.' ('0' .. '9') + (EXPONENT)?)? | EXPONENT)
   ;


fragment EXPONENT
   : ('e') ('+' | '-')? ('0' .. '9') +
   ;
//______________________________________________________________________________________________________________________