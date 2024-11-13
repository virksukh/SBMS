package in.india;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ATM {
//    @Autowired
    Printer printer;
//
    public ATM(){
        System.out.println("ATM :: 0 -  param constructor");
    }

    @Autowired
    public ATM(Printer p) {
        this.printer = p;
        System.out.println("ATM :: constructor");
    }

//    @Autowired
    public void setPrinter(Printer printer) {
        this.printer = printer;
        System.out.println("ATM :: setPrinter");
    }

    public void withdraw(){
        printer.print();
        System.out.println(printer.hashCode());
    }
}
