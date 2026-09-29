import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private ArrayList<Category> categories;
    public void addCategory(Category category) {
        categories.add(category);
    }
    public void removeCategory(Category category) {
        categories.remove(category);
    }

    public List<Category> getCategories() {
        return categories;
    }
}
