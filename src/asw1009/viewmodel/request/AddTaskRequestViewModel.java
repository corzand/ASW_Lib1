package asw1009.viewmodel.request;

import java.util.Date;

/**
 * View Model di richiesta di aggiunta Task.
 *
 * @author ASW1009
 */
public class AddTaskRequestViewModel {

    private String title;
    private String description;
    private Date date;
    private boolean done;
    private int categoryId;
    private int userId;
    private double latitude;
    private double longitude;
    private boolean personal;
    private int assignedUserId;
    private String attachment;
    private long timeStamp;

    /**
     * Restituisce l'id dell'utente che ha creato il task.
     * @return Intero rappresentante l'identificativo dell'utente creatore del task.
     */
    public int getUserId() {
        return this.userId;
    }

    /**
     * Imposta l'id dell'utente creatore del task.
     * @param userId Intero rappresentante l'identificativo del'utente creatore del task.
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Restituisce il titolo del task da aggiungere.
     *
     * @return Stringa rappresentante il titolo del task da aggiungere.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Imposta il titolo del task da aggiungere.
     *
     * @param title Stringa rappresentante il titolo del task da aggiungere.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Restituisce una descrizione del task da aggiungere.
     *
     * @return Stringa rappresentante la descrizione del task da aggiungere.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Imposta la descrizione del task da aggiungere.
     *
     * @param description Stringa rappresentante la descrizione del task da aggiungere.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Restituisce la data di validità del task da aggiungere.
     *
     * @return Date rappresentante la data di validità del task da aggiungere.
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Imposta la data di validità del task da aggiungere.
     *
     * @param date Date rappresentante la data di validità del task da aggiungere.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Restituisce l'avvenuta esecuzione del task da aggiungere.
     *
     * @return Booleano rappresentante l'esecuzione del task da aggiungere.
     */
    public boolean getDone() {
        return this.done;
    }

    /**
     * Imposta l'avvenuta esecuzione del task da aggiungere.
     *
     * @param done Booleano rappresentante l'esecuzione del task da aggiungere.
     */
    public void setDone(boolean done) {
        this.done = done;
    }

    /**
     * Restituisce la categoria a cui il task da aggiungere deve essere associato.
     *
     * @return Intero identificativo della categoria di appartenenza del task da aggiungere.
     */
    public int getCategoryId() {
        return this.categoryId;
    }

    /**
     * Imposta la categoria a cui il task da aggiungere deve essere associato.
     *
     * @param categoryId Intero identificativo della categoria da associare al task da aggiungere.
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * Restituisce la latitudine del luogo dove il task da aggiungere deve essere svolto.
     *
     * @return Latitudine del luogo di esecuzione del task da aggiungere.
     */
    public double getLatitude() {
        return this.latitude;
    }

    /**
     * Imposta la latitudine del luogo dove il task da aggiungere deve essere svolto.
     *
     * @param latitude Latitudine del luogo di esecuzione del task da aggiungere.
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Restituisce la longitudine del luogo dove il task da aggiungere deve essere svolto.
     *
     * @return Longitudine del luogo di esecuzione del task da aggiungere.
     */
    public double getLongitude() {
        return this.longitude;
    }

    /**
     * Imposta la longitudine del luogo dove il task da aggiungere deve essere svolto.
     *
     * @param longitude Longitudine del luogo di esecuzione del task da aggiungere.
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Restituisce il percorso del file allegato al task da aggiungere.
     *
     * @return String del percorso del file allegato al task da aggiungere.
     */
    public String getAttachment() {
        return this.attachment;
    }

    /**
     * Imposta il percorso del file da allegare al task da aggiungere.
     *
     * @param attachment Percorso del file da allegare al task da aggiungere.
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    /**
     * Restituisce l'utente a cui è assegnato il task da aggiungere.
     *
     * @return Identificativo dell'utente a cui è assegnato il task da aggiungere.
     */
    public int getAssignedUserId() {
        return this.assignedUserId;
    }

    /**
     * Imposta l'utente a cui si intende assegnare il task da aggiungere.
     *
     * @param assignedUserId Identificativo dell'utente da assegnare al task da aggiungere.
     */
    public void setAssignedUserId(int assignedUserId) {
        this.assignedUserId = assignedUserId;
    }

    /**
     * Restituisce informazioni riguardanti la pubblicità del task da aggiungere.
     *
     * @return Booleano rappresentante un task è pubblico o privato (true =
     * privato).
     */
    public boolean getPersonal() {
        return this.personal;
    }

    /**
     * Imposta il task da aggiungere a privato o pubblico.
     *
     * @param personal Booleano rappresentante un task è pubblico o privato
     * (true = privato).
     */
    public void setPersonal(boolean personal) {
        this.personal = personal;
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
}
