package asw1009.responses;

import asw1009.model.entities.Task;

/**
 * Risposta del servizio di modifica Task.
 *
 * @author ASW1009
 */
public class EditTaskResponse extends BaseResponse {

    private Task task;

    /**
     * Restituisce l'oggetto task modificato.
     *
     * @return Oggetto Task rappresentante il task modificato.
     */
    public Task getTask() {
        return this.task;
    }

    /**
     * Imposta l'oggetto task modificato.
     *
     * @param task Oggetto Task rappresentante il task modificato.
     */
    public void setTask(Task task) {
        this.task = task;
    }
}
