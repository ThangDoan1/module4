package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.ProductService;
import service.impl.ProductServiceImpl;

import java.util.List;

@Controller
public class ProductController {

    private  ProductService productService = new ProductServiceImpl();

    @GetMapping("/products")
    public String getIndex(Model model) {
        List productList = productService.findAll();
        model.addAttribute("products", productList);
        return "/index";
    }


}
