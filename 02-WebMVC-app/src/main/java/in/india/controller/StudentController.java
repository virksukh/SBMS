package in.india.controller;
import in.india.entity.Student;
import in.india.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void registerStudent() {
        studentService.saveStudent();
    }

    @GetMapping("/learn")
    public ModelAndView getStudents() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","Spring Boot is smooth");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/getstudents")
    public ModelAndView getStudentsOnConsole() {
        List<Student> studentsList = studentService.loadStudents();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("studs",studentsList);
        modelAndView.setViewName("students");
        return modelAndView;
    }
}
