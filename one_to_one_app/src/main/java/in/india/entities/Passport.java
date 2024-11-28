package in.india.entities;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer passportId;
    private String passportNumber;
    private LocalDate passportIssueDate;
    private LocalDate passportExpiryDate;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;
}
