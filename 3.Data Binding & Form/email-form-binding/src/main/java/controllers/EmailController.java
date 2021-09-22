package controllers;

import model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("email", new Email());
        return "form";
    }

    @PostMapping("/result")
    public String showResult(@ModelAttribute("email") Email email,Model model) {
        model.addAttribute("languages", email.getLanguages());
        model.addAttribute("pageSize", email.getPageSize());
        model.addAttribute("spamsFilter", email.getSpamsFilter());
        model.addAttribute("signature", email.getSignature());
        return "result";
    }
}
