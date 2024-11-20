package in.india.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {

    @GetMapping("/welcome")
    public String getWelcomeMsg(Model model) {
        int i = 10 / 0;
        model.addAttribute("message", "welcome() method");
        return "index";
    }

    
    @GetMapping("/greet")
    public String getGreetMsg(Model model) {
        model.addAttribute("message", "greet() method");
        return "index";
    }
}
