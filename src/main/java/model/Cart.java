package model;

public class Cart {
    private int id;
    private int idUser;
    private int idProduct;
    private String nameUser;
    private String nameProduct;
    private double totalPrice;
    private int quantity;
    private double price;

    public Cart(int idUser, int idProduct) {
        this.idUser = idUser;
        this.idProduct = idProduct;
    }

    public Cart(int idProduct) {
        this.idProduct = idProduct;
    }

    public Cart() {
    }

    public Cart(int id, int idUser, int idProduct, int quantity) {
        this.id = id;
        this.idUser = idUser;
        this.idProduct = idProduct;
        this.quantity = quantity;
    }

    public Cart(String nameUser, String nameProduct, Double totalPrice) {
        this.nameUser = nameUser;
        this.nameProduct = nameProduct;
        this.totalPrice = totalPrice;
    }

    public Cart( int idUser, int idProduct, String nameUser, String nameProduct, double totalPrice) {
        this.idUser = idUser;
        this.idProduct = idProduct;
        this.nameUser = nameUser;
        this.nameProduct = nameProduct;
        this.totalPrice = totalPrice;
    }



    public Cart(int id, int idUser, int idProduct, String nameUser, String nameProduct, double totalPrice, int quantity) {
        this.id = id;
        this.idUser = idUser;
        this.idProduct = idProduct;
        this.nameUser = nameUser;
        this.nameProduct = nameProduct;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
