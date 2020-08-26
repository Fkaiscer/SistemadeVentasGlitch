go
CREATE DATABASE glitch;
go 
--------------
/*Tabla de Clientes*/
-------------
CREATE TABLE clientes  
   (id int identity(1,1) not null primary key,  
  dni varchar(9) NOT NULL,  
   nombre varchar(255) NOT NULL,  
    	email varchar(255) NOT NULL,
		contraseña varchar(20) NOT NULL) 
/*---------------
Tabla productos
.................*/
CREATE TABLE produtos  
   (idpro bigint identity(1,1) primary key,  
  nombres varchar(255) NOT NULL,  
   foto image ,  
    descripcion varchar(255) NOT NULL,
	precio float not null,
	sotch int not null)
/*----------------------
tabla de reportes
.....................*/
CREATE TABLE reportes  
   (id int identity(1,1) not null primary key,  
  dni int NOT NULL,  
   nombre varchar(255) NOT NULL,  
    	celular int NOT NULL,
		email varchar(255) NOT NULL,
		caso varchar(255) NOT NULL,
		detalle varchar(255) NOT NULL) 
