package asw1009.model.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entità rappresentante l'utente.
 *
 * @author ASW1009
 */

@XmlAccessorType(XmlAccessType.FIELD) 
@XmlRootElement(name="User")
public class User  {    
    
    private int id;    
    private String username;
    private String picture;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    
    
    /**
     * Costruttore di classe.
     */
    public User(){
        super();
        this.id = 0;
        this.username = "";
        this.picture = "";
        this.firstName = "";   
        this.lastName = "";
        this.password ="";
        this.email="";
    }
    
        /**
     * Restituisce l'identificativo dell'utente.
     * @return Identificato dell'utente.
     */
    public int getId(){
        return this.id;
    }
    
    /**
     * Imposta l'identificativo dell'utente.
     * @param id Identificativo da associare all'utente.
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * Restituisce l'username dell'utente.
     * @return Username dell'utente.
     */
    public String getUsername(){
        return this.username;
    }
    
    /**
     * Imposta l'username dell'utente.
     * @param username Username da associare all'utente.
     */
    public void setUsername(String username){
        this.username = username;
    }
    
    /**
     * Restituisce il percorso dell'immagine dell'utente.
     * @return Percorso dell'immagine associata all'utente.
     */
    public String getPicture(){
        return this.picture;
    }
    
    /**
     * Imposta il percorso dell'immagine dell'utente.
     * @param picture Percorso dell'immagine da associare all'utente.
     */
    public void setPicture(String picture){
        this.picture = picture;
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
