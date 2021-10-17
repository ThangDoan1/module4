package thang.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import thang.demo.Model.Count;

@Controller
@SessionAttributes("mycount")
public class CountController {

    @ModelAttribute("mycount")
    public Count setUpCount(){
        return new Count();
    }

    @GetMapping("/")
    public String get(@ModelAttribute("mycount") Count count ){
        count.increment();
        return "index";
    }
}
