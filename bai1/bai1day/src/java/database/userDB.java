/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author LeeJaeLee
 */
public class userDB {
    public List<User> listUser(){
        List<User> list = new ArrayList<>();
        String query = "Select * from user";
        connectDB con = new connectDB();
        try {
            Statement sta = con.connector().createStatement();
            ResultSet rs = sta.executeQuery(query);
            while(rs.next()){
                list.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), Integer.parseInt(rs.getString(5)), rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public User getUserById(String id){
        User u = new User();
        String query = "select * from user where id = " + id;
        connectDB con = new connectDB();
        try {
            Statement sta = con.connector().createStatement();
            ResultSet rs = sta.executeQuery(query);
            while(rs.next()){
                u.setId(rs.getInt(1));
                u.setTenChuThe(rs.getString(2));
                u.setKieuThe(rs.getString(3));
                u.setSoThe(rs.getString(4));
                u.setCvc(Integer.parseInt(rs.getString(5)));
                u.setNamHetHan(rs.getString(6));
            }
        } catch (Exception e) {
        }
        return u;
    }
}
