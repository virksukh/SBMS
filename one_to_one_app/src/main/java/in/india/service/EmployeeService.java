package in.india.service;
import in.india.entities.Address;
import in.india.entities.Employee;
import in.india.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public void getEmployee() {
        employeeRepo.findById(1);
    }

    public void save() {
        Address a1 = new Address();
        a1.setCity("hyderabad");
        a1.setCountry("India");
        a1.setType("present");

        Address a2 = new Address();
        a2.setCity("guntur");
        a2.setCountry("India");
        a2.setType("work");

        Employee e = new Employee();
        e.setEname("sukh");
        e.setEsalary(100.5);

        // associate emp object to address objects
        a1.setEmp(e);
        a2.setEmp(e);

        // associate addr objects with emp objects
        e.setAddresses(Arrays.asList(a1, a2));

        // save employee
        employeeRepo.save(e);
    }
}

