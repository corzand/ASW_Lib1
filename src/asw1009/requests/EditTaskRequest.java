package asw1009.requests;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Richiesta di modifica Task.
 *
 * @author ASW1009
 */
@XmlRootElement(name="data")
@XmlAccessorType(XmlAccessType.FIELD)
public class EditTaskRequest {

    private int id;
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
     * Restituisce l'identificativo progressivo del task da modificare.
     *
     * @return Identificativo del task da modificare.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Imposta l'identificativo progressivo del task da modificare.
     *
     * @param id Identificativo del task da modificare.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Restituisce l'utente che richiede la modifica del task.
     *
     * @return Identificativo dell'utente che richiede la modifica del task.
     */
    public int getUserId() {
        return this.userId;
    }

    /**
     * Imposta l'utente che richiede la modifica del task.
     *
     * @param userId Identificativo dell'utente che richiede la modifica del task.
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Restituisce il titolo del task da modificare.
     *
     * @return Stringa rappresentante il titolo del task da modificare.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Imposta il titolo del task da modificare.
     *
     * @param title Stringa rappresentante il titolo del task da modificare.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Restituisce una descrizione del task da modificare.
     *
     * @return Stringa rappresentante la descrizione del task da modificare.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Imposta la descrizione del task da modificare.
     *
     * @param description Stringa rappresentante la descrizione del task da
     * modificare.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Restituisce la data di validità del task da modificare.
     *
     * @return Date rappresentante la data di validità del task da modificare.
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Imposta la data di validità del task da modificare.
     *
     * @param date Date rappresentante la data di validità del task da
     * modificare.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Restituisce l'avvenuta esecuzione del task da modificare.
     *
     * @return Booleano rappresentante l'esecuzione del task da modificare.
     */
    public boolean getDone() {
        return this.done;
    }

    /**
     * Imposta l'avvenuta esecuzione del task da modificare.
     *
     * @param done Booleano rappresentante l'esecuzione del task da modificare.
     */
    public void setDone(boolean done) {
        this.done = done;
    }

    /**
     * Restituisce la categoria a cui il task da modificare deve essere
     * associato.
     *
     * @return Intero identificativo della categoria di appartenenza del task da
     * modificare.
     */
    public int getCategoryId() {
        return this.categoryId;
    }

    /**
     * Imposta la categoria a cui il task da modificare deve essere associato.
     *
     * @param categoryId Intero identificativo della categoria da associare al
     * task da modificare.
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * Restituisce la latitudine del luogo dove il task da modificare deve
     * essere svolto.
     *
     * @return Latitudine del luogo di esecuzione del task da modificare.
     */
    public double getLatitude() {
        return this.latitude;
    }

    /**
     * Imposta la latitudine del luogo dove il task da modificare deve essere
     * svolto.
     *
     * @param latitude Latitudine del luogo di esecuzione del task da
     * modificare.
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Restituisce la longitudine del luogo dove il task da modificare deve
     * essere svolto.
     *
     * @return Longitudine del luogo di esecuzione del task da modificare.
     */
    public double getLongitude() {
        return this.longitude;
    }

    /**
     * Imposta la longitudine del luogo dove il task da modificare deve essere
     * svolto.
     *
     * @param longitude Longitudine del luogo di esecuzione del task da
     * modificare.
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Restituisce il percorso del file allegato al task da modificare.
     *
     * @return String del percorso del file allegato al task da modificare.
     */
    public String getAttachment() {
        return this.attachment;
    }

    /**
     * Imposta il percorso del file da allegare al task da modificare.
     *
     * @param attachment Percorso del file da allegare al task da modificare.
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    /**
     * Restituisce l'utente a cui è assegnato il task da modificare.
     *
     * @return Identificativo dell'utente a cui è assegnato il task da
     * modificare.
     */
    public int getAssignedUserId() {
        return this.assignedUserId;
    }

    /**
     * Imposta l'utente a cui si intende assegnare il task da modificare.
     *
     * @param assignedUserId Identificativo dell'utente da assegnare al task da
     * modificare.
     */
    public void setAssignedUserId(int assignedUserId) {
        this.assignedUserId = assignedUserId;
    }

    /**
     * Restituisce informazioni riguardanti la pubblicità del task da
     * modificare.
     *
     * @return Booleano rappresentante un task è pubblico o privato (true =
     * privato).
     */
    public boolean getPersonal() {
        return this.personal;
    }

    /**
     * Imposta il task da modificare a privato o pubblico.
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
