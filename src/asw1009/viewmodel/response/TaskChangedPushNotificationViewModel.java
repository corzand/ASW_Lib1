package asw1009.viewmodel.response;

import asw1009.model.entities.Task;
/**
 * View Model di risposta di notifica push di cambiamento task.
 *
 * @author ASW1009
 */
public class TaskChangedPushNotificationViewModel {
    int operation;
    private Task task;
    
    /**
     * Costruttore di classe
     * @param operation Intero rappresentante il tipo di operazione.
     * @param task Oggetto task rappresentante il task soggetto a modifica.
     */
    public TaskChangedPushNotificationViewModel(int operation, Task task){
        this.operation = operation;
        this.task = task;
    }
    
}
