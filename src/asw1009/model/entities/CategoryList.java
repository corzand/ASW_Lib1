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
 * Classe utilizzata nella serializzazione/deserializzazione delle Categorie
 * su file xml.
 * @author Andrea
 */
@XmlRootElement(name = "Categories")
@XmlAccessorType(XmlAccessType.FIELD)
public class CategoryList {

    @XmlElement(name = "Category", type = Category.class)
    private List<Category> categories;
    private int progId;

    /**
     * Costruttore di default per l'oggetto, inizializza il progressivo a zero e 
     * l'array vuoto
     */
    public CategoryList() {
        this.progId = 0;
        this.categories = new ArrayList<>();
    }

    /**
     * Restituisce la lista delle categorie
     * @return lista categorie
     */
    public List<Category> getList() {
        return categories;
    }

    /**
     * Setta la lista delle categorie
     * @param categories lista delle categorie
     */
    public void setList(List<Category> categories) {
        this.categories = categories;
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
