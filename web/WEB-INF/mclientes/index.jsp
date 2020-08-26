
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.glitch.dto.ClienteDTO"%>

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
         <div class="row">
                <div class="col-md-6 col-md-offset-3">
       
                    <div class="card text-center">
                         <h2>Lista de Clientes </h2>
                        <div class="card-header">
                         Clientes
                        </div>
                        <div class="card-body">
                            <h5 class="card-title">Lista de clientes del Sistema</h5>
                         <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Id</th>
                             <th>DNI </th>
                             <th>Nombres</th>
                         
                             <th>email </th>
                            <th colspan="3">Operaciones</th>
                        </tr>

                    </thead>

                    <tbody>
                        <c:forEach var="cliente" items="${sessionScope.aca}">
                    
                            <tr>
                                <td>${cliente.id}</td>
                                  <td>${cliente.dni}</td>
                                    <td>${cliente.nombre}</td>
                                     <td>${cliente.email}</td>
                             
                                   
                                
                                     <td><button type="button" class="btn btn-secondary">Detalle</button> </td>
                                     <td><a href="<%=request.getContextPath()%>/usuariocontroller.do?txtProceso=cli&txtcli=${cliente.id}"><button type="button" class="btn btn-success">Actualizar</button></a> </td>
                                     <td><button type="button" class="btn btn-danger">Eliminar</button></td>
                        </c:forEach>
                    </tbody>

                </table>
                        </div>
                        <div class="card-footer text-muted">
                  Aministrador
                  <a href="sistema.jsp" class="btn btn-primary">Regresar al sistema</a>
                        </div>
                    </div>
                </div>
</div>
</section>
     <br>
     <br>
      </div>
 <%@include  file="../jspf/ccfooter.jspf"%>

 
      <%@include  file="../jspf/cscript.jspf"%>
    </body>
    
    
</html>
