package in.india.controller;
import in.india.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    public void save(){
        userService.userRegistration();
    }
}
