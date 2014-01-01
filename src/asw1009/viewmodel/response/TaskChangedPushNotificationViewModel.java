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
    private boolean isNew;
    private Task task;
    
    public TaskChangedPushNotificationViewModel(boolean isNew, Task task){
        this.isNew = isNew;
        this.task = task;
    }
}
