package in.india.controller;
import in.india.entity.Student;
import in.india.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/savestudent")
    public ModelAndView addStudent(Student student){
        ModelAndView modelAndView = new ModelAndView();
        boolean isSaved = studentService.addStudent(student);
        if(isSaved){
            modelAndView.addObject("message", "Student added successfully");
        }else {
            modelAndView.addObject("message", "Student already exists");
        }
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("getdata")
    public ModelAndView getAllStudents(){
        ModelAndView modelAndView = new ModelAndView();
        List<Student> allStudents = studentService.getAllStudents();
        modelAndView.addObject("students", allStudents);
        modelAndView.setViewName("data");
        return modelAndView;
    }
}
