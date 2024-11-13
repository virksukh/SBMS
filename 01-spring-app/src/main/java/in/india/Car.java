package in.india;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Car {
//     @Autowired
    Engine engine;

//    @Autowired
    public Car(Engine engine) {
        System.out.println("Car :: constructor ");
        this.engine = engine;
    }
    public void drive(){
        engine.start();
        System.out.println("Car is running, yo");
    }
}
