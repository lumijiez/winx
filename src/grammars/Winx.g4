grammar Winx;

// Lexer rules
ID          : [a-zA-Z]+ ;
STRING      : '"' ~'"'* '"' ;
DESCRIPTION : '~' ~[~]*? '~' ;
WS          : [ \t\r\n]+ -> skip ;
INT         : [0-9]+ ;
FLOAT       : [0-9]+ '.' [0-9]* | '.' [0-9]+ ;

// Parser rules

winx                    :  (package | DESCRIPTION)+;

body                    : (
                        interface
                        | specification
                        | DESCRIPTION
                        )+ ;

// Hierarchies

package                 : 'package' ID '{' body '}' ;

interface               : importance?
                        access_modifiers?
                        'interface'
                        ID '{' interface_body '}' ;

specification           : 'specification'
                        ID ('implements' ID)*
                        '{' specification_body '}' ;

interface_body          : (requirementSpec | functionSpec)+ ;

specification_body      : (requirementSpec | functionSpec)+ ;


// Non-functional Requirements

requirementSpec         : description?
                        importance?
                        ID '{'
                        req_specification*
                        result_specification*
                        '}' ;

req_specification       : importance? '@' ID (logical_op ID)* ';' ;

result_specification    : 'result' importance? ID ';' ;

logical_op              : 'AND' | 'OR' ;

// Functional Requirements

functionSpec            : description?
                        importance?
                        access_modifiers?
                        ID'(' input_types? ')'
                        ('implements' ID)*
                        functionBody
                        ;

functionBody            : '{'
                        specificationEntry*
                        return_types
                        '}'
                        ;

input_types             : variable (',' variable)* ;

return_types            : 'return' variable (',' variable)* ';' ;

specificationEntry      : '@' ID ':'
                        STRING
                        ';'
                        ;

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
                        ;

access_modifiers        : 'public'
                        | 'protected'
                        | 'private'
                        | 'default'
                        ;

description             : DESCRIPTION;

// Symballs
LPAREN                  : '(' ;
RPAREN                  : ')' ;
COLON                   : ':' ;
SEMICOLON               : ';' ;
COMMA                   : ',' ;
LBRACE                  : '{' ;
RBRACE                  : '}' ;
TILDE                   : '~' ;
EXCLAM                  : '!' ;
