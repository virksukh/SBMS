package in.india.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @GetMapping("getmarks")
    public ModelAndView getStudentPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("student");
        modelAndView.addObject("marks", "total marks are 900");
        return modelAndView;
    }
}
