package asw1009.viewmodel.response;

import asw1009.model.entities.Category;
import asw1009.model.entities.User;
import java.util.List;


/**
 *
 * @author Andrea
 */
public class CategoriesListResponseViewModel extends BaseResponseViewModel {
    private List<Category> categories;
    
    public void setCategories(List<Category> categories){
        this.categories = categories;
    }
    
    public List<Category> getCategories(){
        return this.categories;
    }
}