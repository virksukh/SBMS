package in.india.client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "05-WELCOME-API")
public interface WelcomeFeignClient {

    @GetMapping("/welcome")
    public String getWelcomeMsg();
}
