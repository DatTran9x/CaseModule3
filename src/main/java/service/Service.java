package service;

import model.Product;
import model.User;

import java.util.List;

public class Service implements iService {
    @Override
    public void addUser(User user) {

    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public List<User> getUserList() {
        return null;
    }

    @Override
    public List<Product> getProductList() {
        return null;
    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public Product getProduct(int id) {

        return null;
    }

    @Override
    public User editUser(String name, String phoneNumber, int id) {

        return null;
    }

    @Override
    public User editAccount(String username, String password, int id) {
        return null;
    }

    @Override
    public void editProduct(Product product, int id) {

    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public void deleteProduct(int id) {

    }
}
