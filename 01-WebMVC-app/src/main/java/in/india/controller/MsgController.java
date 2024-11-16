package in.india.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
    public MsgController() {
        System.out.println("MsgController constructor");
    }

    @GetMapping("/welcome")
    public ModelAndView getWelcomeMsg(){
        ModelAndView modelAndView = new ModelAndView();
        
        // setting the key and value pair
        modelAndView.addObject("msg","Welcome to Spring Boot");

        // setting the view name and from this view we can pass the key to get the value
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/greet")
    public ModelAndView getGreetMsg(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","Greetings from Spring Boot");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
