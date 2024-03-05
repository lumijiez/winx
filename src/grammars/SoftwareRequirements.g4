grammar SoftwareRequirements;

// Loser rules
ID          : [a-zA-Z]+ ;
STRING      : '"' ~'"'* '"' ;
DESCRIPTION : '~' ~[~]*? '~' ;
WS          : [ \t\r\n]+ -> skip ;
INT         : [0-9]+ ;
FLOAT       : [0-9]+ '.' [0-9]* | '.' [0-9]+ ;

// Puturos rules
program         : (requirementSpec | functionSpec)+ ;

requirementSpec : EXCLAM? ID
                  (':' description)?
                  predicate ';' ;

description     : DESCRIPTION;

predicate       : expression '=>' expression ;

expression      : term (logical_op term)* ;

term            : '{' expression '}'
                | STRING;

logical_op      : '&&' | '||' ;

functionSpec    : EXCLAM?
                ID'()' ':'
                description?
                access_modifier?
                return_types
                '{' parameter_list '}' ';'
                ;

access_modifier : 'Access ' access_modifiers ';';

return_types    : 'Return' '(' return (',' return)* ')' ';' ;

return          : type ID;

parameter_list  : parameter (',' parameter)* ;

parameter       : STRING ':'
                (STRING
                | INT
                | FLOAT)
                ;

type            : 'INT'
                | 'FLOAT'
                | 'DOUBLE'
                | 'STRING'
                | 'BOOLEAN'
                | 'CHAR'
                | 'VOID'
                ;

access_modifiers : 'PUBLIC'
                 | 'PROTECTED'
                 | 'PRIVATE'
                 | 'DEFAULT'
                 ;

// Symballs
LPAREN          : '(' ;
RPAREN          : ')' ;
COLON           : ':' ;
SEMICOLON       : ';' ;
COMMA           : ',' ;
LBRACE          : '{' ;
RBRACE          : '}' ;
TILDE           : '~' ;
EXCLAM          : '!' ;
