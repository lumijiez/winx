grammar SoftwareRequirements;

// Loser rules
ID          : [a-zA-Z]+ ;
STRING      : '"' ~'"'* '"' ;
DESCRIPTION : '~' ~[~]*? '~' ;
WS          : [ \t\r\n]+ -> skip ;
INT         : [0-9]+ ;
FLOAT       : [0-9]+ '.' [0-9]* | '.' [0-9]+ ;

// Puturos rules

program         : description?
                  'package' ID
                  '{'
                  program_body
                  '}'
                  ;

program_body    : (requirementSpec | functionSpec)+ ;

requirementSpec : description?
                  importance?
                   ID '{'
                  req_specification*
                  result_specification*
                  '}' ;

req_specification : importance? '@' ID (logical_op ID)* ';';

result_specification : 'result' importance? ID ';';

predicate       : expression '=>' expression ;

expression      : term (logical_op term)* ;

term            : '{' expression '}'
                | STRING;

logical_op      : '&&' | '||' ;



// Function Specification

functionSpec    : description?
                importance?
                access_modifiers?
                ID'(' input_types? ')'
                functionBody
                ;

functionBody    : '{'
                specification*
                return_types
                '}'
                ;

input_types     : variable (',' variable)*;

return_types    : 'return' variable (',' variable)* ';' ;

specification   : '@' ID ':'
                STRING
                ';'
                ;

// General Rules

variable        : type '[]'? ID;

importance      : 'critical' | 'optional' ;

type            : 'INT'
                | 'FLOAT'
                | 'DOUBLE'
                | 'STRING'
                | 'BOOLEAN'
                | 'CHAR'
                | 'VOID'
                ;

access_modifiers : 'public'
                 | 'protected'
                 | 'private'
                 | 'default'
                 ;

description     : DESCRIPTION;

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
