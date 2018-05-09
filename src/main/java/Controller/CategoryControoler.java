package Controller;
import java.util.ArrayList;
import data.model.*;

public class CategoryControoler {
    public ArrayList<Category> getCategories(){
        ArrayList<Category> categories =  new ArrayList<Category>();
        Category category = new Category();
        category.setCategoryId(1);
        category.setCategoryName("Cardiologist");
        categories.add(category);
        return categories;
}
}
