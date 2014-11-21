--------------------------------------------------------
-- Archivo creado  - jueves-noviembre-20-2014   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Procedure LLENARARTICULO
--------------------------------------------------------
set define off;

  CREATE OR REPLACE PROCEDURE "GE"."LLENARARTICULO" (pnombreArticulo VARCHAR2,ppuntaje NUMBER ,pcantidad NUMBER,pprecio NUMBER)
is


begin
    insert into ARTICULO(articulo_id,articulo_nombre,puntaje,cantidad,articulo_precio,TIPOARTICULO_ID)
    values(s_producto.nextval,pnombreArticulo,ppuntaje,pcantidad,pprecio,1);

end;

/
