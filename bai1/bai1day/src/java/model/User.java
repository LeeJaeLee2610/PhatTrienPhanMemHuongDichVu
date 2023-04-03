/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LeeJaeLee
 */
public class User {
    private Integer id;
    private String tenChuThe;
    private String kieuThe;
    private String soThe;
    private Integer cvc;
    private String namHetHan;

    public User(Integer id, String tenChuThe, String kieuThe, String soThe, Integer cvc, String namHetHan) {
        this.id = id;
        this.tenChuThe = tenChuThe;
        this.kieuThe = kieuThe;
        this.soThe = soThe;
        this.cvc = cvc;
        this.namHetHan = namHetHan;
    }

    public User() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenChuThe() {
        return tenChuThe;
    }

    public void setTenChuThe(String tenChuThe) {
        this.tenChuThe = tenChuThe;
    }

    public String getKieuThe() {
        return kieuThe;
    }

    public void setKieuThe(String kieuThe) {
        this.kieuThe = kieuThe;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public Integer getCvc() {
        return cvc;
    }

    public void setCvc(Integer cvc) {
        this.cvc = cvc;
    }

    public String getNamHetHan() {
        return namHetHan;
    }

    public void setNamHetHan(String namHetHan) {
        this.namHetHan = namHetHan;
    }
    
    
}
