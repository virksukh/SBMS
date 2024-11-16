package in.india.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    public ProductController() {
        System.out.println("ProductController constructor");
    }


    @GetMapping("/product")
    public ModelAndView getProductsPrice() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("price","Apple price is 65000");
        modelAndView.setViewName("products");
        return modelAndView;
    }
}
