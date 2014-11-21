CREATE TABLE Articulo
( articulo_id NUMBER(4),
  articulo_nombre VARCHAR2(50)
    CONSTRAINT articulo_articuloname_nn NOT NULL,
  puntaje NUMBER(4),
  cantidad NUMBER(6),
  articulo_precio number(6),
  tipoArticulo_id NUMBER(4)
  );
  

