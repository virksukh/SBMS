package in.india.controller;
import in.india.exception.ProductNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    @GetMapping("/product")
    public String getProduct(@RequestParam("pid") Integer pid,Model model) {
        if(pid == 1){
            model.addAttribute("message", "Apple costs 2 lacs");
        }else{
            throw new ProductNotFoundException("no record found");
        }
        return "index";
    }
}
