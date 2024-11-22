package in.india;
import com.fasterxml.jackson.databind.ObjectMapper;
import in.india.customer.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class, args);
        App app = new App();
        app.convertJavaToJson();
        app.convertJsonToJava();
    }
}
