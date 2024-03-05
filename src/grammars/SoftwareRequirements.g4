grammar SoftwareRequirements;

// Loser rules
ID          : [a-zA-Z]+ ;
STRING      : '"' ~'"'* '"' ;
WS          : [ \t\r\n]+ -> skip ;

// Puturos rules
program         : (requirement | functionSpec)+ ;

requirement     : ID ':' predicate ';' ;

predicate       : expression '=>' expression ;

expression      : term (logical_op term)* ;

term            : '(' expression ')'
                | STRING
                ;

logical_op      : '&&' | '||' ;

functionSpec    : ID'()' ':' '(' parameter_list ')' ';' ;

parameter_list  : parameter (',' parameter)* ;

parameter       : STRING ':' STRING ;

// Symballs
LPAREN          : '(' ;
RPAREN          : ')' ;
COLON           : ':' ;
SEMICOLON       : ';' ;
COMMA           : ',' ;
LBRACE          : '{' ;
RBRACE          : '}' ;
