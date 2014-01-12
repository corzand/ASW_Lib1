package asw1009.model.entities;

/**
 * Entità rappresentante l'utente.
 *
 * @author ASW1009
 */
public class User extends UserBase {
    
    
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    
    /**
     * Costruttore di classe.
     */
    public User(){
        super();
        this.firstName = "";   
        this.lastName = "";
        this.password ="";
        this.email="";
    }
    
    /**
     * Restituisce il nome dell'utente.
     * @return Nome dell'utente.
     */
    public String getFirstName(){
        return this.firstName;
    }
    
    /**
     * Imposta il nome dell'utente.
     * @param firstName Nome da associare all'utente.
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    /**
     * Restituisce la password dell'utente.
     * @return Password dell'utente.
     */
    public String getPassword(){
        return this.password;
    }
    
    /**
     * Imposta la password dell'utente.
     * @param password Password da assegnare all'utente.
     */
    public void setPassword(String password){
        this.password = password;
    }
    
    /**
     * Restituisce il cognome dell'utente.
     * @return Cognome dell'utente.
     */
    public String getLastName(){
        return this.lastName;
    }
    
    /**
     * Imposta il cognome dell'utente.
     * @param lastName Cognome da associare all'utente.
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    /**
     * Restituisce l'indirizzo email dell'utente.
     * @return Indirizzo email dell'utente.
     */
    public String getEmail(){
        return this.email;
    }
    
    /**
     * Imposta l'indirizzo email dell'utente.
     * @param email Indirizzo email da associare all'utente.
     */
    public void setEmail(String email){
        this.email = email;
    }
    
    
}
