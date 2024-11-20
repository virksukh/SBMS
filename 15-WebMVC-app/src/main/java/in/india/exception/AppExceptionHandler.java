package in.india.exception;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {
    Logger logger = LoggerFactory.getLogger(AppExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, Model model) {
        logger.error(e.getMessage());
        model.addAttribute("message", e.getMessage());
        return "error";
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public String handleProductException(ProductNotFoundException e, Model model) {
        logger.error(e.getMessage());
        model.addAttribute("message", e.getMessage());
        return "error";
    }

}



