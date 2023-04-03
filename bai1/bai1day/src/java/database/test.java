/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author LeeJaeLee
 */
public class test {
    public static void main(String[] args) {
        userDB u = new userDB();
        System.out.println(u.getUserById("1").getTenChuThe());
    }
}
