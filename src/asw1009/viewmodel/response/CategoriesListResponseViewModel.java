package asw1009.viewmodel.response;

import asw1009.model.entities.Category;
import java.util.List;

/**
 * View Model di risposta elenco categorie.
 *
 * @author ASW1009
 */
public class CategoriesListResponseViewModel extends BaseResponseViewModel {

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
