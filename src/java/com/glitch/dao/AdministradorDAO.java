
package com.glitch.dao;

import com.glitch.conexionbd.ConexionBd;
import com.glitch.dto.AdminDTO;
import com.glitch.interfaces.OperacionesBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AdministradorDAO implements OperacionesBD<AdminDTO> {
      private static ConexionBd con = null;
       
        private static PreparedStatement pstm = null;
    //Objeto para guardar los resultado de una consulta JAVA
    private static ResultSet res = null;

    public AdministradorDAO() {
                con = ConexionBd.getInstance();
    }
    
      public Boolean loginAdmi(AdminDTO adminDTO) {
      
        Boolean result = false;
        final String SQL_LOGIN="select * from administrador where  codigo=? and contraseña=?";
        try {
            pstm = con.getCon().prepareStatement(SQL_LOGIN);
            pstm.setString(1, adminDTO.getCodigo());
            
           pstm.setString(2, adminDTO.getContraseña());
            res = pstm.executeQuery();
            while(res.next()){
            result=true;
            }
        } catch (Exception e) {
            System.out.println("Error en login :"+e.getMessage());
        } finally {
          closeConnection();
            
        }
      return result;
    }
      
    
 public Boolean siExisteMail(String codigo) {
        Boolean result =false;
        final String SQL_VALIDATEMAIL = "select * from administrador where codigo=?";
        try {
            pstm = con.getCon().prepareStatement(SQL_VALIDATEMAIL);
            pstm.setString(1, codigo);
            res = pstm.executeQuery();
            while (res.next()) {
                result=true;
            }
        } catch (Exception e) {
            System.out.println("Error al comprobar mail :" + e.getMessage());
        } finally {
            closeConnection();
        }
        return result;

    }
    @Override
    public Boolean insert(AdminDTO t) {
       Boolean result = false;
        String SQL_Insert = "insert into administrador values(?,?)";
        try {
            pstm = con.getCon().prepareStatement(SQL_Insert);
            pstm.setString(1, t.getCodigo());
            pstm.setString(2, t.getContraseña());
            

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
    public Boolean update(AdminDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AdminDTO selectById(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<AdminDTO> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<AdminDTO> selectByName() {
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
        }
    }
    
    
    
    
}
