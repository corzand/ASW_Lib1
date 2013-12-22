/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asw1009.models.response;

/**
 *
 * @author Andrea
 */
public class BaseResponseViewModel {
    private boolean error;
    private String errorMessage;
    
    public boolean isError(){
        return this.error;
    }
    
    public void setError(boolean error){
        this.error = error;
    }
    
    public String getErrorMessage(){
        return this.errorMessage;
    }
    
    public void setErrorMessage(String errorMessage){
        this.errorMessage = errorMessage;
    }
}
