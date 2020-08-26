
package com.glitch.controller;

import com.glitch.dao.ReporteDAO;
import com.glitch.dto.ReporteDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Brian
 */
public class ReporteController extends HttpServlet {

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
        
        int dni = Integer.parseInt( request.getParameter("TXTDNI"));
        String nombre = request.getParameter("txtnombre"); 
      int celular = Integer.parseInt(request.getParameter("txtcelular"));

        String correo = request.getParameter("txtcorreo");
        String caso = request.getParameter("txtcaso");
           String descripcion = request.getParameter("txtdescripcion");

        if (correo.trim().isEmpty()|| nombre.trim().isEmpty() ||caso.trim().isEmpty()||descripcion.trim().isEmpty()) {
            String mensajeError = "Deberá de completar todos los datos requeridos";
            request.getSession().setAttribute("error2", mensajeError);
            request.getRequestDispatcher("error2.jsp").forward(request, response);
        }else{
            ReporteDTO rep = new ReporteDTO() ;
           rep.setDni(dni);
        rep.setNombre(nombre);
      rep.setCelular(celular);
            rep.setEmail(correo);
            rep.setCaso(caso);
            rep.setDetalle(descripcion);

          ReporteDAO reporteDAO = new ReporteDAO();
             if (reporteDAO.insert(rep)) {
                  String mensajeExito = "El reporte se envio exitosamente. Esperenos, nostros nos Comunicaremos con usted";
                  request.getSession().setAttribute("exit", mensajeExito);
                   request.getRequestDispatcher("mensaje2.jsp").forward(request, response);

                
           
             }
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

}
