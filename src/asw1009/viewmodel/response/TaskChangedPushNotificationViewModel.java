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
public class TaskChangedPushNotificationViewModel {
    int operation;
    private Task task;
    
    public TaskChangedPushNotificationViewModel(int operation, Task task){
        this.operation = operation;
        this.task = task;
    }
    
}
