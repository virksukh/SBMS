package in.india.service;
import in.india.entity.Student;
import java.util.List;

public interface StudentService {

    public boolean saveStudent(Student student);
    public List<Student> getAllStudents();
    public void deleteStudent(Integer id);
}
