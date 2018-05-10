package Controller;
import java.util.ArrayList;
import data.model.*;

public class CategoryControoler {
    public ArrayList<Category> getCategories(){
        ArrayList<Category> categories =  new ArrayList<Category>();
        Category category = new Category();
        category.setCategoryId(1);
        category.setCategoryName("Cardiologist");
        category.setCategoryId(2);
        category.setCategoryName("a");
        category.setCategoryId(2);
        category.setCategoryName("n");
        categories.add(category);

        return categories;
}
}
