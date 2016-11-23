--Insertar un nuevo proyecto ___________________________________________________________________________

DELIMITER //
CREATE PROCEDURE insertar_proyecto(cod_proyecto varchar(6), nombre_proyecto VARCHAR(40),   ciudad_proyecto varchar(40))
COMMENT 'Procedimiento que inserta un proyecto a la base de datos'
BEGIN
INSERT INTO proyecto(codigo, nombre, ciudad)
VALUES ( cod_proyecto, nombre_proyecto , ciudad_proyecto);
END//
DELIMITER ;

--Para utilizarlo lo llamamos de la siguiente forma
CALL insertar_proyecto(123456,'Cañero',  'Esto es lo que se usa para beber');


--Modificar un proyecto ___________________________________________________________________________________

DELIMITER //
CREATE PROCEDURE modificar_proyecto(cod_proyecto varchar(6), nombre_proyecto VARCHAR(40), ciudad_proyecto varchar(40))
COMMENT 'Procedimiento que modifica un proyecto de la base de datos'
BEGIN
update proyecto
		set nombre = nombre_proyecto,
		    ciudad = ciudad_proyecto
		    
	where codigo = cod_proyecto;
END//
DELIMITER ;

--Para utilizarlo lo llamamos de la siguiente forma
CALL modificar_proyecto(123456,'es la caña', 'Esto es lo que se usa para beber');


--eliminar una proyecto ___________________________________________________________________________________

DELIMITER //
CREATE PROCEDURE eliminar_proyecto(cod_proyecto varchar(6))
COMMENT 'Procedimiento que elimina a un proyecto de la base de datos'
BEGIN
DELETE FROM proyecto where codigo = cod_proyecto;
END//
DELIMITER ;

--Para utilizarlo lo llamamos de la siguiente forma
CALL eliminar_proyecto(123456);
