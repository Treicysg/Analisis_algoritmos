CREATE TABLE Promocion
( promocion_id NUMBER(4),
  promocion_nombre VARCHAR2(30)
    CONSTRAINT promocion_promocionombre_nn NOT NULL,
  premio VARCHAR(45)

  );