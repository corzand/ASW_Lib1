package asw1009.viewmodel.response;

import asw1009.model.entities.User;
/**
 * View Model di risposta di Login Utente.
 *
 * @author ASW1009
 */
public class LoginResponseViewModel extends BaseResponseViewModel {
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
