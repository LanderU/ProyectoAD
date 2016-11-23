--Insertar un nuevo proveedor_____________________________________________________________________________

DELIMITER //
CREATE PROCEDURE insertar_proveedor(cod_proveedor varchar(6), nombre_proveedor VARCHAR(20), apellido_proveedor VARCHAR(30), direccion_proveedor varchar(40))
COMMENT 'Procedimiento que inserta un cliente a la base de datos'
BEGIN
INSERT INTO proveedor(codigo, nombre, apellidos, direccion)
VALUES ( cod_proveedor, nombre_proveedor , apellido_proveedor, direccion_proveedor);
END//
DELIMITER ;

--Para utilizarlo lo llamamos de la siguiente forma
--CALL insertar_proveedor(012030,'joseLuis', 'maruenda', 'loliloiloi');


--Modificar un proveedor__________________________________________________________________________________

DELIMITER //
CREATE PROCEDURE modificar_proveedor(cod_proveedor varchar(6), nombre_proveedor VARCHAR(20), apellido_proveedor VARCHAR(30), direccion_proveedor varchar(40))
COMMENT 'Procedimiento que modifica a un proveedor de la base de datos'
BEGIN
update proveedor
		set nombre = nombre_proveedor,
		 apellidos = apellido_proveedor,
		 direccion = direccion_proveedor
	where codigo = cod_proveedor;

END//
DELIMITER ;

--Para utilizarlo lo llamamos de la siguiente forma
--CALL modificar_proveedor(012030,'LuisMaria', 'maruenda', 'loliloiloi');


--eliminar un proveedor___________________________________________________________________________________

DELIMITER //
CREATE PROCEDURE eliminar_proveedor(cod_proveedor varchar(6))
COMMENT 'Procedimiento que elimina a un proveedor de la base de datos'
BEGIN
DELETE FROM proveedor where codigo = cod_proveedor;
END//
DELIMITER ;

--Para utilizarlo lo llamamos de la siguiente forma
--CALL eliminar_proveedor(012030);
