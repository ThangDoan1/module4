package controllers;

import model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

public class CustomerController {

    @GetMapping("/customers/{id}")
    public ModelAndView showInformation(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("customers/list");
        Customer customer =
    }
}
