/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localisation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ghassen
 */
public class Datasource {
     private String url="jdbc:mysql://127.0.0.1:82/esprit";
    private String username="root";
    private String password="";
    private Connection cnx;
    private static Datasource instance;
    private Datasource() {
        try {
            cnx=DriverManager.getConnection(url,username,password);
            System.out.println("connection");       } 
        catch (SQLException ex) {
            Logger.getLogger(Datasource.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static Datasource getInstance() {
        
        if(instance ==null)
            instance=new Datasource();
        return instance;
    }
   public Connection getcnx(){
   return cnx;
   }
    
}
