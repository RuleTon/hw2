package ru.gb.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductService productService = context.getBean("productService", ProductService.class);

        Scanner sc = new Scanner(System.in);
        String cmd = sc.nextLine();
        if (cmd.contains("get")) {
            System.out.println(productService.listProduct());
        }
        //add_procuts name cost
        if (cmd.contains("add")) {
            String[] sarray = cmd.split(" ");
            Product product = new Product(null, sarray[1], Integer.valueOf(sarray[2]));
            productService.addProduct(product);
            System.out.println(productService.listProduct());
        }

        if (cmd.contains("delete")) {

            Scanner scanner = new Scanner("Delete product");
            Long l = scanner.nextLong();
            productService.removeProduct(Math.toIntExact(l));
            System.out.println(productService.listProduct());
        }

        if (cmd.contains("update")) {
         String[] sarray = cmd.split(" ");
         Product product = new Product(null, sarray[1], Integer.valueOf(sarray[2]));
         productService.updateProduct(product);
         System.out.println(productService.listProduct());
        }

        if (cmd.contains("average")) {
            System.out.println(productService.avgCostProducts());
        }

        if (cmd.contains("count")) {
            System.out.println(productService.countProducts());

        }





        context.close();
    }
}
