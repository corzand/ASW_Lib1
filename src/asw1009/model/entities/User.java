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
public class User extends UserBase {
    
    
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    
    public User(){
        super();
        this.firstName = "";   
        this.lastName = "";
        this.password ="";
        this.email="";
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
    
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    
}
