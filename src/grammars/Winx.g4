grammar Winx;

// Lexer rules
ID          : [a-zA-Z]+ ;
STRING      : '"' ~'"'* '"' ;
NEWLINE     : [\r\n]+ -> skip;
COMMENT     : ('~' ~[~]*? '~') | ('//' ~[\r\n]* NEWLINE) ;
WS          : [ \t\r\n]+ -> skip ;
INT         : [0-9]+ ;
FLOAT       : [0-9]+ '.' [0-9]* | '.' [0-9]+ ;

// Parser rules

winx                    :  (package | COMMENT)+;

body                    : (interface | specification| COMMENT)+ ;

// Hierarchies

package                 : 'package' ID '{' body '}' ;

interface               : importance? access_modifiers? 'interface' ID '{' spec_body '}' ;

specification           : 'specification' ID ('implements' ID)? '{' spec_body '}' ;

spec_body               : (requirement_spec | function_spec)+ ;



// Non-functional Requirements

requirement_spec        : comment? importance? ID '{' req_specification* result_specification* '}' ;

req_specification       : comment? importance? '@' ID (logical_op ID)* ';' ;

result_specification    : comment? 'result' importance? ID ';' ;

logical_op              : 'AND' | 'OR' ;

// Functional Requirements

function_spec            : comment? importance? access_modifiers? ID'(' input_types? ')' ('implements' ID)? function_body;

function_body            : '{' specification_entry* return_types '}';

input_types              : variable (',' variable)* ;

return_types             : 'return' variable (',' variable)* ';' ;

specification_entry      : comment? '@' ID ':'STRING';';

// General Rules

variable                : type '[]'? ID;

importance              : 'critical' | 'optional' ;

type                    : 'INT'
                        | 'FLOAT'
                        | 'DOUBLE'
                        | 'STRING'
                        | 'BOOLEAN'
                        | 'CHAR'
                        | 'VOID'
                        | STRING;

access_modifiers        : 'public'
                        | 'protected'
                        | 'private'
                        | 'default';

comment                 : COMMENT;


// Symbols
LPAREN                  : '(' ;
RPAREN                  : ')' ;
COLON                   : ':' ;
SEMICOLON               : ';' ;
COMMA                   : ',' ;
LBRACE                  : '{' ;
RBRACE                  : '}' ;
TILDE                   : '~' ;
EXCLAM                  : '!' ;
