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




/*
@Service
public class StudentServiceImpl  implements StudentService {
    private StudentRepository studentRepository;
    private EmailService emailService;

    public StudentServiceImpl(StudentRepository studentRepository, EmailService emailService) {
        this.studentRepository = studentRepository;
        this.emailService = emailService;
    }

    @Override
    public boolean saveStudent(Student student) {
        String subject = "New Student registration";
        String body = "<h1>Just keep on going bro.. it will work out</h1><br><h3>love yourself</h3>";
        Student savedStudent = studentRepository.save(student);
        emailService.sendMimeEmail(student.getEmail(),subject,body);
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
}*/

