package ru.gb.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ProductController {
    private ProductService productService = new ProductServiceImpl();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getOrderPage(Model model) {
        return "product";
    }

}
