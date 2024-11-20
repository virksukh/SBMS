package in.india.controller;
import in.india.exception.ProdcutNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    public String getProduct(@RequestParam("pid") Integer pid, Model model) {
        if(pid ==1){
            model.addAttribute("msg","Apple Price is 2 lacs");
        }else{
            throw new ProdcutNotFoundException("no record foundXXXX");
        }
        return "welcome";
    }
}
