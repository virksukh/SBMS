package in.india.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

    @GetMapping("/welcome")
    public String getWelcomeMsg() {
        return "Welcome to Spring Security, mehr kari Sache Patshah g";
    }

    @GetMapping("/greet")
    public String getGreeMsg() {
        return "Pain ho rha hai Sache Patshah g";
    }
}
