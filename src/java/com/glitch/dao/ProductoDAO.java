
package com.glitch.dao;


import com.glitch.conexionbd.ConexionBd;

import com.glitch.dto.ClienteDTO;
import com.glitch.dto.ProductoDTO;
import com.glitch.interfaces.OperacionesBD;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;


public class ProductoDAO  implements OperacionesBD<ProductoDTO> {
    private static ConexionBd con = null;
       
        private static PreparedStatement pstm = null;
    //Objeto para guardar los resultado de una consulta JAVA
    private static ResultSet res = null;

    public ProductoDAO() {
         con = ConexionBd.getInstance();
    }
    
   
 public void listarImg( int id , HttpServletResponse response ){
     String SQL_IMAGE="Select * from productos where idpro=?";
     InputStream inputstream=null;
     OutputStream outputstream=null;
     BufferedInputStream bufferedinputstream=null;
     BufferedOutputStream bufferedoutputstream=null;
     try {
         outputstream=response.getOutputStream();
           pstm = con.getCon().prepareStatement(SQL_IMAGE);
            res = pstm.executeQuery();
            if (res.next()) {
             inputstream=res.getBinaryStream("foto");
         }
            bufferedinputstream= new BufferedInputStream(inputstream);
            bufferedoutputstream= new BufferedOutputStream(outputstream);
            int i=0;
            while ((i=bufferedinputstream.read()) != -1) {             
             bufferedoutputstream.write(i);
         }
                   
     } catch (Exception e) {
         
             System.out.println("Error al traer los datos"+ e.getMessage());
     }finally{
            closeConnection();
        }
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

    @Override
    public Boolean insert(ProductoDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean update(ProductoDTO t) {
   Boolean  result=false;
   final String  sql_update="update productos set nombres=?, descripcion=?,precio=?,sotch=? where idpro=?";
        try {
            pstm=con.getCon().prepareStatement(sql_update);
            pstm.setString(1, t.getNombre());
            pstm.setString(2, t.getDescripcion());
            pstm.setDouble(3,t.getPrecio());
            pstm.setInt(4, t.getStock());
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
    public ProductoDTO selectById(Object id) {
            ProductoDTO  producto = new   ProductoDTO ();
             final String SQL_ID="select * from productos where idpro=?";
        try {
            
          
              pstm = con.getCon().prepareStatement(SQL_ID);
            pstm.setInt(1, Integer.parseInt(id.toString()));
         
            res = pstm.executeQuery();
            while (res.next()) {                
                
                producto.setId(res.getInt("idpro"));
                producto.setNombre(res.getString("nombres"));
                producto.setFoto(res.getString("foto"));
                producto.setDescripcion(res.getString("descripcion"));
                producto.setPrecio(res.getDouble("precio"));
                producto.setStock(res.getInt("sotch"));
             
              
            }
            
        } catch (Exception e) {
                 System.out.println("Error al traer los datos"+ e.getMessage());
        }finally{
            closeConnection();
        }
return  producto;
    }

    @Override
    public ArrayList<ProductoDTO> selectAll() {
          ArrayList<ProductoDTO> lista = new  ArrayList<>();
             final String SQL_LOGIN="select * from productos";
        try {
            
          
              pstm = con.getCon().prepareStatement(SQL_LOGIN);
            
         
            res = pstm.executeQuery();
            while (res.next()) {                
                ProductoDTO producto =new ProductoDTO();
                producto.setId(res.getInt("idpro"));
                producto.setNombre(res.getString("nombres"));
                producto.setFoto(res.getString("foto"));
                producto.setDescripcion(res.getString("descripcion"));
                producto.setPrecio(res.getDouble("precio"));
                producto.setStock(res.getInt("sotch"));
                lista.add(producto);
              
            }
            
        } catch (Exception e) {
                 System.out.println("Error al traer los datos"+ e.getMessage());
        }finally{
            closeConnection();
        }
return lista;
    }

    @Override
    public ArrayList<ProductoDTO> selectByName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
//   public List listar(){
//     
//       List<ProductoDTO> productos=new ArrayList<>();
//       String sql="select * from produtos";
//       try {
//          con=cn.getConnection();
//          pstm=con.prepareStatement(sql);
//          rs=pstm.executeQuery();
//           while (rs.next()) {               
//               ProductoDTO p= new ProductoDTO();
//               p.setId(rs.getInt(1));
//               p.setNombre(rs.getString(2));
//               p.setFoto(rs.getBinaryStream(3));
//               p.setDescripcion(rs.getString(4));
//               p.setPrecio(rs.getDouble(5));
//               p.setStock(rs.getInt(6));
//               productos.add(p);
//           }
//   
//           
//       } catch (Exception e) {
//       }
//  return productos;
//   }  
//public void listarImg(int id , HttpServletResponse response){
//    String sql="select * from  produtos where id="+id;
//    InputStream inputstream=null;
//    OutputStream outputsream=null;
//    BufferedInputStream bufferedinputstream=null;
//    BufferedOutputStream bufferedoutputstream=null;
//    
//    try {
//        outputsream=response.getOutputStream();
//        
//        con=cn.getConnection();
//        pstm=con.prepareStatement(sql);
//        rs=pstm.executeQuery();
//        if (rs.next()) {
//            inputstream=rs.getBinaryStream("foto");
//        }
//        bufferedinputstream= new BufferedInputStream(inputstream);
//        bufferedoutputstream= new BufferedOutputStream(outputsream);
//        int i=0;
//        while((i= bufferedinputstream.read()) !=1){
//            bufferedoutputstream.write(i);
//            
//        }
//    } catch (Exception e) {
//    }
//}





