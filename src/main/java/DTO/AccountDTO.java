/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author son
 */
public class AccountDTO {
    
    private String full_name;
    private int id;
    private String image;
    private String pwd;
    private int role_id;
    private String user_name;
    
    public AccountDTO(){
        full_name=null;
        id=-1;
        image=null;
        pwd=null;
        role_id=-1;
        user_name=null;
    }
    
    public AccountDTO(String fname,int id, String img, String pass, int role, String usrname){
        full_name=fname;
        id=id;
        image=img;
        pwd=pass;
        role_id=role;
        user_name=usrname;
    }
    public AccountDTO(String pwd, int role_id, String user_name) {
        this.pwd = pwd;
        this.role_id = role_id;
        this.user_name = user_name;
    }
    
    //-----------------------------------
    //
    //              GETTERS
    //
    //-----------------------------------
    
    public String getFull_name() {
        return full_name;
    }

    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getPwd() {
        return pwd;
    }

    public int getRole_id() {
        return role_id;
    }

    public String getUser_name() {
        return user_name;
    }
    
    //-----------------------------------
    //
    //              SETTERS
    //
    //-----------------------------------
    
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    
    
}
