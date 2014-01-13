package asw1009.viewmodel.request;

/**
 * View Model di richiesta di registrazione utente.
 *
 * @author ASW1009
 */
public class SignUpRequestViewModel {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

    /**
     * Restituisce lo username dell'utente che richiede la registrazione.
     *
     * @return Stringa descrivente lo username dell'utente.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Imposta lo username dell'utente che invia la request di registrazione.
     *
     * @param username Stringa rappresentante lo username dell'utente.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Restituisce la password richiesta dall'utente in fase di registrazione.
     *
     * @return Stringa descrivente la password dell'utente.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Imposta la password richiesta dall'utente in fase di registrazione
     *
     * @param password Stringa descrivente la password dell'utente.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Restituisce il nome dell'utente richiedente la registrazione.
     *
     * @return Stringa rappresentante il nome dell'utente.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Imposta il nome dell'utente richiedente la registrazione.
     *
     * @param firstName Stringa rappresentante il nome dell'utente.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Restituisce il cognome dell'utente richiedente la registrazione.
     *
     * @return Stringa rappresentante il cognome dell'utente.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Imposta il cognome dell'utente richiedente la registrazione.
     *
     * @param lastName Stringa rappresentante il cognome dell'utente.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Restituisce l'indirizzo email dell'utente.
     *
     * @return Stringa rappresentante l'indirizzo email dell'utente.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Imposta l'indirizzo email dell'utente.
     *
     * @param email Stringa rappresentante l'indirizzo email dell'utente.
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
