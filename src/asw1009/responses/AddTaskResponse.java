package asw1009.responses;

import asw1009.model.entities.Task;
/**
 * Risposta del servizio di aggiunta Task.
 *
 * @author ASW1009
 */
public class AddTaskResponse extends BaseResponse {
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
