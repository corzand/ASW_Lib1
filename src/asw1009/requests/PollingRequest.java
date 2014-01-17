package asw1009.requests;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Richiesta di ricerca Task.
 *
 * @author ASW1009
 */
@XmlRootElement(name="data")
@XmlAccessorType(XmlAccessType.FIELD)
public class PollingRequest {

    private Date startDate;
    private Date endDate;
    private int userId;
    private int[] taskIds;
    
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

    /**
     * Restituisce l'insieme degli id dei task a cui l'utente si è sottoscritto
     * @return l'insieme degli id dei task a cui l'utente si è sottoscritto
     */
    public int[] getTaskIds() {
        return this.taskIds;
    }

    /**
     * Imposta l'insieme degli id dei task a cui l'utente si è sottoscritto
     * 
     * @param taskIds Intero rappresentante l'id dell'utente che esegue la ricerca.
     */
    public void setTaskIds(int[] taskIds) {
        this.taskIds = taskIds;
    }
}
