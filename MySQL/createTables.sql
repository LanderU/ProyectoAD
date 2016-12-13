create database proyectoAd;

use proyectoAd;

create table pieza(
	codigo varchar(6),
	nombre varchar(20) not null,
	precio float not null,
	descripcion text,
	constraint pk_codigo_piezas primary key(codigo),
	ON DELETE CASCADE
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
	constraint pk_codigo_proveedores primary key(codigo),
	ON DELETE CASCADE
);

insert into proveedor values('pro001','egido', 'jimenez', 'paseo de la senda');
insert into proveedor values('pro002','trust', 'dominguez', 'cadrian aldecoa');
insert into proveedor values('pro003','cascais', 'garcia', 'cuesta de san francisco');
insert into proveedor values('pro004','lego', 'usategui', 'puticlub liberty');


create table proyecto(
	codigo varchar(6),
	nombre varchar(40) not null,
	ciudad varchar(40),
	constraint pk_codigo_proyectos primary key(codigo),
	ON DELETE CASCADE
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


