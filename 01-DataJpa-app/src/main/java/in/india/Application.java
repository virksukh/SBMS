package in.india;
import in.india.entity.Employee;
import in.india.repo.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        EmployeeRepository bean = context.getBean(EmployeeRepository.class);
        bean.findAll().forEach(System.out::println);
        System.out.println(bean.getClass().getName());
        System.out.println(context.getClass().getName());

        Employee employee = new Employee();
        employee.setEmpId(1);
        employee.setEmpName("Sukhdeep");
        employee.setEmpGender("Male");
        employee.setEmpSalary(32451.0);
        employee.setEmpCountry("Canada");
        bean.save(employee);
        System.out.println(bean.findById(1));
        System.out.println("************** Record Saves ***************");
    }
}
