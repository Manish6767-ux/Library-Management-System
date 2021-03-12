/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.managment.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
/**
 *
 * @author LENOVO
 */
public class conn {
    
    Connection c;
    Statement s;
     
        conn(){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                c=DriverManager.getConnection("jdbc:mysql://localhost:3309/project8","root","root");
                s =c.createStatement();  
          
       
            }
        catch(Exception e)
        {
            System.out.println(e);
        }
}
}

