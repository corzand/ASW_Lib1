package asw1009.viewmodel.request;

/**
 * View Model di richiesta di login utente.
 *
 * @author ASW1009
 */
public class LoginRequestViewModel {

    private String username;
    private String password;
    private String remember;

    /**
     * Restituisce lo username dell'utente che richiede l'accesso.
     *
     * @return Stringa descrivente lo username dell'utente.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Imposta lo username dell'utente che richiede l'accesso.
     *
     * @param username Stringa rappresentante lo username dell'utente.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Restituisce la password dell'utente che richiede l'accesso.
     *
     * @return Stringa descrivente la password dell'utente.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Imposta la password dell'utente che richiede l'accesso.
     *
     * @param password Stringa rappresentante la password dell'utente.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public void setRemember(String remember) {
        this.remember = remember;
    }

    public String getRemember() {
        return this.remember;
    }
}
