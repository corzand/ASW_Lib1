/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asw1009.viewmodel.response;

import asw1009.model.entities.User;


/**
 *
 * @author Andrea
 */
public class LoginResponseViewModel extends BaseResponseViewModel {
    private User loggedUser;
    
    public User getLoggedUser(){
        return this.loggedUser;
    }
    
    public void setLoggedUser(User loggedUser){
        this.loggedUser = loggedUser;
    }
}
