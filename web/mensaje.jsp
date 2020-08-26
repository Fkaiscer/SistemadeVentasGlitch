
<%
    //Casteamos
    String mensaje = (String) request.getSession().getAttribute("exito");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include  file="WEB-INF/jspf/cmeta.jspf"%>

        <%@include  file="WEB-INF/jspf/cstyle.jspf"%>

        <%@include  file="WEB-INF/jspf/cscriptcabecera.jspf"%>

        <%@include  file="WEB-INF/jspf/cicono.jspf"%>

    </head>
    <body>
        <div class="container-fluid">
            <%@include  file="WEB-INF/jspf/cheader.jspf"%>
          
            <section >
                   <div class="row">
                    <div  class="col-md-6 col-md-offset-3">
                        <div class="card">
                            <div class="card-header">
                                Ingreso
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">Registrado:</h5>
                                <p class="card-text">
                                <div class="alert alert-primary" role="alert">
                                <%=mensaje%>
                                </div>
                                </p>
                                <a href="login.jsp" class="btn btn-primary">Inicie Sesión</a>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        
        </div>
 
        <%@include  file="WEB-INF/jspf/cscript.jspf"%>
    </body>


</html>
