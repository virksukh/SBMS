package in.india.entities;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String city;
    private String country;
    private String state;
    private String type;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee emp;
}
