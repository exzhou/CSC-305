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
   : FILE_SOURCE_TYPE NEWLINE sourceName format sourceLocation
   ;
urlSourceType
   : URL_SOURCE_TYPE NEWLINE sourceName format sourceAddress
   ;
sourceName
   :  NAME LINE NEWLINE
   ;
format
   : FORMAT format_option NEWLINE
   ;
format_option
   : NEWSAPI_FORMAT                     # NewsApiFormat
   | SIMPLE_FORMAT                      # SimpleFormat
   ;
sourceLocation
   :  LOCATION LINE NEWLINE
   ;
sourceAddress
   :  ADDRESS LINE NEWLINE
   ;
