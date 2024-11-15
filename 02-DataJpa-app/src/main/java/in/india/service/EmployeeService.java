package in.india.service;
import in.india.entity.Employee;
import in.india.repo.EmployeeRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    private static final int pageSize = 3;
    EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        System.out.println("Employee Repository constructor");
    }

    public void saveEmployee() {
        Employee employee = new Employee();
        employee.setEmpId(7);
        employee.setEmpName("Amanda");
        employee.setEmpCountry("UK");
        employee.setEmpGender("Female");
        employee.setEmpSalary(4536543.3546);
        employeeRepository.save(employee);
    }

    public void getEmps(int pageNum) {
        Pageable pageable = PageRequest.of(pageNum -1, pageSize);
        employeeRepository.findAll(pageable).forEach(System.out::println);
    }

    public void getEmpsQBE(Employee employee) {
        Example<Employee> employeeExample = Example.of(employee);
        List<Employee> employees = employeeRepository.findAll(employeeExample);
        employees.forEach(System.out::println);
    }

    /*public void getEmpsQBE() {
        employeeRepository.findMaleAndCanadaResidentSalaryGreaterThanEqual().forEach(System.out::println);
    }*/
}



