package asw1009.viewmodel.request;

/**
 * View Model di richiesta di modifica utente.
 *
 * @author ASW1009
 */
public class EditUserRequestViewModel {

    private String username;
    private String oldPassword;
    private String newPassword;
    private String firstName;
    private String lastName;
    private String email;
    private String picture;

    /**
     * Restituisce lo username dell'utente che richiede la modifica utente.
     * @return Stringa descrivente lo username dell'utente.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Imposta lo username dell'utente che invia la request di modifica.
     * @param username Stringa rappresentante lo username dell'utente.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Restituisce la password utilizzata precedentemente alla richiesta di modifica da parte dell'utente.
     * @return Stringa descrivente la vecchia password dell'utente.
     */
    public String getOldPassword() {
        return this.oldPassword;
    }

    /**
     * Imposta la vecchia password utilizzata dall'utente.
     * @param oldPassword Stringa rappresentante la vecchia password dell'utente.
     */
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    /**
     * Restituisce la nuova password richiesta dall'utente.
     * @return Strisca rappresentante la nuova password dell'utente.
     */
    public String getNewPassword() {
        return this.newPassword;
    }

    /**
     * Imposta la nuova password dell'utente.
     * @param newPassword Stringa rappresentante la nuova password dell'utente.
     */
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    /**
     * Restituisce il nome dell'utente richiedente la modifica.
     * @return Stringa rappresentante il nome dell'utente.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Imposta il nome dell'utente da modificare.
     * @param firstName Stringa rappresentante il nome dell'utente.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Restituisce il cognome dell'utente richiedente la modifica.
     * @return Stringa rappresentante il cognome dell'utente.
     */
    public String getLastName() {
        return this.lastName;
    }

    /** 
     * Imposta il cognome dell'utente da modificare.
     * @param lastName Stringa rappresentante il cognome dell'utente.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Restituisce l'indirizzo email dell'utente.
     * @return Stringa rappresentante l'indirizzo email dell'utente.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Imposta l'indirizzo email dell'utente.
     * @param email Stringa rappresentante l'indirizzo email dell'utente.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Restituisce l'immagine dell'utente.
     * @return Stringa rappresentante il percorso dell'immagine utente.
     */
    public String getPicture() {
        return this.picture;
    }

    /**
     * Imposta l'immagine dell'utente.
     * @param picture Stringa rappresentante il percorso dell'immagine dell'utente.
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }
}
