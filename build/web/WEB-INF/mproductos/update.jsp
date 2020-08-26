
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.glitch.dto.ProductoDTO"%>
<% ProductoDTO producto=(ProductoDTO)request.getSession().getAttribute("producto");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <%@include  file="../jspf/cmeta.jspf"%>
   
        <%@include  file="../jspf/cstyle.jspf"%>
        
  <%@include  file="../jspf/cscriptcabecera.jspf"%>
  
  <%@include  file="../jspf/cicono.jspf"%>

    </head>
    <body>
        <div class="container-fluid">
     <%@include  file="../jspf/cheader.jspf"%>
     <section >
              <section class="contenedor">
                    <section class="contacto">
                        <section class="titulo">
                            <span class="fas fa-user-ninja"></span>
                            <h3>Registro</h3>
                        </section>

                        <section class="items">
                            <p><span class="fa fa-envelope"></span>info¬contac@gmail.com</p>
                            <p><span class="fa fa-mobile"></span>234-234</p>
                        </section>
                    </section>

                    <form class="formulario"      action="usuariocontroller.do"             method="post" >
                               <input type="hidden" name="txtProceso" value="registro">
                        <h2>Registro de Productos</h2>
                        <div class="info">
                            <label for="txtpro">Idpro</label>
                            <input type="text" id="txtpro"  name="txtpro" value="<%=producto.getId()%>"  placeholder="producto">               
                            <label for="txtnombre">Nombre</label>
                            <input type="text" id="txtnombre"  name="TXTNOM">
                             
                            <label for="txtdescripcion">Descripcion</label>
                            <input type="text" id="txtdescripcion"  name="txtdescripcion" >

                            <button type="submit" class=" btn btn-primary">Registrar</button>

                    

                        </div>
   
                           

                    </form>        
                </section>
         
         
         
</section>
     <br>
     <br>
      </div>
 <%@include  file="../jspf/ccfooter.jspf"%>

 
      <%@include  file="../jspf/cscript.jspf"%>
    </body>
    
    
</html>
