package asw1009.viewmodel.response;

import asw1009.model.entities.Task;
/**
 * View Model di risposta di aggiunta Task.
 *
 * @author ASW1009
 */
public class AddTaskResponseViewModel extends BaseResponseViewModel {
    private Task task;
    
    /**
     * Restituisce l'oggetto task aggiunto.
     * @return Oggetto Task rappresentante il task aggiunto.
     */
    public Task getTask(){
        return this.task;
    }
    
    /**
     * Imposta il task aggiunto in risposta.
     * @param task Oggetto Task rappresentante il task aggiunto.
     */
    public void setTask(Task task){
        this.task = task;
    }
}
