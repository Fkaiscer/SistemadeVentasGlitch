


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
                            <span class="fas fa-cog"></span>
                            <h3>Solo Personal Autorizado</h3>
                        </section>

                        <section class="items">
                            <p><span class="fa fa-envelope"></span>glitch@gmail.com</p>
                            <p><span class="fa fa-mobile"></span>234-234</p>
                        </section>
                    </section>

                    <form class="formulario"  onsubmit="return val();"      action="usuariocontroller.do" method="post" >
                             <input type="hidden" name="txtProceso" value="admin">
                        <h2>Bienvenido</h2>
                        <div class="info">
                            <label for="txtcodigo">Codigo*</label>
                            <input type="text" id="txtco"  name="txtcodigo" placeholder="Codigo">               
                            
                          
                            
                          
   <label for="txtpass">Contraseña*</label>
   <input type="password" id="txtcontra"  name="txtpass" placeholder="password"> 
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
