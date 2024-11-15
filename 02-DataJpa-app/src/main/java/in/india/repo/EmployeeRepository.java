package in.india.repo;
import in.india.entity.Employee;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value = "select * from employee where emp_gender='male' and " +
            "emp_country='canada'  and employee.emp_salary > 350000",nativeQuery = true)
    public List<Employee> findMaleAndCanadaResidentSalaryGreaterThanEqual();
}
