use glitch
go
CREATE TABLE administrador
   (id int identity(1,1) not null primary key,  
  codigo varchar(9) NOT NULL,  
  nombre varchar(255) NOT NULL,  
		contraseña varchar(20) NOT NULL,
		recuperacion varchar(255) NOT NULL,)