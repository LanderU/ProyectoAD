CREATE PROCEDURE insertar_pieza(cod_pieza varchar(6), nombre_pieza VARCHAR(20), precio_pieza float, descripcion_pieza varchar(40))
COMMENT 'Procedimiento que inserta une pieza a la base de datos'
BEGIN
INSERT INTO pieza(codigo, nombre, precio, descripcion)
VALUES ( cod_pieza, nombre_pieza , precio_pieza, descripcion_pieza);
END;

CREATE PROCEDURE modificar_pieza(cod_pieza varchar(6), nombre_pieza VARCHAR(20), precio_pieza float, descripcion_pieza varchar(40))
COMMENT 'Procedimiento que modifica una pieza de la base de datos'
BEGIN
update pieza
		set nombre = nombre_pieza,
		    precio = precio_pieza,
		    descripcion = descripcion_pieza
	where codigo = cod_pieza;
END;

CREATE PROCEDURE eliminar_pieza(cod_pieza varchar(6))
COMMENT 'Procedimiento que elimina a una pieza de la base de datos'
BEGIN
DELETE FROM pieza where codigo = cod_pieza;
END;
