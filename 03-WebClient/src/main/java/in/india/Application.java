package in.india;
import in.india.service.QuoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        QuoteService bean = context.getBean(QuoteService.class);
//        bean.getRandomQuote1();
//        System.out.println("===========================================");
        bean.getRandomQuote3();
    }
}


