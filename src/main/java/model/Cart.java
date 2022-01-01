package model;

public class Cart {
    private int idUser;
    private int idProduct;
    private String nameUser;
    private String nameProduct;
    private double totalPrice;

    public Cart() {
    }

    public Cart(int idUser, int idProduct, String nameUser, String nameProduct, double totalPrice) {
        this.idUser = idUser;
        this.idProduct = idProduct;
        this.nameUser = nameUser;
        this.nameProduct = nameProduct;
        this.totalPrice = totalPrice;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
