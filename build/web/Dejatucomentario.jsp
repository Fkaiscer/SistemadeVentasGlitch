


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
            <section class="row">
                <div  class="col-md-6 col-md-offset-3">
            <form class="formulario"      onsubmit="return valida2();"  action="reportecontroller.do" method="post" >
                             <input type="hidden" name="txtProceso" value="login">
                        <h2>Reportar Problemas</h2>
                        <div class="info">
                            <label for="TXTDNI">DNI*</label>
                            <input type="text" id="txtdni"  name="TXTDNI"placeholder="">               
                            
                            <label for="txtnombre">Nombre*</label>
                            <input type="text" id="txtnombre"  name="txtnombre" placeholder="">
                            <label for="txtcelular">Numero de Celular*</label>
                            <input type="text" id="txtcelular"  name="txtcelular" placeholder="">
                             <label for="txtcorreo">Correo*</label>
                             <input type="email" id="txtcorreo"  name="txtcorreo" placeholder="">
                             <label for="txtcaso">Caso*</label>
                            <input type="text" id="txtcaso"  name="txtcaso" placeholder="">
                            <label for="txtdescripcion">Descripcion detallada*</label>
                            <textarea name="txtdescripcion" rows="10" cols="50"></textarea>
                             
                            <button type="submit" class=" btn btn-primary">Enviar Problema</button>

                   
                        </div>
   
                        

                    </form>  
                    </div>
                </section>
              
            </section>
            <%@include  file="WEB-INF/jspf/ccfooter.jspf"%>
        </div>

        <%@include  file="WEB-INF/jspf/cscript.jspf"%>
    </body>


</html>
