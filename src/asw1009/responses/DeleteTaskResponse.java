package asw1009.responses;

import asw1009.model.entities.Task;

/**
 * Risposta del servizio di eliminazione Task.
 *
 * @author ASW1009
 */
public class DeleteTaskResponse extends BaseResponse {

    private Task task;

    /**
     * Restituisce l'oggetto task eliminato.
     * @return Oggetto Task rappresentante il task eliminato.
     */
    public Task getTask() {
        return this.task;
    }
    /**
     * Imposta il task eliminato in risposta.
     * @param task Oggetto Task rappresentante il task eliminato.
     */
    public void setTask(Task task) {
        this.task = task;
    }
}
