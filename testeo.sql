use glitch
go
CREATE TABLE clientes  
   (id int identity(1,1) not null primary key,  
  dni varchar(9) NOT NULL,  
   nombre varchar(255) NOT NULL,  
    	email varchar(255) NOT NULL,
		contraseña varchar(20) NOT NULL) 