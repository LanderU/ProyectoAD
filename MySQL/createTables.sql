create database proyectoAd;

create table pieza(
	codigo varchar(6),
	nombre varchar(20) not null,
	precio float not null,
	descripcion text, 
	constraint pk_codigo_piezas primary key(codigo)
);


create table proveedor(
	codigo varchar(6),
	nombre varchar(20) not null,
	apellidos varchar(30) not null,
	direccion varchar(40) not null,
	constraint pk_codigo_proveedores primary key(codigo)
);


create table proyecto(
	codigo varchar(6),
	nombre varchar(40) not null,
	ciudad varchar(40),
	constraint pk_codigo_proyectos primary key(codigo)
);


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


