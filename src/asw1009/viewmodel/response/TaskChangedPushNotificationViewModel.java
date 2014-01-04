package asw1009.viewmodel.response;

import asw1009.model.entities.Task;

public class TaskChangedPushNotificationViewModel {
    int operation;
    private Task task;
    
    public TaskChangedPushNotificationViewModel(int operation, Task task){
        this.operation = operation;
        this.task = task;
    }
    
}
