package in.india.service;
import in.india.entity.Employee;
import in.india.repo.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        System.out.println("Employee Repository constructor");
    }

   public void saveEmployee() {
        Employee employee = new Employee();
        employee.setEmpId(4);
        employee.setEmpName("Robin");
        employee.setEmpGender("Male");
        employee.setEmpCountry("India");
        employee.setEmpSalary(42343.0);
        employeeRepository.save(employee);
        System.out.println("************ Record Saved **************");
   }

   public void getAllEmployees() {
        employeeRepository.findAll().forEach(System.out::println);
   }

   public void getEmployeeByCountry(String country) {
       List<Employee> list = employeeRepository.findByEmpCountry(country);
       list.forEach(System.out::println);
   }
   public void getEmpBySalaryGreaterThan(double salary) {
        List<Employee> list = employeeRepository.findByEmpSalaryGreaterThan(salary);
        list.forEach(System.out::println);
   }
   public void getEmpByGender(String gender) {
        List<Employee> list = employeeRepository.findByEmpGender(gender);
        list.forEach(System.out::println);
   }
   public void getEmpByGenderAndSalaryGreaterThan(String gender, double salary) {
        List<Employee> list = employeeRepository.findByEmpGenderAndEmpSalaryGreaterThan(gender, salary);
        list.forEach(System.out::println);
   }
}

