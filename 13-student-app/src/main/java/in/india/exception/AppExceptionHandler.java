package in.india.exception;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class AppExceptionHandler {
    Logger logger = LoggerFactory.getLogger(AppExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    public String handleException(Exception e) {
        logger.error(e.getMessage());
        return "error";
    }

    /*@ExceptionHandler(value = NullPointerException.class)
    public String handleException(NullPointerException e) {
        logger.error(e.getMessage());
        return "error";
    }

    @ExceptionHandler(value = SQLException.class)
    public String handleException(SQLException e){
        logger.error(e.getMessage());
        return "error";
    }*/

    @ExceptionHandler(value = ProdcutNotFoundException.class)
    public String handleException(ProdcutNotFoundException e, Model model) {
        logger.error(e.getMessage());
        model.addAttribute("msg", "no product found");
        return "error";
    }
}
