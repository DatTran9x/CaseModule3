package service;

import dao.ProductDAO;
import model.Product;
import model.User;

import java.util.List;

public class ProductService {
    static List<Product> productList = ProductDAO.findAll();

    public List<Product> findAllProduct() {
        return productList = ProductDAO.findAll();
    }

    public void saveProduct(Product product) {
        ProductDAO.saveProduct(product);
        productList = ProductDAO.findAll();
    }

    public void updateProduct(int id, Product product) {
        ProductDAO.editProduct(id,product);
    }

    public void deleteProduct(int id) {
        ProductDAO.deleteProduct(id);
    }

    public Product findProductById(int id) {
        return ProductDAO.findProductById(id);
    }

    public Product findById(int id) {
        for (Product product:productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public Product findProductByName(String name) {
        return ProductDAO.findProductByName(name);
    }
}
