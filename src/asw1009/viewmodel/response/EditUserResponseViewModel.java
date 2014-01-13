package asw1009.viewmodel.response;

import asw1009.model.entities.User;

/**
 * View Model di risposta di modifica Utente.
 *
 * @author ASW1009
 */
public class EditUserResponseViewModel extends BaseResponseViewModel {

    private User loggedUser;

    /**
     * Restituisce l'oggetto User modificato.
     *
     * @return Oggetto User rappresentante l'utente modificato.
     */
    public User getLoggedUser() {
        return this.loggedUser;
    }

    /**
     * Imposta l'oggetto User modificato.
     *
     * @param loggedUser Oggetto User rappresentante l'utente modificato.
     */
    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }
}
