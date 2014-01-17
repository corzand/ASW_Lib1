package asw1009.responses;

import asw1009.model.entities.User;
import asw1009.model.entities.PublicUser;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * Risposta del servizio che restituisce la lista degli utenti.
 *
 * @author ASW1009
 */
@XmlRootElement(name="data")
@XmlAccessorType(XmlAccessType.FIELD)
public class UsersListResponse extends BaseResponse {
    private List<PublicUser> users;
    /**
     * Imposta la lista di utenti.
     * @param users Lista di oggetti User.
     */
    public void setUsers(List<User> users){
        this.users = new ArrayList<>();
        for(User user : users){
            this.users.add(new PublicUser(user));
        }
    }
    /**
     * Restituisce la lista di utenti.
     * @return Lista di oggetti User descriventi l'elenco degli utenti.
     */
    public List<PublicUser> getUsers(){
        return this.users;
    }
}