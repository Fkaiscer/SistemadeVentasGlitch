

<%
    //Casteamos
    String mensajeError = (String) request.getSession().getAttribute("error2");

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
          <br>
        <br>
        <div class="container-fluid">
            <%@include  file="WEB-INF/jspf/cheader.jspf"%>
          
            <section >
                   <div class="row">
                    <div  class="col-md-6 col-md-offset-3">
                        <div class="card">
                            <div class="card-header">
                                Error
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">A ocurrido el siguiente error :</h5>
                                <p class="card-text">
                                <div class="alert alert-danger" role="alert">
                                <%=mensajeError%>
                                </div>
                                </p>
                                <a href="Dejatucomentario.jsp" class="btn btn-primary">Registra nuevamente tu problema</a>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        
        </div>
 
        <%@include  file="WEB-INF/jspf/cscript.jspf"%>
    </body>


</html>
