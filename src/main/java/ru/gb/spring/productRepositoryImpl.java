package ru.gb.spring;

import java.util.ArrayList;
import java.util.List;

public class productRepositoryImpl implements ProductInterface{


    private List<Product> product = new ArrayList<Product>();

    public productRepositoryImpl() {

        product.add(new Product(1L,"Egg",100));
        product.add(new Product(2L,"Apple",100));
        product.add(new Product(3L,"Tea",100));
        product.add(new Product(4L,"Melon",100));
        product.add(new Product(5L,"Coffee",100));
        product.add(new Product(6L,"Bacon",100));
        product.add(new Product(7L,"Pork",100));
        product.add(new Product(8L,"Cod",100));
        product.add(new Product(9L,"Beet",100));
        product.add(new Product(10L,"Cartoon",100));

    }

    @Override
    public void addProduct(Product product) {
        product.add(product);

    }

    @Override
    public void updateProduct(Product product) {
        product.update(product);

    }

    @Override
    public void removeProduct(Product product) {
        product.remove(product);

    }

    @Override
    public List<Product> listProduct() {
        return product;
    }

    @Override
    public Product getProductId(Long id) {
        return product.get(Math.toIntExact(id));
    }
}
