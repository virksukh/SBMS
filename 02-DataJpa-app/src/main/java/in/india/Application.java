package in.india;
import in.india.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        EmployeeService bean = context.getBean(EmployeeService.class);
        bean.getEmpByGenderAndSalaryGreaterThan("male",350000.0);
    }
}
