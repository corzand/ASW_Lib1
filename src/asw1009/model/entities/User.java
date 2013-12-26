/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asw1009.model.entities;


/**
 *
 * @author Andrea
 */
public class User {
    
    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String picture;
    
    public User(){
        this.id = 0;
        this.firstName = "";   
        this.lastName = "";
        this.username ="";
        this.password ="";
        this.email="";
        this.picture="";
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPicture(){
        return this.picture;
    }
    
    public void setPicture(String picture){
        this.picture = picture;
    }
    
}
