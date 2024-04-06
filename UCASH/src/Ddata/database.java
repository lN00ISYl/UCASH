/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ddata;

import java.sql.*;
import javax.swing.JOptionPane;
public class database {
     public static Connection con;
    public static Statement state;
    static{
    try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/u_cash"+"?useSSL=false","root","Pentakill123");
        state=con.createStatement();
    }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    
    }
}
