package service;

import dao.ProductDAO;
import model.Category;
import model.Product;

import java.util.List;

public class ProductService {
    static List<Product> productList = ProductDAO.findAll();
    static List<Category> categoryList = CategoryService.findAllCategory();

    public List<Product> findAllProduct() {
        productList = ProductDAO.findAll();
        for (Product product : productList) {
            for (Category category : categoryList) {
                if (product.getIdCategory() == category.getId())
                    product.setNameCategory(category.getName());
            }
        }
        return productList;
    }

    public void saveProduct(Product product) {
        ProductDAO.saveProduct(product);
        productList = ProductDAO.findAll();
    }

    public void updateProduct(int id, Product product) {
        ProductDAO.editProduct(id, product);
    }

    public void deleteProduct(int id) {
        ProductDAO.deleteProduct(id);
    }

    public List<Product> findProductByName(String nameFind) {
        productList = ProductDAO.findProductByName(nameFind);
        for (Product product : productList) {
            for (Category category : categoryList) {
                if (product.getIdCategory() == category.getId())
                    product.setNameCategory(category.getName());
            }
        }
        return productList;
    }

    public Product findById(int id) {
        productList = ProductDAO.findAll();
        for (Product product : productList) {
            if (product.getId() == id) {
                for (Category category : categoryList) {
                    if (product.getIdCategory() == category.getId())
                        product.setNameCategory(category.getName());
                }
                return product;
            }
        }
        return null;
    }


    public List<Product> sortUp() {
        productList = ProductDAO.sortUp();
        return productList;
    }

    public List<Product> sortDown() {
        productList = ProductDAO.sortDown();
        return productList;
    }
}
