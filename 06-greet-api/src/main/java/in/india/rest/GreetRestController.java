package in.india.rest;
import in.india.client.WelcomeFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

    @Autowired
    private  WelcomeFeignClient welcomeFeignClient;

    @GetMapping("/greet")
    public String getGreetMsg(){
        String welcomeMsg = welcomeFeignClient.getWelcomeMsg();
        String greetMsg = " greet api response ";
        return welcomeMsg + greetMsg;

    }
}
