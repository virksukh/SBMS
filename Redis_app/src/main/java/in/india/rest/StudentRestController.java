package in.india.rest;
import in.india.entity.Student;
import in.india.repo.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {

    @Autowired
    private StudentRespository studentRespository;

    @PostMapping("/student")
    public String addStdudent(@RequestBody Student student) {
        studentRespository.save(student);
        return "Student added successfully";
    }

    @GetMapping("/students")
    public Iterable<Student> getStudents() {
        return studentRespository.findAll();
    }


}
