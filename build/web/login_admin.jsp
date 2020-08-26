<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include  file="WEB-INF/jspf/cmeta.jspf"%>

        <%@include  file="WEB-INF/jspf/cstyle.jspf"%>

        <%@include  file="WEB-INF/jspf/cscriptcabecera.jspf"%>

        <%@include  file="WEB-INF/jspf/cicono.jspf"%>
        <script src="RESOURCES/js/validarformularios.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="container-fluid">
            <%@include  file="WEB-INF/jspf/cheader.jspf"%>
             
            <section>
                <section class="contenedor">
                    <section class="contacto">
                        <section class="titulo">
                            <span class="fas fa-user-ninja"></span>
                            <h3>Inicie Sesion</h3>
                        </section>

                        <section class="items">
                            <p><span class="fa fa-envelope"></span>glitch@gmail.com</p>
                            <p><span class="fa fa-mobile"></span>234-234</p>
                        </section>
                    </section>

                    <form class="formulario"      onsubmit="return validaNombre();"  action="usuariocontroller.do" method="post" >
                             <input type="hidden" name="txtProceso" value="login">
                        <h2>Inicie Sesion</h2>
                        <div class="info">
                            <label for="TXTDNI">CODIGO*</label>
                            <input type="text" id="txtdni"  name="TXTDNI"placeholder="DNI">               
                            
                            <label for="txtcontraseña">Contraseña*</label>
                            <input type="password" id="txtcontraseña"  name="TXTCON" placeholder="Contraseña">

                            <button type="submit" class=" btn btn-primary">Inicie Sesión</button>

                    

                        </div>
   
                       
                    </form>        
                </section>
            </section>
            <%@include  file="WEB-INF/jspf/ccfooter.jspf"%>
        </div>

        <%@include  file="WEB-INF/jspf/cscript.jspf"%>
    </body>


</html>