package asw1009.viewmodel.response;

import asw1009.model.entities.User;

public class LoginResponseViewModel extends BaseResponseViewModel {
    private User loggedUser;
    
    public User getLoggedUser(){
        return this.loggedUser;
    }
    
    public void setLoggedUser(User loggedUser){
        this.loggedUser = loggedUser;
    }
}
