package in.india.service;
import in.india.entity.Student;
import java.util.List;

public interface StudentService {
    public boolean addStudent(Student student);
    public List<Student> getStudents();
    public void deleteStudent(Integer id);
}
