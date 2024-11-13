package in.india;
import org.springframework.stereotype.Service;

@Service
public class Engine {
    public Engine() {
        System.out.println("Engine :: constuctor executer.... ");
    }
    public int start(){
        System.out.println("Engine :: started ");
        return 0;
    }
}
