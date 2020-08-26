
<%
    //Casteamos
    String mensaje = (String) request.getSession().getAttribute("exitousuario");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <%@include  file="WEB-INF/jspf/cmeta.jspf"%>
   
        <%@include  file="WEB-INF/jspf/cstyle.jspf"%>
        
  <%@include  file="WEB-INF/jspf/cscriptcabecera.jspf"%>
  
  <%@include  file="WEB-INF/jspf/cicono.jspf"%>
  
<!-- GetButton.io widget -->
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
<!-- /GetButton.io widget -->
    </head>
    <body>
        <div class="container-fluid">
     <%@include  file="WEB-INF/jspf/cheader.jspf"%>
      <%@include  file="WEB-INF/jspf/ccarrousel.jspf"%>
     <section>
     <div class="alert alert-success" role="alert">
  <%=mensaje%>
</div> 

 <%@include  file="WEB-INF/jspf/ccontenido.jspf"%>
</section>
<%@include  file="WEB-INF/jspf/cnav.jspf"%>
 <%@include  file="WEB-INF/jspf/ccfooter.jspf"%>
 </div>
 
      <%@include  file="WEB-INF/jspf/cscript.jspf"%>
    </body>
    
</html>
