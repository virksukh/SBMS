package in.india.controller;
import in.india.entity.User;
import in.india.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/save")
    public String saveUser(User user,Model model) {
        boolean isSaved = userService.saveUser(user);
        if (isSaved) {
            model.addAttribute("message", "user saved successfully");
        }else {
            model.addAttribute("message", "user not saved");
        }
        return "index";
    }
}




