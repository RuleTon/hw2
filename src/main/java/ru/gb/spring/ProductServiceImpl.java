package ru.gb.spring;

import java.util.List;

public class ProductServiceImpl implements ProductService{
    private ProductService productService = new ProductServiceImpl();





    @Override
    public void addProduct(Product product) {
        if (product!=null) {
            List<Product> products = productService.listProduct();
            if(!products.isEmpty()) {
                product.setId(product.getId() + 1);
                productService.addProduct(product);

            }

        }

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void removeProduct(Product product) {
        if(product!=null) {
            productService.removeProduct(product);
        }

    }

    @Override
    public List<Product> listProduct() {
        return productService.listProduct();
    }

    @Override
    public Product getProductId(Long id) {
        if (id!=null){
         return productService.getProductId(id);
        }
        return null;
    }
}
