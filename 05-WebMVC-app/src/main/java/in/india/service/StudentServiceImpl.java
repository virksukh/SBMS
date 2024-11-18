package in.india.service;
import in.india.entity.Student;
import in.india.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public boolean addStudent(Student student) {
        Student savedStudent = studentRepository.save(student);
        return savedStudent.getId() != null;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}



