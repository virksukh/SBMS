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
       modelAndView.setViewName("index");
       modelAndView.addObject("msg", "welcom to Spring Boot,ouo");
       return modelAndView;
   }

   @GetMapping("/greet")
   public ModelAndView getGreetMsg(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("msg", "Hello Spring Boot");
        return modelAndView;
   }
}
