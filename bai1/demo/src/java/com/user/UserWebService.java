/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user;

import database.userDB;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.User;

/**
 *
 * @author LeeJaeLee
 */
@WebService(serviceName = "UserWebService")
public class UserWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getListUser")
    public List<User> getListUser() {
        //TODO write your implementation code here:
        userDB udb = new userDB();
        List<User> list = udb.listUser();
        return list;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getUserById")
    public User getUserById(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        userDB udb = new userDB();
        User u = udb.getUserById(id);
        return u;
    }

    @WebMethod(operationName = "thanh-toan")
    public String thanhToan(@WebParam(name = "id") String id, @WebParam(name = "price") Double price){
        userDB udb = new userDB();
        User u = udb.getUserById(id);
        System.out.println(u.getTenChuThe() + " " + price);
        return "Tai khoan " + u.getTenChuThe() + " phai thanh toan voi gia tien: " + price;
    }
    
}
