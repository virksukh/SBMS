package in.india;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

    private static final String PROVIDER_URL = "http://classes.ashokit.in/welcome";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
