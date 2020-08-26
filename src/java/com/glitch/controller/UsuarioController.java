/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glitch.controller;

import com.glitch.dao.AdministradorDAO;
import com.glitch.dao.ClienteDAO;
import com.glitch.dao.ProductoDAO;
import com.glitch.dto.AdminDTO;
import com.glitch.dto.ClienteDTO;
import com.glitch.dto.ProductoDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Brian
 */
public class UsuarioController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String proceso = request.getParameter("txtProceso");
 
        switch (proceso) {
            case "login":
                login(request, response);
                break;
            case "registro":
                registro(request,response);
                break;
                   case "admin":
               validaad(request,response);
                break;
                   case "mlista"  :
                       listarpro(request,response);
           case "mlistacliente"  :
                       listarcli(request,response);
                         case "actulizarpro"  :
                      actulizarprod(request,response);
                             case "cli"  :
                     actualizarcli(request,response);
                      
        }
        }

    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
     
        String dni = request.getParameter("TXTDNI");
        String contraseña = request.getParameter("TXTCON");
        String mensajeExito = "Inicio de Sesión exitoso";
         ClienteDTO cliente = new ClienteDTO();
           cliente.setDni(dni);
          cliente.setContraseña(contraseña);

           ClienteDAO clienteDAO = new ClienteDAO();
           
        if (clienteDAO.loginUser(cliente)) {
            request.getSession().setAttribute("exitousuario", mensajeExito);
        request.getRequestDispatcher("aceptauser.jsp").forward(request, response);
        }else {
               String mensajeError = "Denegado Usuario o Contraseña mal escrita";
                    request.getSession().setAttribute("error", mensajeError);
                  request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    private void registro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
       String dni = request.getParameter("TXTDNI");
        String nombre = request.getParameter("TXTNOM");  
        String correo = request.getParameter("correo");
        String contraseña = request.getParameter("TXTCON");

        if (correo.trim().isEmpty() || contraseña .trim().isEmpty()) {
            String mensajeError = "Deberá de completar todos los datos requeridos";
            request.getSession().setAttribute("error", mensajeError);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } else {
      ClienteDTO cliente = new ClienteDTO();
           cliente.setDni(dni);
          cliente.setNombre(nombre);
           cliente.setEmail(correo);
         cliente.setContraseña(contraseña);

          ClienteDAO clienteDAO = new ClienteDAO();

           if (clienteDAO.siExisteMail(dni)) {

               String mensajeError = "El dni que intenta registrar, ya se encuentra registrado en la base de datos, inicie sesión con su cuenta";
                request.getSession().setAttribute("error", mensajeError);
               request.getRequestDispatcher("error.jsp").forward(request, response);

          } else {

               if (clienteDAO.insert(cliente)) {
                  String mensajeExito = "Los datos fueron ingresados correctamente, ya puede iniciar sesion";
                  request.getSession().setAttribute("exito", mensajeExito);
                   request.getRequestDispatcher("mensaje.jsp").forward(request, response);

                } else {
                    String mensajeError = "No se logro registrar los datos en la base de datos";
                    request.getSession().setAttribute("error", mensajeError);
                  request.getRequestDispatcher("error.jsp").forward(request, response);
            }

            }

       }
    }
   private void validaad(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String codigo = request.getParameter("txtcodigo");
//    String contra = request.getParameter("txtcontraseña");
//       String nombre=request.getParameter("txtnombre");
       String pass =request.getParameter("txtpass");
        String mensajeExito = "Inicio de Sesión exitoso";
         AdminDTO administrador = new  AdminDTO();
         
       administrador.setCodigo(codigo);
       
//         administrador.setContraseña(contraseña);
//administrador.setNombre(nombre);
administrador.setContraseña(pass);
        AdministradorDAO ttDAO  = new AdministradorDAO();
           
        if (ttDAO.loginAdmi(administrador)  ) {
             request.getSession().setAttribute("exitousuario", mensajeExito);
        request.getRequestDispatcher("sistema.jsp").forward(request, response);
           
        }else {
              
                 String mensajeError = "Solo personal autorizado";
                    request.getSession().setAttribute("error", mensajeError);
                  request.getRequestDispatcher("error3.jsp").forward(request, response);  
        }
   
    }

   
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void listarpro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        ProductoDAO  usuarioDAO= new ProductoDAO();
        ArrayList<ProductoDTO> productos = usuarioDAO.selectAll();
        request.getSession().setAttribute("aqui", productos);
        
        
        request.getRequestDispatcher("WEB-INF/mproductos/index.jsp").forward(request, response);
        
    }

    private void listarcli(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClienteDAO clienteDAO =new ClienteDAO();
        ArrayList<ClienteDTO> cliente=clienteDAO.selectAll();
        
        request.getSession().setAttribute("aca", cliente);
         request.getRequestDispatcher("WEB-INF/mclientes/index.jsp").forward(request, response);
    }

    private void actulizarprod(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String id = request.getParameter("txtpro");
    Integer id1=Integer.parseInt(id);
        ProductoDTO producto = new ProductoDTO();
    ProductoDAO productoDAO = new ProductoDAO();
    producto=productoDAO.selectById(id);
     request.getSession().setAttribute("producto", producto);
         request.getRequestDispatcher("WEB-INF/mproductos/update.jsp").forward(request, response);
    }

    private void actualizarcli(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String id = request.getParameter("txtcli");
        Integer id1=Integer.parseInt(id);
        ClienteDTO cliente = new ClienteDTO();
    ClienteDAO clienteDAO = new ClienteDAO();
    cliente=clienteDAO.selectById(id);
     request.getSession().setAttribute("cliente", cliente);
         request.getRequestDispatcher("WEB-INF/mclientes/muestra.jsp").forward(request, response);
         
         
    }


    
   
  
}
