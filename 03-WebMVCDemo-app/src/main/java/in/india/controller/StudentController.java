package in.india.controller;
import in.india.entity.Student;
import in.india.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class StudentController {

    StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @PostMapping("saveStudent")
    public ModelAndView saveStudent(Student student){
        ModelAndView modelAndView = new ModelAndView();
        boolean isSaved = studentService.addStudent(student);
        if(isSaved){
            modelAndView.addObject("smsg", "Student added successfully");
        }else {
            modelAndView.addObject("emsg", "Student already exists");
        }
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("getData")
    public ModelAndView getAllStudents(){
        List<Student> allStudents = studentService.getStudents();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("allStudents", allStudents );
        modelAndView.setViewName("data");
        return modelAndView;
    }

    @GetMapping("/delete")
    public ModelAndView deleteStudent(@RequestParam("id") Integer id){
        ModelAndView modelAndView = new ModelAndView();
        studentService.deleteStudent(id);
        List<Student> allStudents = studentService.getStudents();
        modelAndView.addObject("allStudents", allStudents);
        modelAndView.addObject("message", "Student deleted successfully");
        modelAndView.setViewName("data");
        return modelAndView;
    }
}
