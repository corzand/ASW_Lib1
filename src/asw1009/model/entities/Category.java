/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asw1009.model.entities;

import java.util.Date;


/**
 *
 * @author Andrea
 */
public class Category {
    
    private int id;
    private String title;
    private boolean state;
    private String color;
    
    public Category(){
        this.id = 0;
        this.title = "";   
        this.state = true;
        this.color = "";
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean getState(){
        return this.state;
    }
    
    public void setState(boolean state){
        this.state = state;
    }    
}
