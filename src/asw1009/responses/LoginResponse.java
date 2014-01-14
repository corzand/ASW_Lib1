package asw1009.responses;

import asw1009.model.entities.User;
/**
 * Risposta del servizio di Login.
 *
 * @author ASW1009
 */
public class LoginResponse extends BaseResponse {
    private User loggedUser;
    /**
     * Restituisce l'oggetto User loggato.
     *
     * @return Oggetto User rappresentante l'utente loggato.
     */
    public User getLoggedUser(){
        return this.loggedUser;
    }
    /**
     * Imposta l'oggetto User loggato.
     *
     * @param loggedUser User rappresentante l'utente loggato.
     */
    public void setLoggedUser(User loggedUser){
        this.loggedUser = loggedUser;
    }
}
