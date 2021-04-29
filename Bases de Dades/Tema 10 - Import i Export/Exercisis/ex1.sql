create database empresa;
use empresa;

create table clientes (
    id_cliente int not null primary key auto_increment,
    nombre varchar(15),
    apellido varchar(15),
    edad int(3),
    telefono int(10)
);

create table productos (
    id_producto int not null primary key auto_increment,
    nombre varchar(15),
    descripcion varchar(100),
    precio int(5)
);

create table pedidos (
    id_pedido int not null primary key auto_increment,
    id_producto int not null ,
    id_cliente int not null ,
    fecha date,
    cantidad int(10),
    foreign key (id_producto) references productos(id_producto),
    foreign key (id_cliente) references clientes(id_cliente)
);
