package in.india.binding;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "COURSE_DTLS")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double price;
}

