package asw1009.viewmodel.response;

import asw1009.model.entities.Task;

public class AddTaskResponseViewModel extends BaseResponseViewModel {
    private Task task;
    
    public Task getTask(){
        return this.task;
    }
    
    public void setTask(Task task){
        this.task = task;
    }
}
