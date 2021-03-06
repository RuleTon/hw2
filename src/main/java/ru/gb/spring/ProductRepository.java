package ru.gb.spring;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductRepository {
    private List<Product> products;
    private ProductRepository productRepository;


    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);

    }

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1L,"Egg",100));
        products.add(new Product(2L,"Apple",100));
        products.add(new Product(3L,"Tea",100));
        products.add(new Product(4L,"Melon",100));
        products.add(new Product(5L,"Coffee",100));
        products.add(new Product(6L,"Bacon",100));
        products.add(new Product(7L,"Pork",100));
        products.add(new Product(8L,"Cod",100));
        products.add(new Product(9L,"Beet",100));
        products.add(new Product(10L,"Cartoon",100));





    }

    public void add(Product product) {
        if (product.getCost() < 0) {
            throw  new IllegalArgumentException("Cost must be above zero");
        }
        products.add(product);
    }

    public void update(Product product){
        products.forEach(
                product1 -> {
                    if(product1.getId().equals(product.getId())){
                        product1.setName(product.getName());
                        product1.setCost(product.getCost());
                    }
                }
        );
    }

    public void remove() {
        if (product.getId() <= 0) {
            throw new IllegalArgumentException("Id can't be less than zero");
        }
        products.remove(id);

    }

    public double average(ArrayList <Integer> products) {
        return products.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

    }

    public int avgCalc() {
        List<Product> products = productRepository.getProducts();
        if (products.size() == 0) { return  0;}
        int avg = 0;
        for (Product p : products) {avg += p.getCost();}
        avg /= products.size();
        return avg;
    }




    public int count() {
        return products.size();
    }


}
