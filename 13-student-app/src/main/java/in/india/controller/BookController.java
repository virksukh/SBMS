package in.india.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @GetMapping("/books")
    public String bookC(Model model) {
        int i = 10 /0 ;
        model.addAttribute("msg", "Books");
        return "welcome";
    }
}


