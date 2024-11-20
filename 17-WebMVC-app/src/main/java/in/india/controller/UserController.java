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
        User user = new User();
        model.addAttribute("user", user);
        return "index";
    }

    @PostMapping("/user")
    public String saveUser(Model model, User user) {
        boolean isSaved = userService.saveUser(user);
        if (isSaved) {
            model.addAttribute("message", "user saved successfully");
        }else {
            model.addAttribute("message", "user save failed");
        }
        return "index";
    }
}
