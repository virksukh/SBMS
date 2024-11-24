package in.india.service;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MsgService {

    private static final String PROVIDER_URL = "https://api.restful-api.dev/objects";

    public void getMsg(){

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> forEntity = restTemplate.getForEntity(PROVIDER_URL, String.class);
        System.out.println(forEntity.getStatusCode());
        System.out.println(forEntity.getBody());
    }
}
 