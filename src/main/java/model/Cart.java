package model;

public class Cart {
    private int id;
    private int idUser;
    private int idProduct;
    private String nameUser;
    private String nameProduct;
    private double totalPrice;
    private int quantity;

    public Cart() {
    }

    public Cart(int idUser, int idProduct, String nameUser, String nameProduct, double totalPrice) {
        this.idUser = idUser;
        this.idProduct = idProduct;
        this.nameUser = nameUser;
        this.nameProduct = nameProduct;
        this.totalPrice = totalPrice;
    }

    public Cart(String nameUser, String nameProduct, Double totalPrice,int quantity) {
        this.nameUser = nameUser;
        this.nameProduct = nameProduct;
        this.totalPrice = totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
