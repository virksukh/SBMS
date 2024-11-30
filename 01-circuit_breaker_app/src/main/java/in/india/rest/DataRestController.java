package in.india.rest;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataRestController {

    @GetMapping("/data")
    @CircuitBreaker(name = "sukhi", fallbackMethod = "getDataFromDB")
    public String getDataFromRedis(){
        // logic to get data from Redis
        System.out.println("redis() method callled");
        int i = 10 / 0 ;
        return "************ retreived from Redis *******************";
    }

    public String getDataFromDB(Throwable throwable){
        // logic to get data from DB
        System.out.println("db() method callled");
        return "+++++++++++++++++++ retreived from DB +++++++++++++++++++++";
    }
}
