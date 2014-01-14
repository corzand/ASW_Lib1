package asw1009.responses;
/**
 * Classe base, contiene informazioni comuni ad ogni Response
 *
 * @author ASW1009
 */
public class BaseResponse {
    private boolean error;
    private String errorMessage;
    
    /**
     * Restituisce la presenza di errori.
     * @return Booleano impostato a true in caso di errori nella risposta.
     */
    public boolean hasError(){
        return this.error;
    }
    /**
     * Imposta la presenza di errori.
     * @param error Booleano che rappresenta la presenza di errori. 
     */
    public void setError(boolean error){
        this.error = error;
    }
    /**
     * Restituisce, in caso sia presente, un messaggio di errore.
     * @return Stringa rappresentante il messaggio di errore.
     */
    public String getErrorMessage(){
        return this.errorMessage;
    }
    /**
     * Imposta il messaggio di errore nella risposta.
     * @param errorMessage Stringa descrivente il messaggio di errore.
     */
    public void setErrorMessage(String errorMessage){
        this.errorMessage = errorMessage;
    }
}
