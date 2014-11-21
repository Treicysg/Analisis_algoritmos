--------------------------------------------------------
-- Archivo creado  - jueves-noviembre-20-2014   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Procedure INTRODUCIRPROMOCIONXPUNTAJE
--------------------------------------------------------
set define off;

  CREATE OR REPLACE PROCEDURE "GE"."INTRODUCIRPROMOCIONXPUNTAJE" (pnombre VARCHAR2,ppremio VARCHAR2,ppuntaje NUMBER )
is

begin
    
    
    insert into PROMOCION(promocion_id,promocion_nombre,premio)
    values(s_promocion.nextval,pnombre,ppremio);
   
    insert into PROMOCIONXPUNTAJE(promocion_id,puntaje)
    values(s_promocion.currval,ppuntaje);

end;

/
