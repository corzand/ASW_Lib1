/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asw1009.viewmodel.request;

import asw1009.model.entities.Category;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Andrea
 */
public class SearchTasksRequestViewModel {
    private Date startDate;
    private Date endDate;
    private int userId;
//    private List<Category> categories;
//    private boolean personal;
    
    public Date getStartDate(){
        return this.startDate;
    }
    
    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }
    
    public Date getEndDate(){
        return this.endDate;
    }
    
    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }
    
    public int getUserId(){
        return this.userId;
    }
    
    public void setUserId(int userId){
        this.userId = userId;
    }
    
//    public List<Category> getCategories(){
//        return this.categories;
//    }
//    
//    public void setCategory(List<Category> categories){
//        this.categories = categories;
//    }    
//    
//    public boolean getPersonal(){
//        return this.personal;
//    }
//    
//    public void setPersonal(boolean personal){
//        this.personal = personal;
//    }
    
}