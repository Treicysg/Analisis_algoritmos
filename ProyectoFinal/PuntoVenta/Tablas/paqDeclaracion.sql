--------------------------------------------------------
-- Archivo creado  - jueves-noviembre-20-2014   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Package PAQUETECONSULTAS
--------------------------------------------------------

  CREATE OR REPLACE PACKAGE "GE"."PAQUETECONSULTAS" 
AS

TYPE cursorTypeARTICULO IS REF CURSOR;
TYPE cursorType IS REF CURSOR;
procedure consultaArticuloXID( pID_articulo NUMBER, cursor_out OUT cursorTypeARTICULO);
procedure consultaArticuloXnombre( pnombre_articulo NUMBER, cursor_out OUT cursorTypeARTICULO);


END PAQUETECONSULTAS;

/
