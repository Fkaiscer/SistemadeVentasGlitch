use glitch
go
CREATE TABLE reportes  
   (id int identity(1,1) not null primary key,  
  dni int NOT NULL,  
   nombre varchar(255) NOT NULL,  
    	celular int NOT NULL,
		email varchar(255) NOT NULL,
		caso varchar(255) NOT NULL,
		detalle varchar(255) NOT NULL) 