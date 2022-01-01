package model;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String motasp;
    private boolean status;
    private String img;
    private String nameCategory;
    private int idCategory;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity, String motasp, boolean status, String img) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.motasp = motasp;
        this.status = status;
        this.img = img;
    }

    public Product(int id, String name, double price, int quantity, String motasp, boolean status, String img, int idCategory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.motasp = motasp;
        this.status = status;
        this.img = img;
        this.idCategory = idCategory;
    }

    public Product(int id, String name, double price, int quantity, String motasp, boolean status, String img, String nameCategory, int idCategory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.motasp = motasp;
        this.status = status;
        this.img = img;
        this.nameCategory = nameCategory;
        this.idCategory = idCategory;
    }

    public Product(String name, double price, int quantity, String motasp, boolean status, String img, int idCategory) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.motasp = motasp;
        this.status = status;
        this.img = img;
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMotasp() {
        return motasp;
    }

    public void setMotasp(String motasp) {
        this.motasp = motasp;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
