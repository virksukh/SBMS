package in.india.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Spring Securit";
    }

    @GetMapping("/greet")
    public String greet(){
        return "good mornign";
    }
}
