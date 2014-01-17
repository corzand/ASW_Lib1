/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asw1009.model.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizzata nella serializzazione/deserializzazione degli Utenti
 * su file xml.
 * @author Andrea
 */
@XmlRootElement(name = "Users")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserList {
    @XmlElement(name = "User", type = User.class)
    List<User> users;
    int progId;

    /**
     * Costruttore di default per l'oggetto, inizializza il progressivo a zero e 
     * l'array vuoto
     */
    public UserList() {
        this.progId = 0;
        this.users = new ArrayList<>();
    }    
    
    /**
     * Restituisce la lista degli utenti
     * @return lista utenti
     */
    public List<User> getList() {
        return users;
    }
    
    /**
     * Setta la lista dei tasks
     * @param users lista deei tasks
     */
    public void setList(List<User> users) {
        this.users = users;
    }
    
    /**
     * Metodo utilizzato per ottenere il nuovo identificatore progressivo.
     *
     * @return nuovo identificatore progressivo
     */
    public int getNextId() {
        progId = progId + 1;
        return progId;
    }
}
