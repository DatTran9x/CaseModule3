package service;

import dao.CategoryDAO;
import model.Category;

import java.util.List;

public class CategoryService {
    static List<Category> categoryList = CategoryDAO.findAll();

    public static List<Category> findAllCategory() {
        return categoryList = CategoryDAO.findAll();
    }
}
