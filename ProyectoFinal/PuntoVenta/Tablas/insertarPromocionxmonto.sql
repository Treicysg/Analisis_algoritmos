--------------------------------------------------------
-- Archivo creado  - martes-noviembre-18-2014   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Procedure INTRODUCIRPROMOCIONXMONTO
--------------------------------------------------------
set define off;

  CREATE OR REPLACE PROCEDURE "GE"."INTRODUCIRPROMOCIONXMONTO" (pnombre VARCHAR2,ppremio VARCHAR2,pmonto NUMBER )
is


begin
    
    
    insert into PROMOCION(promocion_id,promocion_nombre,premio)
    values(s_promocion.nextval,pnombre,ppremio);
   
    insert into PROMOCIONXMONTO(promocion_id,monto)
    values(s_promocion.currval,pmonto);

end;

/
