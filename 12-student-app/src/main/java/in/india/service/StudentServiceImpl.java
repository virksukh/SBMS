package in.india.service;
import in.india.entity.Student;
import in.india.repo.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    private EmailService emailService;

    public StudentServiceImpl(StudentRepository studentRepository, EmailService emailService) {
        this.studentRepository = studentRepository;
        this.emailService = emailService;
    }

    @Override
    public boolean addStudent(Student student) {
        Student savedStudent = studentRepository.save(student);
        String subject = "New Student registered";
        String body = "success";
        emailService.sendSimpleMail(student.getEmail(), subject, body);
        return savedStudent.getId() != null;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(Integer studentId) {
        studentRepository.deleteById(studentId);
    }
}
