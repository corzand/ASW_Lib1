package asw1009.requests;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Richiesta di login utente.
 *
 * @author ASW1009
 */
@XmlRootElement(name="login")
@XmlAccessorType(XmlAccessType.FIELD)
public class LoginRequest {

    private String username;
    private String password;
    private boolean remember;

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

    /**
     * Imposta la scelta dell'utente di ricevere o meno cookie per memorizzare username
     * e password
     * @param remember booleano che esprime la scelta dell'utente
     */
    public void setRemember(boolean remember) {
        this.remember = remember;
    }

    /**
     * Ritorna la scelta dell'utente di ricevere o meno cookie per memorizzare username e password
     * @return booleano di scelta
     */
    public boolean getRemember() {
        return this.remember;
    }
}
