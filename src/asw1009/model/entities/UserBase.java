
package asw1009.model.entities;


public class UserBase {
    private int id;    
    private String username;
    private String picture;

    public UserBase() {
        this.id = 0;
        this.username = "";
        this.picture = "";
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    
    public String getPicture(){
        return this.picture;
    }
    
    public void setPicture(String picture){
        this.picture = picture;
    }
    
}
