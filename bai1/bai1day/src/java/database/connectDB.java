/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LeeJaeLee
 */
public class connectDB {
    Connection con = null;
    public Connection connector(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bai1";
            String username = "root";
            String password = "emcuong";
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
        }
        return con;
    }
    
    public void close(){
        try {
            con.close();
        } catch (Exception e) {
        }
    }
}
