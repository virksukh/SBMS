package in.india.controller;
import in.india.entity.Student;
import in.india.service.StudentService;
import in.india.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @PostMapping("/saveStudent")
    public ModelAndView addStudent(Student student){
        ModelAndView modelAndView = new ModelAndView();
        boolean isSaved = studentService.addStudent(student);
        if(isSaved){
            modelAndView.addObject("smsg", "Student added successfully");
        }
        else{
            modelAndView.addObject("emsg", "Student already exists");
        }
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/getData")
    public ModelAndView getStudents(){
        ModelAndView modelAndView = new ModelAndView();
        List<Student> allStudents = studentService.getAllStudents();
        modelAndView.addObject("students", allStudents);
        modelAndView.setViewName("data");
        return modelAndView;
    }


    @GetMapping("/delete")
    public ModelAndView deleteStudent(@RequestParam("id") Integer id){
        studentService.deleteStudent(id);
        ModelAndView modelAndView = new ModelAndView();
        List<Student> allStudents = studentService.getAllStudents();
        modelAndView.addObject("students", allStudents);
        modelAndView.addObject("smsg", "Student deleted successfully");
        modelAndView.setViewName("data");
        return modelAndView;
    }
}

