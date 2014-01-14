package asw1009.requests;

import java.util.Date;

/**
 * Richiesta di ricerca Task.
 *
 * @author ASW1009
 */
public class SearchTasksRequest {

    private Date startDate;
    private Date endDate;
    private int userId;

    /**
     * Restituisce la data di inizio ricerca del task.
     *
     * @return Date rappresentante la data di inizio ricerca.
     */
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * Imposta la data di inizio ricerca del task.
     *
     * @param startDate Date rappresentante la data di inizio ricerca.
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Restituisce la data di fine ricerca del task.
     *
     * @return Date rappresentante la data di fine ricerca.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Imposta la data di fine ricerca del task.
     *
     * @param endDate Date rappresentante la data di fine ricerca.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * Restituisce l'id dell'utente che richiede la ricerca.
     *
     * @return Intero rappresentante l'id dell'utente che esegue la ricerca.
     */
    public int getUserId() {
        return this.userId;
    }

    /**
     * Imposta l'id dell'utente che richiede la ricerca.
     *
     * @param userId Intero rappresentante l'id dell'utente che esegue la ricerca.
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

}
