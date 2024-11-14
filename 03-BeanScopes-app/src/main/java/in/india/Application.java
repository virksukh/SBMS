package in.india;
import in.india.dao.UserDao;
import in.india.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        UserService bean = context.getBean(UserService.class);
        UserService bean1 = context.getBean(UserService.class);
        System.out.println(bean.hashCode());
        System.out.println(bean1.hashCode());


    }
}
