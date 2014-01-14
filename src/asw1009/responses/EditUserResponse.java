package asw1009.responses;

import asw1009.model.entities.User;

/**
 * Risposta del servizio che permette la modifica Utente.
 *
 * @author ASW1009
 */
public class EditUserResponse extends BaseResponse {

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
