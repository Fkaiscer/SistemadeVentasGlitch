


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
        <style>
            .alinea{
                margin-bottom: 25px;
                margin-top: 150px;
            }
        </style>
        <div class="container-fluid">
            <%@include  file="WEB-INF/jspf/cheader.jspf"%>
            <section class="alinea">

                <div class="center-block" style>
                    <div class="col-md-2 col-md-offset-3">               
                        <div class="card">
                            <div class="card-header"><i class="fa fa-briefcase"></i>&nbsp;
                           Productos
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">Mantenimiento de Productos</h5>
                                <p class="card-text">Mantenimiento</p>
                                <a href="<%=request.getContextPath()%>/usuariocontroller.do?txtProceso=mlista" class="btn btn-primary">Entrar al inventario</a>
                            </div>
                        </div>

                    </div>
                    <div class="col-lg-3">               
                        <div class="card">
                            <div class="card-header"><i class="fa fa-user"></i>&nbsp;
                            Usuarios
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">Usuarios Registrados</h5>
                                <p class="card-text">Mantenimiento de ususarios</p>
                                <a href="<%=request.getContextPath()%>/usuariocontroller.do?txtProceso=mlistacliente" class="btn btn-primary">Entrar al registro</a>
                            </div>
                        </div>

                    </div>

                    <div class="col-lg-3">               
                        <div class="card">
                            <div class="card-header"><i class="fa fa-truck"></i>&nbsp;
                           Envios
                            </div>
                            <div class="card-body">
                                <h5 class="card-title">Orden de Envio</h5>
                                <p class="card-text">Registro de envios</p>
                                <a href="#" class="btn btn-primary">Entrar al envio</a>
                            </div>
                        </div>

                    </div>


                </div>


            </section>
        
        </div>
                            <br>
                            <br>
                            <br>
                            <br><br>
                            <br><br>
                            <br><br>
                            <br>
                            <div class="col-lg-5">
                            <a href="index.jsp" class="btn btn-primary">Cerrar sesion</a><br>
                            </div>
                            <br><br>
                            <br>
                            
                            
    <%@include  file="WEB-INF/jspf/ccfooter.jspf"%>
        <%@include  file="WEB-INF/jspf/cscript.jspf"%>
    </body>


</html>
