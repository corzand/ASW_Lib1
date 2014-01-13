package asw1009.viewmodel.request;

/**
 * View Model di richiesta di eliminazione Task.
 *
 * @author ASW1009
 */
public class DeleteTaskRequestViewModel {

    private int id;
    private long timeStamp;
    private int userId;

    /**
     * Restituisce l'identificativo progressivo del task da eliminare.
     *
     * @return Identificativo del task da eliminare.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Imposta l'identificativo progressivo del task da eliminare.
     *
     * @param id Identificativo del task da eliminare.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Restituisce il time-stamp dell'ultima modifica eseguita con successo.
     *
     * @return Time-stamp dell'ultima modifica.
     */
    public long getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * Imposta il time-stamp dell'ultima modifica eseguita con successo.
     *
     * @param timeStamp Time-stamp da associare al task relativo all'ultima
     * modifica.
     */
    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * Restituisce l'utente che richiedere l'eliminazione del task.
     *
     * @return Identificativo dell'utente che richiede l'eliminazione del task.
     */
    public int getUserId() {
        return this.userId;
    }

    /**
     * Imposta l'utente che richiede l'eliminazione del task.
     *
     * @param userId Identificativo dell'utente che richiede l'eliminazione del task.
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }
}
