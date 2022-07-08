parser grammar AggregatorConfigParser;

options { tokenVocab=AggregatorConfigLexer; }

/*
   Parser Rules
*/

sources
   :  (sourceType | NEWLINE)* EOF
   ;
sourceType
   :  fileSourceType
   |  urlSourceType
   ;
fileSourceType
   : FILE_SOURCE_TYPE NEWLINE sourceName sourceLocation
   ;
urlSourceType
   : URL_SOURCE_TYPE NEWLINE sourceName sourceAddress
   ;
sourceName
   :  NAME LINE NEWLINE
   ;
sourceLocation
   :  LOCATION LINE NEWLINE
   ;
sourceAddress
   :  ADDRESS LINE NEWLINE
   ;
