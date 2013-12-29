/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asw1009.viewmodel.request;

import java.util.Date;

/**
 *
 * @author Andrea
 */
public class AddTaskRequestViewModel {
    private String title;
    private String description;
    private Date date;
    private boolean done;
    private int categoryId;
    private int userId;
    private double latitude;
    private double longitude;
    private boolean personal;
    private int assignedUserId;
    private String attachment;
    
    public int getUserId(){
        return this.userId;
    }
    
    public void setUserId(int userId){
        this.userId = userId;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public Date getDate(){
        return this.date;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    
    public boolean getDone(){
        return this.done;
    }
    
    public void setDone(boolean done){
        this.done = done;
    }    
    
    public int getCategoryId(){
        return this.categoryId;
    }
    
    public void setCategoryId(int categoryId){
        this.categoryId = categoryId;
    }
    
    public double getLatitude(){
        return this.latitude;
    }
    
    public void setLatitude(double latitude){
        this.latitude = latitude;
    }
    
    public double getLongitude(){
        return this.longitude;
    }
    
    public void setLongitude(double longitude){
        this.longitude = longitude;
    }
    
    public String getAttachment(){
        return this.attachment;
    }
    
    public void setAttachment(String attachment){
        this.attachment = attachment;
    }
    
    public int getAssignedUserId(){
        return this.assignedUserId;
    }
    
    public void setAssignedUserId(int assignedUserId){
        this.assignedUserId = assignedUserId;
    }
    
    public boolean getPersonal(){
        return this.personal;
    }
    
    public void setPersonal(boolean personal){
        this.personal = personal;
    }
}