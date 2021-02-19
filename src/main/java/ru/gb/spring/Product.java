package ru.gb.spring;

public class Product {
    private Long id;
    private String productName;
    private int cost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product(Long id, String productName, int cost) {
        this.id = id;
        this.productName = productName;
        this.cost = cost;

    }

    @Override
    public String toString() {
        return String.format("Product: [%d %s %d]", id, productName, cost);
    }


    public void remove(Product product) {
    }

    public void update(Product product) {
    }

    public void add(Product product) {
    }
}
