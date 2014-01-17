package asw1009.responses;

import asw1009.model.entities.Category;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Risposta del servizio che elenca le categorie.
 *
 * @author ASW1009
 */
@XmlRootElement(name="data")
@XmlAccessorType(XmlAccessType.FIELD)
public class CategoriesListResponse extends BaseResponse {

    private List<Category> categories;

    /**
     * Restituisce l'elenco delle categorie presenti.
     * @return Lista di tipo entità Category contenenente le liste presenti.
     */
    public List<Category> getCategories() {
        return this.categories;
    }

    /**
     * Imposta l'elenco delle categorie presenti.
     * @param categories Lista contenente le categorie presenti.
     */
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

}
