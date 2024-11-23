package in.india.binding;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Course_Dtls")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;
    private String name;
    private Double price;
}
