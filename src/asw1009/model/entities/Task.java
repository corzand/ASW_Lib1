
package asw1009.model.entities;

import java.util.Date;


public class Task {
    
    private int id;
    private String title;
    private String description;
    private Date date;
    private boolean done;
    private int userId;
    private int categoryId;
    private double latitude;
    private double longitude;
    private boolean personal;
    private int assignedUserId;
    private String attachment;
	private long timeStamp;
    
    public Task(){
        this.id = 0;
        this.title = "";   
        this.description = "";
        this.date = new Date();
        this.done = false;
        this.userId = -1;
        this.categoryId = -1;
        this.latitude = 0;
        this.longitude = 0;
        this.personal = true;
        this.assignedUserId = -1;
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
    
    public int getUserId(){
        return this.userId;
    }
    
    public void setUserId(int userId){
        this.userId = userId;
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
	
	 public long getTimeStamp(){
        return this.timeStamp;
    }
    
    public void setTimeStamp(long timeStamp){
        this.timeStamp = timeStamp;
    }    
}
