package asw1009.viewmodel.response;

import asw1009.model.entities.Category;
import asw1009.model.entities.User;
import asw1009.model.entities.UserBase;
import java.util.ArrayList;
import java.util.List;

public class UsersListResponseViewModel extends BaseResponseViewModel {
    private List<UserBase> users;
    
    public void setUsers(List<User> users){
        this.users = new ArrayList<>();
        for(User user : users){
            this.users.add((UserBase)user);
        }
    }
    
    public List<UserBase> getUsers(){
        return this.users;
    }
}