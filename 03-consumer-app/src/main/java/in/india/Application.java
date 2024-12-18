package in.india;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

    private static final String PROVIDER_URL = "https://api.restful-api.dev/objects";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> forEntity = restTemplate.getForEntity(PROVIDER_URL, String.class);
        System.out.println(forEntity.getBody());
        System.out.println(forEntity.getStatusCode());
    }
}
