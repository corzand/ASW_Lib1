package asw1009.model.entities;

import java.util.Date;

/**
 * Entità rappresentante un singolo task.
 *
 * @author ASW1009
 */
public class Task {

    private int id;
    private String title;
    private String description;
    private Date date;
    private boolean done;
    private int userId;
    private int categoryId;
    private double latitude;
    private double longitude;
    private boolean personal;
    private int assignedUserId;
    private String attachment;
    private long timeStamp;

    /**
     * Costruttore di classe
     */
    public Task() {
        this.id = 0;
        this.title = "";
        this.description = "";
        this.date = new Date();
        this.done = false;
        this.userId = -1;
        this.categoryId = -1;
        this.latitude = 0;
        this.longitude = 0;
        this.personal = true;
        this.assignedUserId = -1;
    }

    /**
     * Restituisce l'identificativo progressivo del task.
     *
     * @return Identificativo del task.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Imposta l'identificativo del task.
     *
     * @param id Intero rappresentante l'identificativo del task.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Restituisce il titolo del task.
     *
     * @return Stringa rappresentante il titolo del task.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Imposta il titolo del task.
     *
     * @param title Stringa rappresentante il titolo del task.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Restituisce una descrizione del task.
     *
     * @return Stringa rappresentante la descrizione del task.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Imposta la descrizione del task.
     *
     * @param description Stringa rappresentante la descrizione del task.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Restituisce la data di validità del task.
     *
     * @return Data rappresentante la data di validità del task.
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Imposta la data di validità del task.
     *
     * @param date Data rappresentante la data di validità del task.
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
    /**
     * Restituisce l'avvenuta esecuzione del task.
     * @return Booleano rappresentante l'esecuzione del task.
     */
    public boolean getDone() {
        return this.done;
    }

    /**
     * Imposta l'avvenuta esecuzione del task.
     * @param done Booleano rappresentante l'esecuzione del task.
     */
    public void setDone(boolean done) {
        this.done = done;
    }

    /**
     * Restituisce l'utente creatore del task.
     * @return Identificativo dell'utente che ha creato il task.
     */
    public int getUserId() {
        return this.userId;
    }

    /**
     * Imposta l'utente creatore del task.
     * @param userId Identificativo dell'utente creatore del task.
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /** 
     * Restituisce la categoria a cui il task deve essere associato.
     * @return Identificativo della categoria di appartenenza del task.
     */
    public int getCategoryId() {
        return this.categoryId;
    }
    
    /**
     * Imposta la categoria a cui il task deve essere associato.
     * @param categoryId Identificativo della categoria da associare al task.
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    
    /**
     * Restituisce la latitudine del luogo dove il task deve essere svolto.
     * @return Latitudine del luogo di esecuzione del task.
     */
    public double getLatitude() {
        return this.latitude;
    }
    
    /**
     * Imposta la latitudine del luogo dove il task deve essere svolto.
     * @param latitude Latitudine del luogo di esecuzione del task.
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

     /**
     * Restituisce la longitudine del luogo dove il task deve essere svolto.
     * @return Longitudine del luogo di esecuzione del task.
     */
    public double getLongitude() {
        return this.longitude;
    }

    /**
     * Imposta la longitudine del luogo dove il task deve essere svolto.
     * @param longitude Longitudine del luogo di esecuzione del task.
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Restituisce il percorso del file allegato al task.
     * @return String del percorso del file allegato al task.
     */
    public String getAttachment() {
        return this.attachment;
    }
    
    /**
     * Imposta il percorso del file da allegare al task.
     * @param attachment Percorso del file da allegare al task.
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    /**
     * Restituisce l'utente a cui è assegnato il task.
     * @return Identificativo dell'utente a cui è assegnato il task.
     */
    public int getAssignedUserId() {
        return this.assignedUserId;
    }

    /**
     * Imposta l'utente a cui si intende assegnare il task.
     * @param assignedUserId Identificativo dell'utente da assegnare al task.
     */
    public void setAssignedUserId(int assignedUserId) {
        this.assignedUserId = assignedUserId;
    }

    /**
     * Restituisce informazioni riguardanti la pubblicità del task.
     * @return Booleano rappresentante un task è pubblico o privato (true = privato).
     */
    public boolean getPersonal() {
        return this.personal;
    }

    /**
     * Imposta il task a privato o pubblico.
     * @param personal Booleano rappresentante un task è pubblico o privato (true = privato).
     */
    public void setPersonal(boolean personal) {
        this.personal = personal;
    }

    /**
     * Restituisce il time-stamp dell'ultima modifica eseguita con successo.
     * @return Time-stamp dell'ultima modifica.
     */
    public long getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * Imposta il time-stamp dell'ultima modifica eseguita con successo.
     * @param timeStamp Time-stamp da associare al task relativo all'ultima modifica.
     */
    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
