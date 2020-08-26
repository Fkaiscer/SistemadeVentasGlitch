


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include  file="WEB-INF/jspf/cmeta.jspf"%>

        <%@include  file="WEB-INF/jspf/cstyle.jspf"%>

        <%@include  file="WEB-INF/jspf/cscriptcabecera.jspf"%>

        <%@include  file="WEB-INF/jspf/cicono.jspf"%>
        <script src="RESOURCES/js/validarformularios.js" type="text/javascript"></script>
<script type="text/javascript">
    (function () {
        var options = {
            whatsapp: "+51 925956658", // WhatsApp number
            call_to_action: "Buen Día podemos ayudarte en algo", // Call to action
            position: "right", // Position may be 'right' or 'left'
        };
        var proto = document.location.protocol, host = "getbutton.io", url = proto + "//static." + host;
        var s = document.createElement('script'); s.type = 'text/javascript'; s.async = true; s.src = url + '/widget-send-button/js/init.js';
        s.onload = function () { WhWidgetSendButton.init(host, proto, options); };
        var x = document.getElementsByTagName('script')[0]; x.parentNode.insertBefore(s, x);
    })();
</script>
    </head>
    <body>
        <div class="container-fluid">
            <%@include  file="WEB-INF/jspf/cheader.jspf"%>
             
            <section>
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

                    <form class="formulario"    onsubmit="return valida2();"   action="usuariocontroller.do"             method="post" >
                               <input type="hidden" name="txtProceso" value="registro">
                        <h2>Registro de Clientes</h2>
                        <div class="info">
                            <label for="TXTDNI">DNI*</label>
                            <input type="text" id="txtdni"  name="TXTDNI"placeholder="DNI">               
                            <label for="txtnombre">Nombre*</label>
                            <input type="text" id="txtnombre"  name="TXTNOM"placeholder="Nombre">
                             <label for="correo">Correo</label>
                                        <input type="email" class="form-control" id="TXTCORREO" name="correo" placeholder="Ingresar correo">
                            <label for="txtcontraseña">Contraseña*</label>
                            <input type="password" id="txtcontraseña"  name="TXTCON" placeholder="Contraseña">

                            <button type="submit" class=" btn btn-primary">Registrarse</button>

                    

                        </div>
   
                           

                    </form>        
                </section>
            </section>
            <%@include  file="WEB-INF/jspf/ccfooter.jspf"%>
        </div>

        <%@include  file="WEB-INF/jspf/cscript.jspf"%>
    </body>


</html>
