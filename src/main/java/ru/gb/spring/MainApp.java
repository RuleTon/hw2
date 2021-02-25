package ru.gb.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductService productService = context.getBean("productService", ProductService.class);

        Scanner sc = new Scanner(System.in);
        String cmd = sc.nextLine();
        if (cmd.contains("get_products")) {
            System.out.println(productService.listProduct());
        }
        //add_procuts name cost
        if (cmd.contains("add_products")) {
            String[] sarray = cmd.split(" ");
            Product product = new Product(null, sarray[1], Integer.valueOf(sarray[2]));
            productService.addProduct(product);
        }


        context.close();
    }
}
