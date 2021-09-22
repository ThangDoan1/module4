package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/cal")
    public String getIndex() {
        return "index";
    }

    @PostMapping("/calculator")
    public String Calculator(@RequestParam(value = "number1") double num1, @RequestParam(value ="number2") double num2, @RequestParam String calculation, Model model) {
        double result = 0;
        if (calculation.equals("Additon(+)")) {
            result = num1 + num2;
        } else if (calculation.equals("Subtraction(-)")) {
            result = num1 - num2;
        } else if (calculation.equals("Multiplication(X)")) {
            result = num1 * num2;
        } else if(calculation.equals("Division(/)")) {
            result = num1/num2;
        }
        model.addAttribute("num1",num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", result);
        return "index";
    }
}
