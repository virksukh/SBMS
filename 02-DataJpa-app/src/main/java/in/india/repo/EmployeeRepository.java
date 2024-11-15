package in.india.repo;
import in.india.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    public List<Employee> findByEmpCountry(String username);
    public List<Employee> findByEmpSalaryGreaterThan(double salary);
    public List<Employee> findByEmpGender(String gender);
    public List<Employee> findByEmpGenderAndEmpSalaryGreaterThan(String gender, double salary);
}
