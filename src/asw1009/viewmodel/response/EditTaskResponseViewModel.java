package asw1009.viewmodel.response;

import asw1009.model.entities.Task;

/**
 * View Model di risposta di modifica Task.
 *
 * @author ASW1009
 */
public class EditTaskResponseViewModel extends BaseResponseViewModel {

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
