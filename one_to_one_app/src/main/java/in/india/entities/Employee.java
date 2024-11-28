package in.india.entities;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eid;
    private String ename;
    private Double esalary;

    @OneToMany(mappedBy = "emp",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Address> addresses;
}
