package in.india;
import in.india.entity.Employee;
import in.india.repo.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        EmployeeRepository bean = context.getBean(EmployeeRepository.class);

       /* bean.findAll().forEach(System.out::println);
        System.out.println(bean.getClass().getName());
        System.out.println(context.getClass().getName());*/

        Employee employee = new Employee();
        employee.setEmpId(1);
        employee.setEmpName("Sukhdeep");
        employee.setEmpGender("Male");
        employee.setEmpSalary(354634.0);
        employee.setEmpCountry("Canada");

        Employee employee2 = new Employee();
        employee2.setEmpId(2);
        employee2.setEmpName("Aman");
        employee2.setEmpGender("Female");
        employee2.setEmpSalary(3456.0);
        employee2.setEmpCountry("Canada");

        Employee employee3 = new Employee();
        employee3.setEmpId(3);
        employee3.setEmpName("Roman");
        employee3.setEmpGender("Male");
        employee3.setEmpSalary(3456789.0);
        employee3.setEmpCountry("Canada");

        Employee employee4 = new Employee();
        employee4.setEmpId(4);
        employee4.setEmpName("Robin");
        employee4.setEmpGender("Male");
        employee4.setEmpSalary(2345234.0);
        employee4.setEmpCountry("India");

        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);

        bean.saveAll(list);
        bean.findAll().forEach(System.out::println);

        Optional<Employee> byId = bean.findById(3);
        if(byId.isPresent()) {
            System.out.println(byId.get().getEmpName());
        }else{
            System.out.println("Employee not found");
        }
        System.out.println("************** Record Saves ***************");
    }
}
