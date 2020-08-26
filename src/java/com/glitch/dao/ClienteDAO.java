
package com.glitch.dao;

import com.glitch.conexionbd.ConexionBd;
import com.glitch.dto.ClienteDTO;
import com.glitch.interfaces.OperacionesBD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ClienteDAO  implements OperacionesBD<ClienteDTO>  {
       private static ConexionBd con = null;
       
        private static PreparedStatement pstm = null;
    //Objeto para guardar los resultado de una consulta JAVA
    private static ResultSet res = null;
   public ClienteDAO() {
        con = ConexionBd.getInstance();
    }
      public Boolean loginUser(ClienteDTO clienteDTO) {

        Boolean result = false;
        final String SQL_LOGIN="select * from clientes where dni=? and contraseña=?";
        try {
            pstm = con.getCon().prepareStatement(SQL_LOGIN);
            pstm.setString(1, clienteDTO.getDni());
            pstm.setString(2, clienteDTO.getContraseña());        
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
      
     
   
   
     public Boolean siExisteMail(String dni) {
        Boolean result =false;
        final String SQL_VALIDATEMAIL = "select * from clientes where dni=?";
        try {
            pstm = con.getCon().prepareStatement(SQL_VALIDATEMAIL);
            pstm.setString(1, dni);
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
    public Boolean insert(ClienteDTO t) {
   Boolean result = false;
        String SQL_Insert = "insert into clientes values(?,?,?,?)";
        try {
            pstm = con.getCon().prepareStatement(SQL_Insert);
            pstm.setString(1, t.getDni());
            pstm.setString(2, t.getNombre());
            pstm.setString(3, t.getEmail());
            pstm.setString(4, t.getContraseña());

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
    public Boolean update(ClienteDTO t) {
      Boolean  result=false;
   final String  sql_update="update clientes set dni=?,nombre=?,email=?,contraseña=? where id=?";
        try {
            pstm=con.getCon().prepareStatement(sql_update);
            pstm.setString(1, t.getDni());
            pstm.setString(2, t.getNombre());
            pstm.setString(3, t.getEmail());
            pstm.setString(4,t.getContraseña());
           
            pstm.setInt(5, t.getId());
          int resultUpdate=pstm.executeUpdate();
            if (resultUpdate>0) {
                result=true;
            }
            
        } catch (Exception e) {
            System.out.println("Error al actualizar");
        }finally{
           closeConnection();
        }
        return result; 
    }

    @Override
    public Boolean delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClienteDTO selectById(Object id) {
      ClienteDTO  cliente = new   ClienteDTO();
             final String SQL_ID="select * from produtos where idpro=?";
        try {
            
          
              pstm = con.getCon().prepareStatement(SQL_ID);
            pstm.setInt(1, Integer.parseInt(id.toString()));
         
            res = pstm.executeQuery();
            while (res.next()) {                
                
             cliente.setId(res.getInt("id"));
                  cliente.setDni(res.getString("dni"));
               cliente.setNombre(res.getString("nombre"));
                 cliente.setEmail(res.getString("email"));
             
              
            }
            
        } catch (Exception e) {
                 System.out.println("Error al traer los datos"+ e.getMessage());
        }finally{
            closeConnection();
        }
return   cliente;
    }

    @Override
    public ArrayList<ClienteDTO> selectAll() {
     ArrayList<ClienteDTO> lista = new  ArrayList<>();
             final String SQL_LOGIN="select * from clientes";
        try {
       
              pstm = con.getCon().prepareStatement(SQL_LOGIN);
            
         
            res = pstm.executeQuery();
            while (res.next()) {                
                ClienteDTO cliente =new  ClienteDTO();
                 cliente.setId(res.getInt("id"));
                  cliente.setDni(res.getString("dni"));
               cliente.setNombre(res.getString("nombre"));
                 cliente.setEmail(res.getString("email"));
                
                lista.add(cliente);
              
            }
            
        } catch (Exception e) {
                 System.out.println("Error al traer los datos"+ e.getMessage());
        }finally{
            closeConnection();
        }
        return lista;
    }

    @Override
    public ArrayList<ClienteDTO> selectByName() {
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
