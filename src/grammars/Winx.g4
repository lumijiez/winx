grammar Winx;

// Lexer rules
ID          : [a-zA-Z]+ ;
INT         : [0-9]+ ;
FLOAT       : [0-9]+ '.' [0-9]* | '.' [0-9]+ ;
STRING      : '"' ('\\' ["\\] | ~["\\])* '"';
WS          : [ \t\r\n]+ -> skip ;

// Flexible handling of comments
COMMENT     : ('~' .*? '~') -> channel(HIDDEN);
LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN);

// Parser rules
winx        : package+ ;

package     : 'package' ID '{' body '}' ;

body        : (interface | specification)* ;

interface   : importance? 'interface' ID '{' spec_body '}' ;

specification: 'specification' ID impls? '{' spec_body '}' ;

impls : ('implements' ID) ;

spec_body   : (requirement_spec | function_spec)* ;

requirement_spec: importance? ID '{' req_specification* result_specification* '}' ;

req_specification: importance? '@' ID (logical_op ID)* ';' ;

result_specification: 'result' importance? ID ';' ;

function_spec: importance? access_modifiers? ID '(' input_types? ')' impls? function_body ;

function_body: '{' specification_entry* return_type '}';

input_types  : variable (',' variable)* ;

return_type : 'return' variable ';' ;

specification_entry: '@' ID ':' STRING ';' ;

variable    : type '[]'? ID;

importance  : 'critical' | 'optional' ;

type        : 'INT'
            | 'FLOAT'
            | 'DOUBLE'
            | 'STRING'
            | 'BOOLEAN'
            | 'CHAR'
            | 'VOID'
            | STRING;

access_modifiers: 'public'
                | 'protected'
                | 'private'
                | 'default';

// Logical operators if needed for parsing complexity within annotations
logical_op  : 'AND' | 'OR';

// Symbols
LPAREN      : '(';
RPAREN      : ')';
COLON       : ':';
SEMICOLON   : ';';
COMMA       : ',';
LBRACE      : '{';
RBRACE      : '}';
TILDE       : '~';
EXCLAM      : '!';
