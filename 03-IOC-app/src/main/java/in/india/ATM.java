package in.india;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ATM {
//    @Autowired
    Printer printer;

    @Autowired
    public ATM(Printer printer) {
        this.printer = printer;
        System.out.println("ATM :: constructor");
    }
    public void withdraw(){
        printer.print();
        System.out.println(printer.hashCode());
    }
}
