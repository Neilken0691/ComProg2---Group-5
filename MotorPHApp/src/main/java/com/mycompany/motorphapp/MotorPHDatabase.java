/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphapp;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author marqu
 */
public class MotorPHDatabase {
    
    
    Connection conn = null;
    public static Connection java_MotorPHDatabase(){
        
        
        try{            
            
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("org.jdbc:sqlite:C:Users\\marqu\\Documents\\NetBeansProject\\MotorPHApp\\mydatabase.sqlite.db-journal");
            return conn;
            
            
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
        
    }
    
    
    
    
}
