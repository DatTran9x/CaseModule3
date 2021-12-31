package service;

import model.Product;
import model.User;

import java.util.List;

public interface iService {

    void addUser(User user);

    void addProduct(Product product);

    List<User> getUserList();

    List<Product> getProductList();

    User getUser(int id);

    Product getProduct(int id);

    User editUser(String name, String phoneNumber, int id);

    User editAccount(String username, String password, int id);

    void editProduct(Product product, int id);

    void deleteUser(int id);

    void deleteProduct(int id);
}
