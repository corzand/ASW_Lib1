package asw1009.responses;

import asw1009.model.entities.Task;
/**
 * Risposta al long polling che contiene una notifica push di cambiamento task.
 *
 * @author ASW1009
 */
public class LongPollingResponse {
    int operation;
    private Task task;
    
    /**
     * Costruttore di classe
     * @param operation Intero rappresentante il tipo di operazione.
     * @param task Oggetto task rappresentante il task soggetto a modifica.
     */
    public LongPollingResponse(int operation, Task task){
        this.operation = operation;
        this.task = task;
    }
    
}
