package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nosotros_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(7);
    _jspx_dependants.add("/WEB-INF/jspf/cmeta.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/cstyle.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/cscriptcabecera.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/cicono.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/cheader.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/ccfooter.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/cscript.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       ");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("       <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
      out.write("\n");
      out.write("   \n");
      out.write("        ");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/RESOURCES/CSS/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans|Montez|Pathway+Gothic+One\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write(" <link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans|Montez|Pathway+Gothic+One\" rel=\"stylesheet\">\n");
      out.write(" \n");
      out.write(" <link href=\"");
      out.print(request.getContextPath());
      out.write("/RESOURCES/CSS/stylelog.css\" rel=\"stylesheet\" type=\"text/css\"/>");
      out.write("\n");
      out.write("        \n");
      out.write("  ");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("           <script src=\"");
      out.print(request.getContextPath());
      out.write("/RESOURCES/js/script.js\" type=\"text/javascript\"></script>\n");
      out.write("         ");
      out.write("\n");
      out.write("  \n");
      out.write("  ");
      out.write("  <link  rel=\"icon\" href=\"RESOURCES/imagenes/glitchlogo.ico\">");
      out.write("\n");
      out.write("  \n");
      out.write("<!-- GetButton.io widget -->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    (function () {\n");
      out.write("        var options = {\n");
      out.write("            whatsapp: \"+51 925956658\", // WhatsApp number\n");
      out.write("            call_to_action: \"Buen Día podemos ayudarte en algo\", // Call to action\n");
      out.write("            position: \"right\", // Position may be 'right' or 'left'\n");
      out.write("        };\n");
      out.write("        var proto = document.location.protocol, host = \"getbutton.io\", url = proto + \"//static.\" + host;\n");
      out.write("        var s = document.createElement('script'); s.type = 'text/javascript'; s.async = true; s.src = url + '/widget-send-button/js/init.js';\n");
      out.write("        s.onload = function () { WhWidgetSendButton.init(host, proto, options); };\n");
      out.write("        var x = document.getElementsByTagName('script')[0]; x.parentNode.insertBefore(s, x);\n");
      out.write("    })();\n");
      out.write("</script>\n");
      out.write("<!-- /GetButton.io widget -->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("     ");
      out.write("<header>\n");
      out.write("                <div class=\"alert alert-dark\" role=\"alert\">\n");
      out.write("                    Eres cliente conocido de la empresa <a  name =\"inicio\" href=\"login.jsp\" class=\"alert-link\">Ingresa aquí</a>. Para saber tus beneficios. O <a  name =\"inicio\" href=\"loginadmin.jsp\" class=\"alert-link\" id=\"text\">inicie sesion</a> como administrador\n");
      out.write("                </div>\n");
      out.write("                <nav class=\"navbar  navbar-light bg-light \">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("\n");
      out.write("                            <a class=\"navbar-brand\" href=\"#\">GLITCH</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"collapse navbar-collapse  \" >\n");
      out.write("                            <ul class=\"nav navbar-nav \">\n");
      out.write("                                <li ><a  href=\"https://chat.whatsapp.com/IvZwIptpqY1DhKRI3IMtvj\"><span class=\"glyphicon glyphicon-phone\"></span></a></li>\n");
      out.write("                                <li><a href=\"https://mail.google.com/\"><span class=\"glyphicon glyphicon-envelope\"></span></a></li>\n");
      out.write("                                <li><a href=\"https://mail.google.com/\"><span class=\"fa fa-google-plus\"></span></a></li>\n");
      out.write("                                <li><a href=\"https://web.facebook.com/\"><span class=\"fa fa-facebook\"></span></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <form class=\"navbar-form navbar-right\" action=\"/action_page.php\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("                                </form>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("          \n");
      out.write("                <nav class=\"navbar navbar-inverse\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>                        \n");
      out.write("                            </button>\n");
      out.write("                            <a class=\"navbar-brand\" href=\"index.jsp\" name =\"inicio1\">  INICIO</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                            <ul class=\"nav navbar-nav\">\n");
      out.write("                                <li ><a href=\"nosotros.jsp\">NOSOTROS</a></li>\n");
      out.write("                                \n");
      out.write("                                <li><a href=\"ELLAS.jsp\">JOYAS PARA ELLAS</a></li>\n");
      out.write("                                <li><a href=\"ELLOS.jsp\">JOYAS PARA ELLOS</a></li>\n");
      out.write("                                <li><a href=\"NOVIOS.jsp\">JOYAS PARA NOVIOS</a></li>\n");
      out.write("                                <li><a href=\"Dejatucomentario.jsp\">PROBLEMAS</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li><a href=\"producto.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\"></span> Comprar</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </header>         ");
      out.write("\n");
      out.write("     <section>\n");
      out.write("     <section class=\"texto-header\">\n");
      out.write("         <h1>Nosotros</h1>\n");
      out.write("         <h2>“Un DIAMANTE es para siempre”</h2>\n");
      out.write("         </section>\n");
      out.write("      <div style=\"height: 150px; overflow: hidden;\" ><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\" style=\"height: 100%; width: 100%;\"><path d=\"M0.00,49.98 C208.52,147.53 349.20,-49.98 500.00,49.98 L500.00,150.00 L0.00,150.00 Z\" style=\"stroke: none; fill: #08f;\"></path></svg></div>\n");
      out.write("             \n");
      out.write("         </div>\n");
      out.write("        <section class=\"contenedor sobre-nosotros\">\n");
      out.write("            <h2 class=\"titulo\">Nuestro producto</h2>\n");
      out.write("            <div class=\"contenedor-sobre-nosotros\">\n");
      out.write("                <img src=\"img/ilustracion2.svg\" alt=\"\" class=\"imagen-about-us\">\n");
      out.write("                <div class=\"contenido-textos\">\n");
      out.write("                    <h3><span>1</span>Los mejores productos</h3>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Deserunt veniam eius aspernatur ad\n");
      out.write("                        consequuntur aperiam minima sed dicta odit numquam sapiente quam eum, architecto animi pariatur,\n");
      out.write("                        velit doloribus laboriosam ut.</p>\n");
      out.write("                    <h3><span>2</span>Los mejores productos</h3>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Deserunt veniam eius aspernatur ad\n");
      out.write("                        consequuntur aperiam minima sed dicta odit numquam sapiente quam eum, architecto animi pariatur,\n");
      out.write("                        velit doloribus laboriosam ut.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("     \n");
      out.write("         \n");
      out.write("         \n");
      out.write("\n");
      out.write("\n");
      out.write("         </section>\n");
      out.write(" ");
      out.write("  <footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"sociales\" id=\"barra\">\n");
      out.write("                    <a href=\"https://mail.google.com/\" class=\"gmail\"><i class=\"glyphicon glyphicon-envelope\"></i></a>\n");
      out.write("                    <a href=\"https://web.facebook.com/\" class=\"facebook\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                    <a href=\"https://mail.google.com/\" class=\"telefono\"><i class=\"fa fa-phone\"></i></a>\n");
      out.write("                    <a href=\"https://mail.google.com/\" class=\"google\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </footer>");
      out.write("\n");
      out.write(" </div>\n");
      out.write(" \n");
      out.write("      ");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/d19fe367e1.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("     ");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
