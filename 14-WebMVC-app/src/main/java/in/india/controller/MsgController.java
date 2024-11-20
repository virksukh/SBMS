package in.india.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MsgController {

    public String getWelcomeMsg(Model model) {
        model.addAttribute("message", "Welcome to Spring Boot");
        return "index";
    }
}
