package in.india.controller;
import in.india.entity.Student;
import in.india.service.StudentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class StudentController {
    StudentServiceImpl studentService;
    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    // method to display empty form data
    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
    // method to save a student
    @PostMapping("/saveStudent")
    public ModelAndView saveStudent(Student student){
        ModelAndView modelAndView = new ModelAndView();
        boolean isSaved = studentService.saveStudent(student);
        if(isSaved){
            modelAndView.addObject("smsg","student saved successfully");
        }else {
            modelAndView.addObject("emsg","student save failed");
        }
        modelAndView.setViewName("index");
        return modelAndView;
    }
    // method to show all the students
    @GetMapping("getData")
    public ModelAndView getAllStudents(){
        ModelAndView modelAndView = new ModelAndView();
        List<Student> allStudents = studentService.getAllStudents();
        modelAndView.addObject("allStudents", allStudents);
        modelAndView.setViewName("data");
        return modelAndView;
    }
    // method to delete a record
    @GetMapping("/delete")
    public ModelAndView deleteStudent(@RequestParam("id") Integer id){
        ModelAndView modelAndView = new ModelAndView();
        studentService.deleteStudent(id);
        List<Student> allStudents = studentService.getAllStudents();
        modelAndView.addObject("allStudents", allStudents);
        modelAndView.addObject("msg", "record deleted successfully");
        modelAndView.setViewName("data");
        return modelAndView;
    }
}
