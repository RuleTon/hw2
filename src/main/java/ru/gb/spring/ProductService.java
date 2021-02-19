package ru.gb.spring;

import java.util.List;

public interface ProductService {
    void addProduct (Product product);
    void updateProduct (Product product);
    void removeProduct (Product product);
    List<Product> listProduct();
    Product getProductId (Long id);
}
