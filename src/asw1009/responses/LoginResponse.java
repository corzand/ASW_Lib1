package asw1009.responses;

import asw1009.model.entities.User;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * Risposta del servizio di Login.
 *
 * @author ASW1009
 */
@XmlRootElement(name="data")
@XmlAccessorType(XmlAccessType.FIELD)
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
