/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asw1009.viewmodel.response;

import asw1009.model.entities.Task;


/**
 *
 * @author Andrea
 */
public class DeleteTaskResponseViewModel extends BaseResponseViewModel {
    private Task task;
    
    public Task getTask(){
        return this.task;
    }
    
    public void setTask(Task task){
        this.task = task;
    }
}
