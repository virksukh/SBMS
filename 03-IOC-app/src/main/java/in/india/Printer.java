package in.india;
import org.springframework.stereotype.Component;


@Component
public class Printer {
    public Printer() {
        System.out.println("Printer :: constructor");
    }
    public void print(){
        System.out.println("Printer :: print in progress");
    }
}
