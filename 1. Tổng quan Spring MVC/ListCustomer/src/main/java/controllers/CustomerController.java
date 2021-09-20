package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/customers")
@Controller
public class CustomerController {
    @GetMapping("/")
    public String showList() {
        return "customers/list";
    }
}