package in.india;
import org.springframework.stereotype.Controller;

@Controller
public class Car {
    // @Autowired
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void drive(){
        engine.start();
        System.out.println("Car is running, yo");
    }
}
