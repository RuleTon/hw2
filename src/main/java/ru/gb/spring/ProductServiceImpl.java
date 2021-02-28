package ru.gb.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public void addProduct(Product product) {
        if (product!=null) {
            List<Product> products = productRepository.getProducts();
            if(!products.isEmpty()) {
                product.setId(product.getId() + 1);
                productRepository.add(product);
            }
        }
    }

    @Override
    public void updateProduct(Product product) {
         productRepository.update(product);
    }

    @Override
    public void removeProduct(Integer id) {
        productRepository.remove();
    }

    @Override
    public List<Product> listProduct() {

        return productRepository.getProducts();
    }

    @Override
    public Product getProductId(Long id) {
        if (id!=null){
//         return productRepository.getProductId(id);
        }
        return null;
    }

    @Override
    public Integer countProducts() {

        return productRepository.count();
    }

    @Override
    public int avgCostProducts() {
        return productRepository.avgCalc();
    }




}
