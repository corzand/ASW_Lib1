/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asw1009.viewmodel.response;

import asw1009.model.entities.Task;
import java.util.List;

/**
 *
 * @author Andrea
 */
public class SearchTasksResponseViewModel extends BaseResponseViewModel {
    private List<Task> tasks;
    
    public void setTasks(List<Task> tasks){
        this.tasks = tasks;
    }
    
    public List<Task> getTasks(){
        return this.tasks;
    }
}
