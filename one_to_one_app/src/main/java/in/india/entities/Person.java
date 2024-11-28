package in.india.entities;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String gender;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "person")
    private Passport passport;
}
