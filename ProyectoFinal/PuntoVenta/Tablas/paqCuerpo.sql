--------------------------------------------------------
-- Archivo creado  - jueves-noviembre-20-2014   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Package Body PAQUETECONSULTAS
--------------------------------------------------------

  CREATE OR REPLACE PACKAGE BODY "GE"."PAQUETECONSULTAS" 

is

procedure consultaArticuloXID( pID_articulo NUMBER, cursor_out OUT cursorTypeARTICULO)
is
BEGIN
  OPEN cursor_out FOR
  select articulo_id,articulo_nombre,puntaje,cantidad,articulo_precio
      FROM ARTICULO
      where articulo_id = pID_articulo
      order by articulo_nombre;
END;

procedure consultaArticuloXnombre( pnombre_articulo NUMBER, cursor_out OUT cursorTypeARTICULO)
is

BEGIN
  OPEN cursor_out FOR
  select articulo_id,articulo_nombre,puntaje,cantidad,articulo_precio
      FROM ARTICULO
      where articulo_nombre = pnombre_articulo
      order by articulo_nombre;
END;


END PAQUETECONSULTAS;

/
