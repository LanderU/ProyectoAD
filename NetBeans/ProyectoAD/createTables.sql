create table pieza(
codigo varchar(6),
nombre varchar(20) not null,
precio float not null,
descripcion text,
constraint pk_codigo_piezas primary key(codigo)
);
