package in.india.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

    @GetMapping("/welcome")
    public String getWelcomeMsg(){
        return "Welcome to Spring Boot REST API!";
    }

    @GetMapping("/greet")
    public String getGreetMsg(){
        return "Good morning";
    }
}
