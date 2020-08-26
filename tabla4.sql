go
use glitch
go
CREATE TABLE productos  
   (idpro int identity(1,1) not null primary key,  
   
   nombres varchar(255) NOT NULL,  
    	foto varchar(255) NULL,
		descripcion varchar(255) NOT NULL,
		precio dec(5,2) NOT NULL,
		sotch int NOT NULL) 