package in.india.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {

    Logger logger = LoggerFactory.getLogger(MsgController.class);

    @GetMapping("/welcome")
    public String getWelcomeMsg(Model model) {
        int i = 10 / 0;
        model.addAttribute("msg", "Welcome to Spring Boot");
        return "welcome";
    }

    @GetMapping("/greet")
    public String getGreetMsg(Model model) {
        model.addAttribute("msg", "Welcome to Spring Boot");
        return "welcome";
    }
}
