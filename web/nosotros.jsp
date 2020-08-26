<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <%@include  file="WEB-INF/jspf/cmeta.jspf"%>
   
        <%@include  file="WEB-INF/jspf/cstyle.jspf"%>
        
  <%@include  file="WEB-INF/jspf/cscriptcabecera.jspf"%>
  
  <%@include  file="WEB-INF/jspf/cicono.jspf"%>
  <link href="RESOURCES/CSS/estilonosotros.css" rel="stylesheet" type="text/css"/>
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
     <section>
 
     <section class="contenedo sobre-nosotros">
            <h2 class="titulo">Nosotros</h2>
            <div class="contenedo-sobre-nosotros">
               
                <img src="RESOURCES/imagenes/descarga.png" alt="" class="imagen-about-us">
                <div class="contenido-textos">
                    <h3><span>1</span>Vision</h3>
                    <p>Glitch tiene como visión seguir ampliando el catálogo de productos y obtener aún más alcance, posicionamiento y presencia en el público objetivo.</p>
                    <h3><span>2</span>Mision</h3>
                    <p>La misión de Glitch es lograr ser la marca de bisutería y joyería más reconocida a nivel nacional.</p>
                </div>
            </div>
        </section>
        <section class="portafolio">
            <div class="contenedo">
                <h2 class="titulo">Trabaja con Nosotros</h2>
                <div class="galeria-port">
                    <div class="imagen-port">
                        <img src="RESOURCES/imagenes/usuario1.png" alt="">
                        <div class="hover-galeria">
                            <img src="img/icono1.png" alt="">
                            <p>NUESTRO TRABAJO</p>
                        </div>
                    </div>
                    <div class="imagen-port">
                        <img src="RESOURCES/imagenes/usuario2.jpg" alt="">
                        <div class="hover-galeria">
                            <img src="img/icono1.png" alt="">
                            <p>REPRESENTANOS</p>
                        </div>
                    </div>
                    <div class="imagen-port">
                        <img src="RESOURCES/imagenes/usuario3.jpg" alt="">
                        <div class="hover-galeria">
                            <img src="img/icono1.png" alt="">
                            <p>REGISTRATE</p>
                        </div>
                    </div>
                    <div class="imagen-port">
                        <img src="RESOURCES/imagenes/usuario4.jpg" alt="">
                        <div class="hover-galeria">
                            <img src="img/icono1.png" alt="">
                            <p>CONTACTANOS</p>
                        </div>
                    </div>
                  
                </div>
            </div>
        </section>
        <section class="clientes contenedo">
            <h2 class="titulo">Que dicen nuestros clientes</h2>
            <div class="cards">
                <div class="card">
                    <img src="RESOURCES/imagenes/usuario6.png" alt=""/>
                 
                    <div class="contenido-texto-card">
                        <h4>Jake Enrique Yataco Boga</h4>
                        <p>Muy buena atención y muy buenos precios </p>
                    </div>
                </div>
                <div class="card">
                    <img src="RESOURCES/imagenes/usuario6.png" alt=""/>
                    <div class="contenido-texto-card">
                        <h4>Jeancarlo Alarcon</h4>
                        <p>Buen servicio, puntual y muy buena calidad❤️</p>
                    </div>
                </div>
            </div>
        </section>
        <section class="about-services">
            <div class="contenedo">
                <h2 class="titulo">Nuestros servicios</h2>
                <div class="servicio-cont">
                    <div class="servicio-ind">
                        <img src="img/ilustracion1.svg" alt="">
                        <h3>Brindamos Atenciòn al cliente</h3>
                        <p>Todo esto lo realiza con independencia absoluta, aplicando técnicas y herramientas de marketing .</p>
                    </div>
                    <div class="servicio-ind">
                        <img src="img/ilustracion4.svg" alt="">
                        <h3>Vendemos Joyas</h3>
                        <p>Glitch se centra principalmente en la venta de bisutería y joyería importada siendo los anillos, collares, pulseras y relojes sus productos principales</p>
                    </div>
                    <div class="servicio-ind">
                        <img src="img/ilustracion3.svg" alt="">
                        <h3>Promociones de marcas</h3>
                        <p> •	Marketing y ventas: Promoción de ventas.</p>
                              <p> Desarrollo publicitario de marca y productos.</p>
                    </div>
                </div>
            </div>
                           
    
        </section>
            
            

         
   </section>      



 </div>
 
      <%@include  file="WEB-INF/jspf/cscript.jspf"%>
    </body>
    
    
</html>
