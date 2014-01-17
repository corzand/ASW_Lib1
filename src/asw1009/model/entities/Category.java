package asw1009.model.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entità rappresentante una categoria alla quale può essere associato un task.
 *
 * @author ASW1009
 */
@XmlAccessorType(XmlAccessType.FIELD) 
@XmlRootElement(name="Category")
public class Category {

    private int id;
    private String title;
    private boolean state;
    private String color;

    /**
     * Costruttore di classe
     */
    public Category() {
        this.id = 0;
        this.title = "";
        this.state = true;
        this.color = "";
    }

    /**
     * Restituisce l'identificativo progressivo della categoria.
     *
     * @return Identificativo della categoria.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Imposta l'identificativo della categoria.
     *
     * @param id Intero rappresentante l'identificativo della categoria.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Restituisce il titolo della categoria.
     *
     * @return Titolo della categoria.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Imposta il titolo della categoria.
     *
     * @param title Stringa rappresentante il titolo della categoria.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Restituisce il colore associato della categoria.
     *
     * @return Colore della categoria.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Imposta il colore della categoria.
     *
     * @param color Stringa rappresentante il colore della categoria.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Restituisce lo stato alla categoria.
     *
     * @return Stato booleano della categoria.
     */
    public boolean getState() {
        return this.state;
    }

    /**
     * Imposta lo stato della categoria.
     *
     * @param state Booleano rappresentante lo stato della categoria.
     */
    public void setState(boolean state) {
        this.state = state;
    }
}
