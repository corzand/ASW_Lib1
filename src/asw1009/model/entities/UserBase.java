
package asw1009.model.entities;

/**
 * Entità rappresentante le informazioni base di un utente, visibili a tutti.
 *
 * @author ASW1009
 */
public class UserBase {
    private int id;    
    private String username;
    private String picture;

    /**
     * Costruttore di classe.
     */
    public UserBase() {
        this.id = 0;
        this.username = "";
        this.picture = "";
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
    
}
