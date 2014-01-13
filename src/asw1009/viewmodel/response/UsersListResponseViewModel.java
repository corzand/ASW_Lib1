package asw1009.viewmodel.response;

import asw1009.model.entities.User;
import asw1009.model.entities.UserBase;
import java.util.ArrayList;
import java.util.List;
/**
 * View Model di risposta a richiesta di lista utenti.
 *
 * @author ASW1009
 */
public class UsersListResponseViewModel extends BaseResponseViewModel {
    private List<UserBase> users;
    /**
     * Imposta la lista di utenti.
     * @param users Lista di oggetti User.
     */
    public void setUsers(List<User> users){
        this.users = new ArrayList<>();
        for(User user : users){
            this.users.add((UserBase)user);
        }
    }
    /**
     * Restituisce la lista di utenti.
     * @return Lista di oggetti User descriventi l'elenco degli utenti.
     */
    public List<UserBase> getUsers(){
        return this.users;
    }
}