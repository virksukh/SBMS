package in.india.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MsgController {

    @GetMapping("/welcome")
    public String getWelcomeMsg(){
        return "Welcome to Spring Boot, love , good q ";
    }
}
