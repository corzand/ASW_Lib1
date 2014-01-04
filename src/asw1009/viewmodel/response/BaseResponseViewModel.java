package asw1009.viewmodel.response;

public class BaseResponseViewModel {
    private boolean error;
    private String errorMessage;
    
    public boolean hasError(){
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
