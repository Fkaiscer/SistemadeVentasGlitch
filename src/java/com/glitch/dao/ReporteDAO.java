/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glitch.dao;

import com.glitch.conexionbd.ConexionBd;
import com.glitch.dto.ReporteDTO;
import com.glitch.interfaces.OperacionesBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ReporteDAO  implements OperacionesBD<ReporteDTO> {
    
    
   private static ConexionBd con = null;
       
        private static PreparedStatement pstm = null;
    //Objeto para guardar los resultado de una consulta JAVA
    private static ResultSet res = null;

    public ReporteDAO() {
          con = ConexionBd.getInstance();
    }
    
    @Override
    public Boolean insert(ReporteDTO t) {
       Boolean result = false;
        String SQL_Insert = "insert into reportes values(?,?,?,?,?,?)";
        try {
            pstm = con.getCon().prepareStatement(SQL_Insert);
            pstm.setInt(1, t.getDni());
            pstm.setString(2, t.getNombre());
            pstm.setInt(3, t.getCelular());
            pstm.setString(4, t.getEmail());
            pstm.setString(5, t.getCaso());
             pstm.setString(6, t.getDetalle());

            if (pstm.executeUpdate() > 0) {
                result = true;
            }

        } catch (Exception e) {
            System.out.println("Error al insertar :" + e.getMessage());
            e.printStackTrace();
        } finally {
            closeConnection();
        }

        return result;
    }

    @Override
    public Boolean update(ReporteDTO t) {
         throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ReporteDTO selectById(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ReporteDTO> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ReporteDTO> selectByName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closeConnection() {
        try {
            if (res != null) {
                res.close();
            }
            if (pstm != null) {
                pstm.close();
            }
            if (con != null) {
                con.closeConnectionBd();
            }

        } catch (Exception e) {
            System.out.println("Erro al cerrar :" + e.getMessage());
        }}
    
    
  
}
