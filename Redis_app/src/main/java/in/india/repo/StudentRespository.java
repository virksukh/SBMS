package in.india.repo;
import in.india.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRespository extends CrudRepository<Student, Integer> {


}
