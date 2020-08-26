
package com.glitch.test;

import com.glitch.conexionbd.ConexionBd;
import com.glitch.dao.AdministradorDAO;
import com.glitch.dao.ClienteDAO;
import com.glitch.dao.ProductoDAO;
import com.glitch.dao.ReporteDAO;
import com.glitch.dto.AdminDTO;
import com.glitch.dto.ClienteDTO;
import com.glitch.dto.ProductoDTO;
import com.glitch.dto.ReporteDTO;
import java.awt.List;


public class Testing {
    public static void main(String[] args) {
        // ConexionBd.getInstance();
ConexionBd.getInstance();
//
//        ClienteDTO usuario = new ClienteDTO();
//        usuario.setDni("123123");
//        usuario.setNombre("1234567");
//        usuario.setEmail("claudia@gmail.com");
//        usuario.setContraseña("usuario");
//
//        ClienteDAO usuarioDAO = new ClienteDAO();
//       Boolean result = usuarioDAO.insert(usuario);
//      if (result) {
//            System.out.println("Se insertaron correctamente los datos");
//       } else {
//           System.out.println("No se insertaron los datos correctamente");
//        }
//      ReporteDTO re = new ReporteDTO();
//      re.setEmail("dsad@dasd.com");
//      re.setDni(123);
//      re.setCelular(1231);
//      re.setNombre("da");
//      re.setDetalle("dasd");
//      re.setCaso("dada");
//        ReporteDAO res= new ReporteDAO();
//      Boolean result=res.insert(re);
//           if (result) {
//          System.out.println("Se insertaron correctamente los datos");
//      } else {
//         System.out.println("No se insertaron los datos correctamente");
//       }
      
//              if (usuarioDAO.siExisteMail("paolo@utp.edu.pe")) {
//                 System.out.println("Ya existe");
//       } else {
//                   System.out.println("No existe");
//      }
//PROBANDO EL LOGIN


// AdminDTO usuario = new AdminDTO();
//        usuario.setCodigo("A0012");
//
//     usuario.setContraseña("1234");
//
// AdministradorDAO ttDAO = new  AdministradorDAO();
//          if (ttDAO.loginAdmi(usuario)) {
//              System.out.println("Se logueo correctamente");
//          }else {
//              System.out.println("Usuario y/o clave errada");
//        }
 ProductoDTO producto= new ProductoDTO();
 producto.setNombre("JoyasEuropea");
 producto.setDescripcion("Bañadas en Oro");
 producto.setPrecio(500);
 producto.setId(1);
 producto.setStock(120);
 
 ProductoDAO pro= new ProductoDAO();
        if (pro.update(producto)) {
            System.out.println("Se actulizo"); 
        } else {
       
            System.out.println("No se actualizo");
        }
        
                
//              if (usuarioDAO.siExisteMail("paolo@utp.edu.pe")) {
//                 System.out.println("Ya existe");
//       } else {
//                   System.out.println("No existe");
//      }
//PROBANDO EL LOGIN
                /*if (usuarioDAO.loginUser(usuario)) {
                System.out.println("Se logueo correctamente");
                } else {
                System.out.println("Usuario y/o clave errada");
                }*/
    }
}
