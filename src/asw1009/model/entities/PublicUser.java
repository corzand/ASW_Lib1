
package asw1009.model.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Entità rappresentante le informazioni base di un utente, visibili a tutti.
 *
 * @author ASW1009
 */
@XmlAccessorType(XmlAccessType.FIELD) 
public class PublicUser {
    private int id;    
    private String username;
    private String picture;

    /**
     * Costruttore di classe, parte sempre da un oggetto User e ne ricava
     * solo i campi visibili a tutti.
     * @param u utente "sorgente"
     */
    public PublicUser(User u) {
        this.id = u.getId();
        this.username = u.getUsername();
        this.picture = u.getPicture();
    }    
}
