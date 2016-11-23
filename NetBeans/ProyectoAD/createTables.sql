create database proyectoAd;

use proyectoAd;

create table pieza(
	codigo varchar(6),
	nombre varchar(20) not null,
	precio float not null,
	descripcion text,
	constraint pk_codigo_piezas primary key(codigo)
);

insert into pieza values('pie001','cancamo', 120.50, 'cancamo: pieza muy util y necesaria');
insert into pieza values('pie002','trocola', 220.50, 'trocola: pieza que se rompe siempre');
insert into pieza values('pie003','junta', 20.50, 'junta: pieza barata');
insert into pieza values('pie004','rueda', 76.60, 'rueda: pieza redonda');




create table proveedor(
	codigo varchar(6),
	nombre varchar(20) not null,
	apellidos varchar(30) not null,
	direccion varchar(40) not null,
	constraint pk_codigo_proveedores primary key(codigo)
);

insert into proveedor values('pro001','egido', 'jimenez', 'paseo de la senda');
insert into proveedor values('pro002','trust', 'dominguez', 'cadrian aldecoa');
insert into proveedor values('pro003','cascais', 'garcia', 'cuesta de san francisco');
insert into proveedor values('pro004','lego', 'usategui', 'puticlub liberty');


create table proyecto(
	codigo varchar(6),
	nombre varchar(40) not null,
	ciudad varchar(40),
	constraint pk_codigo_proyectos primary key(codigo)
);

insert into proyecto values('y00001','manhatan', 'nuevayork');
insert into proyecto values('y00002','lusitania', 'chicago');
insert into proyecto values('y00003','hobetuz', 'vitoria-gasteiz');
insert into proyecto values('y00004','green', 'amsterdam');





create table gestion(
	cod_proveedor varchar(6),
	cod_pieza varchar(6),
	cod_proyecto varchar(6),
	cantidad float,
	constraint pk_prod_piez_proyec_gest primary key(cod_proveedor, cod_pieza, cod_proyecto),
	constraint fk_cod_proveedor foreign key(cod_proveedor) references proveedor(codigo),
	constraint fk_cod_pieza foreign key(cod_pieza) references pieza(codigo),
	constraint fk_cod_proyecto foreign key (cod_proyecto) references proyecto(codigo)
);


insert into gestion values('pro001','pie001','y00001', 100);
insert into gestion values('pro002','pie002','y00002', 150);
insert into gestion values('pro003','pie003','y00003', 120);
insert into gestion values('pro004','pie004','y00004', 110);

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

CREATE PROCEDURE insertar_proveedor(cod_proveedor varchar(6), nombre_proveedor VARCHAR(20), apellido_proveedor VARCHAR(30), direccion_proveedor varchar(40))
COMMENT 'Procedimiento que inserta un cliente a la base de datos'
BEGIN
INSERT INTO proveedor(codigo, nombre, apellidos, direccion)
VALUES ( cod_proveedor, nombre_proveedor , apellido_proveedor, direccion_proveedor);
END;

CREATE PROCEDURE modificar_proveedor(cod_proveedor varchar(6), nombre_proveedor VARCHAR(20), apellido_proveedor VARCHAR(30), direccion_proveedor varchar(40))
COMMENT 'Procedimiento que modifica a un proveedor de la base de datos'
BEGIN
update proveedor
		set nombre = nombre_proveedor,
		 apellidos = apellido_proveedor,
		 direccion = direccion_proveedor
	where codigo = cod_proveedor;

END;

CREATE PROCEDURE eliminar_proveedor(cod_proveedor varchar(6))
COMMENT 'Procedimiento que elimina a un proveedor de la base de datos'
BEGIN
DELETE FROM proveedor where codigo = cod_proveedor;
END;

CREATE PROCEDURE insertar_proyecto(cod_proyecto varchar(6), nombre_proyecto VARCHAR(40),   ciudad_proyecto varchar(40))
COMMENT 'Procedimiento que inserta un proyecto a la base de datos'
BEGIN
INSERT INTO proyecto(codigo, nombre, ciudad)
VALUES ( cod_proyecto, nombre_proyecto , ciudad_proyecto);
END;

CREATE PROCEDURE modificar_proyecto(cod_proyecto varchar(6), nombre_proyecto VARCHAR(40), ciudad_proyecto varchar(40))
COMMENT 'Procedimiento que modifica un proyecto de la base de datos'
BEGIN
update proyecto
		set nombre = nombre_proyecto,
		    ciudad = ciudad_proyecto
		    
	where codigo = cod_proyecto;
END;

CREATE PROCEDURE eliminar_proyecto(cod_proyecto varchar(6))
COMMENT 'Procedimiento que elimina a un proyecto de la base de datos'
BEGIN
DELETE FROM proyecto where codigo = cod_proyecto;
END;

commit;
