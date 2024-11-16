package in.india.service;
import in.india.entity.Student;
import in.india.repo.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public void saveStudent(){
        Student student = new Student();
        student.setId(2);
        student.setName("Gosling");
        student.setEmail("gosling@gmail.com");
        student.setPhone(35463546L);
        studentRepository.save(student);
    }
    public List<Student> loadStudents(){
        return studentRepository.findAll();
    }
}
