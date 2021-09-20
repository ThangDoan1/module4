package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
  /* Cach 1*/
    @GetMapping("/sandwich")
    public String Sandwich() {
        return "index";
    }

    @PostMapping("/sandwich")
    public String save(@RequestParam("condiment") String[] condiment, Model model) {
        String result = "";
        for (int i = 0; i < condiment.length; i++) {
            if (!condiment[i].equals("") && condiment[i] != null) {
                result += condiment[i] + " ";

                model.addAttribute("condiment", result);
            }
        }
        return "sandwich";
    }

    /*Cach 2*/

//    @GetMapping("/sandwich")
//    public String sandwich(){
//        return "index";
//    }
//
//    @PostMapping("/sandwich")
//    public String save(@RequestParam(name ="condiment") String condiment, Model model) {
//        model.addAttribute("condiment", condiment);
//        return "sandwich";
//    }
}
