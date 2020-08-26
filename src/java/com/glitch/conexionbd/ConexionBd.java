/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glitch.conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;

/*Patron Singleton
Pull de conexion para bd mas grande*/
public class ConexionBd {
    private static ConexionBd instance = null;
    private static Connection con = null;
     private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=glitch";
     
       private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
         private static final String USER = "sa";
     private static final String PASS = "123456";
         //VAMOS A DEFINIR UN CONSTRUCTOR
    private ConexionBd() {

        try {
            //Generamos una isntancia de la clase driver 
            Class.forName(DRIVER).newInstance();
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Bienvenido a la base de datos");

        } catch (Exception e) {
            System.out.println("Error al conectar la base de datos"+e.getMessage());
            e.printStackTrace();
        }

    }
       public static synchronized ConexionBd getInstance() {
        if (instance == null) {
            instance = new ConexionBd();
        }
     return instance;
    }
          public Connection getCon(){
     return con;
    }
    
    public void closeConnectionBd(){
         instance=null;
    }
}
